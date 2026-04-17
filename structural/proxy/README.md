# 代理模式(Proxy Pattern)

1. 代理模式的核心定義

    **代理模式的定義：** 為另一個物件提供一個替身（Surrogate）或佔位符（Placeholder），以控制對這個物件的存取。

    你可以把代理人想像成系統中的「關卡」或「經紀人」。當客戶端（Client）想要呼叫某個物件（RealSubject）時，它不直接跟該物件溝通，而是透過代理物件（Proxy）來傳達。

    ```text
        請求 (Request)
    [Client] ----------------> [ Subject 介面 ]
                                    ^
                                    | 實作
                    +---------------+---------------+
                    |                               |
            [ Proxy (代理) ] ------------> [ RealSubject (真實物件) ]
                    |           委派呼叫            |
        (負責: 網路通訊/權限檢查/快取等)      (負責: 真正執行核心業務邏輯)
    ```

   Proxy 與 RealSubject 都實作了相同的 `Subject` 介面，所以對 Client 來說，它根本感覺不到自己是在跟 Proxy 講話，還是跟真實物件講話。
   
   > 代理模式可以建立代表物件，用來控制對另一個物件的接觸，另一個物件可能在遠端、或建造成本高昂，或需要做安全控管。

2. 代理模式的三大應用場景

    * 遠端代理 (Remote Proxy)
        * **應用場景：** 控制對「遠端物件」的存取（例如微服務架構中的 RPC/RMI 通訊）。
        * 當物件存在於不同的 JVM 或不同的伺服器記憶體中，我們不能直接呼叫它。遠端代理扮演*本地代表*的角色，它攔截客戶端的本地呼叫，將其打包成網路封包，透過網路傳送給伺服器端的接收者（Skeleton/Service Helper），再將結果回傳-。
        * **優點：** 將複雜的網路通訊、例外處理（如斷線、Timeout）隱藏起來，讓客戶端寫扣就像在呼叫本地端物件一樣。

    * 虛擬代理 (Virtual Proxy)
        * **應用場景：** 控制對「創建成本高昂的物件」的存取（延遲載入 Lazy Loading）。
        * 作為系統工程師，我們很怕浪費記憶體與 CPU 去建立使用者根本還沒看到的圖檔或複雜運算。虛擬代理會先「假裝」這個物件存在，只有當使用者真正需要（例如滾動到該圖片）時，代理才會去實例化真實的物件。

    * **程式碼範例 (圖片延遲載入)：**
        假設我們要從網路下載大張專輯封面。

        ```java
        class ImageProxy implements Icon {
            private ImageIcon imageIcon; // 真實物件 (創建成本高)
            private URL imageURL;
            private boolean retrieving = false;

            public ImageProxy(URL url) { this.imageURL = url; }

            public void paintIcon(Component c, Graphics g, int x, int y) {
                if (imageIcon != null) {
                    // 如果圖片已經下載好，直接委派給真實物件去畫
                    imageIcon.paintIcon(c, g, x, y);
                } else {
                    // 圖片還沒好之前，代理物件先給個友善提示
                    g.drawString("圖片載入中，請稍候...", x, y);
                    
                    if (!retrieving) {
                        retrieving = true;
                        // 開啟一個非同步執行緒去遠端下載，避免卡死主執行緒 (UI Thread)
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    imageIcon = new ImageIcon(imageURL, "Album Cover");
                                    c.repaint(); // 下載完成，觸發畫面重繪
                                } catch (Exception e) { e.printStackTrace(); }
                            }
                        }).start();
                    }
                }
            }
        }
        ```

    * 保護代理 (Protection Proxy) 與動態代理 (Dynamic Proxy)
        * **應用場景：** 基於呼叫者的「權限」來決定是否放行存取。在系統安全與 RBAC (角色基礎存取控制) 經常使用。
        * Java 內建了強大的反射機制 (`java.lang.reflect.Proxy`)，能在執行時期「動態」產生代理類別，這稱為**動態代理**。
        * **程式碼範例 (約會網站權限控管)：**
            規定：自己可以修改個人資料，但不能亂改自己的「阿宅評分(Geek Rating)」；別人不能改你的資料，但可以幫你打評分。

            ```java
            import java.lang.reflect.*;

            // 透過 InvocationHandler 處理攔截邏輯 (這是給「本人」用的權限處理器)
            public class OwnerInvocationHandler implements InvocationHandler {
                Person person; // 真實物件
                
                public OwnerInvocationHandler(Person person) {
                    this.person = person;
                }

                // 所有對 Proxy 的方法呼叫，都會統一進入這個 invoke() 函式
                public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
                    try {
                        if (method.getName().startsWith("get")) {
                            // 允許本人查詢任何資料
                            return method.invoke(person, args);
                        } else if (method.getName().equals("setGeekRating")) {
                            // 拒絕！本人不允許自己給自己打分數
                            throw new IllegalAccessException("你不能修改自己的評分！");
                        } else if (method.getName().startsWith("set")) {
                            // 允許本人修改其他個人資料
                            return method.invoke(person, args);
                        }
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            }
            ```

            接著，我們透過 Java 的 `Proxy.newProxyInstance` 在執行期把這個 Handler 綁定到真實物件上，產生安全的 Proxy 物件-。

3. 常見的混淆：Proxy vs. Decorator (代理 vs. 裝飾者)

    這兩者結構長得幾乎一樣（都是包裝另一個物件），但**意圖（Intent）完全不同**：

    * **Decorator (裝飾者模式)：** 著重於為物件**動態加上新的行為或功能**（例如幫咖啡加上摩卡的價格與敘述）。
    * **Proxy (代理模式)：** 著重於**控制對物件的存取**（例如檢查權限、網路傳輸、延遲載入）。它通常不會改變原本物件的行為，而是管理客戶端能不能/何時能呼叫到真實物件。

4. 總結

   代理模式的本質就是在客戶端與實際資源之間加入一個「中介層（Indirection Layer）」。藉由這個中介層，輕鬆掛載**快取代理 (Caching Proxy)** 來節省昂貴的資料庫運算、使用**防火牆代理 (Firewall Proxy)** 來抵擋惡意請求，或透過**同步代理 (Synchronization Proxy)** 確保多執行緒安全-。

   這也是為何代理模式是在構建現代複雜、分散且安全的高併發系統時，最不可或缺的底層設計模式之一。

   Java 框架的一些代理模式的示例：

   * java.lang.reflect.Proxy
   * java.rmi.*
   * javax.ejb.EJB （查看评论）
   * javax.inject.Inject （查看评论）
   * javax.persistence.PersistenceContext
