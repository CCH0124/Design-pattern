# 設計模式

設計模式事對軟體設計中普遍存在（反覆出現）的各種問題，所提出的解決方案。軟體必要有擴展性、可讀性、規範性等。
編寫軟體過程中，面對耦合性、內聚性、可維護、可擴展、重用性、靈活性等挑戰。

- 重用性
    - 同一個功能不必多寫
- 可讀性
    - 規範
- 可擴展
    - 新增功能時，非常容易
- 可靠性
    - 增加新功能，對原來功能不影響
- 高內聚、低耦合

## 七大設計原則

設計模式遵守以下原則
- 單一職責原則
    - 一個類一項職責
    - 不讓不同模組相互影響
    - 降低類複雜度，一個類一個職責
    - 提高類的可讀性可維護性
    - 降低更改風險
    - 邏輯夠簡單可違反，類中方法足夠少可在方法上實現單一職責
- 接口隔離原則（Interface Segregation Principle）
    - 客戶端不應該依賴它不需要的接口，即一個類對另一個類的依賴應該建立在最小接口上
- 依賴倒轉原則（Dependence Inversion Principle）
    - 高層模組不應該依賴低層模組，兩者都應該依賴其抽象
    - 抽象不應該依賴細節，細節應該依賴抽象
    - 核心思想是面向接口編程
    - 相對於細節的多變性，抽象的東西要穩定多。
        - 以抽象搭建的架構比細節為基礎的架構要穩定的多
        - 抽象指的是 interface 或 abstract，細節是具體實現類
    - 接口和抽象的目的就是制定規範，而不涉及任何具體操作，把展現細節任務交給他們的實現類去完成
    - 變量宣告類型盡量是抽象類或接口，這樣我們的變量引用和實際物件間，就存在者一層緩衝，益於擴展和優化
- 里式替換原則（Liskov Substitution Principle）
    - 繼承時應該遵守
    - 繼承有些許弊端，如繼承鬼程序帶來侵入性，程序可移殖性降低，增加物件間的偶合性，父類的修改需要可慮繼承他的類別
    - 引用基類的地方能透明的使用其子類的物件
    - 盡量不重寫父類的方法
    - 繼承讓偶合性增強，適當情況下，可透過`聚合`、`組合`、`依賴`來解決問題
- 開閉原則（Oprn Closed Principle）
    - 一個軟體實體像是 `class`、`model`、`method` 應該對擴展開放，對修改關閉
        - 抽象建構框架
    - 軟體需變話時，盡量擴展（提供方）而不是透過修改（使用方）代碼實現
        - 新增方法，但對使用該方法的類不應該修改
    - 使用設計模式目的也是遵守該原則
- 迪米特原則（Demeter Principle）
    - 降低類之間的藕合，並非要求完全無依賴
    - 最少知道原則，一個類對自己依賴的類知道的越少越好
    - 只與直接朋友通訊
```java
B b;
public void m1(B b) {

}

public void m1() {
    B b = new b; // 此方式非直接朋友
}
```
- 合成復用原則（Composite Reuse Principle）
    - 盡量使用合成/聚合的方式，而非繼層
```java
// 繼層，耦合太高
class A {
    public void method(){};
    public void method2(){};
    public void method3(){};
}
class B extends A {
    
}
// 合成、依賴
class A {
    public void method(){};
    public void method2(){};
    public void method3(){};
}
class B {
    public void method3(A a){};
}
// 聚合
class A {
    public void method(){};
    public void method2(){};
    public void method3(){};
}
class B {
    A a;
    public void setA(A a){};
}
// 組合
class A {
    public void method(){};
    public void method2(){};
    public void method3(){};
}
class B {
    A a = new A();
}
```

### 設計原則核心
- 找出可能需要變化之處，並將他們獨立，不要和不需要變化代碼混合
- 面對*接口編程*，而不是針對*實現編程*
- 為了交互對象之間的鬆耦合設計

## UML 類圖
### Dependence
- 在類別中使用到對方，A 用到 B，A 依賴 B，沒 B 無法編譯通過
- 為類的成員屬性
- 為方法的返回類型
- 是方法接受參數類型
- 方法中使用到

### Generalization
- 簡單來說就是繼層關係，依賴關係的特例
- A 繼層 B，可說 A 和 B 存在 Generalization 關係

### Implementation
- A 實現 B，依賴關係的特例


### Association
- 類與類之間的關係，依賴關係的特例
- 具有導航性，雙向或單向關係
- 關係有多重性
    - 1 表示有，且僅有一個
    - 0... 表示 0 或多個
    - 0, 1 表示 0 或一個
    - n...m n 到 m 個
    - m...* 至少 m 個
### Aggregation
表示*整體*和*部分*的關係，整體和部分可分開，為關聯關係的特例。關係可以分開為*聚合*，不可分開則為*組合*

### Composition
表示*整體*和*部分*的關係，整體和部分不可分開

## 設計模式類型

- Creational 模式
    - 如何有效率的產 生、管理 與操作物件，Creational 模式即與物件的建立相關。
    - 提供了對象創建機制，可以提高現有代碼的靈活性和重用性。
- Structural 模式
    - 如何設計物件之間的靜態結構，如何完成物件之間的繼承、實現與依賴關係，這關乎著系統設計出來是否健壯（robust）：像是易懂、易維護、易修改、耦合度低等等議題。
    - 解釋瞭如何將對象和類組裝成更大的結構，同時保持結構的靈活性和有效性。
- Behavioral 模式
    - 物件之間的合作行 為構成了程式最終的行為，物件之間若有設計良好的行為互動，不僅使得程式執行時更有效率，更可以讓物件的職責更為清晰、整個程式的動態結構（像是物件調度）更有彈性。
    - 負責有效的溝通和對象之間的責任分配。
- 多執行續模式
    - 在很多應用中都會使用多執行緒，尤其是在Web應用中，多執行緒以 Gof 整理的模式為基礎，考量多執行緒環境中，如何組合這些基本模式來完成多執行緒安全要求。


## Singleton（單例設計模式）
採取一定的方法保證在整個的軟體系統中，對某個類**只能存在一個物件實例**，且該類只提供一個取得物件實例的靜態方法，節省系統資源，並提高性能。可針對頻繁建立物件、創建物件時耗時過多的資源等。

八種寫法
- 餓漢模式
    - 三種
- 懶漢模式
    - 兩種
- 雙重檢查
    - 多執行緒
- 靜態內部類
    - 多執行緒
- 枚舉

### 餓漢模式 - 靜態長量 type1
1. 建構方法私有化，防止用 `new`
2. 類的內部建立對象
3. 向外暴露一個靜態的公共方法 `getInstance`

##### 優缺點
優：類裝載時完成實例化，避免執行續同步問題
缺：類裝載時完成實例化，沒有達到 `Lazy Loading` 效果，如果都無使用，反而造成*記憶體的浪費*

### 餓漢模式 - 靜態代碼塊 type2
可以說是與靜態長量做法是相似的


### 懶漢式 - 執行續不安全 type3
##### 優缺點
- 有 `Lazy Loading` 效果，但只能在單執行續下
    - 多執行續下，可能會產生多實例
- 不適合在實際開發中

### 懶漢式 - 執行續安全
- 解決執行續不安全問題
- 效率低，每條執行續想獲得實例時，都得進行同步
    - 其實執行一次實例即可，後面要取得就使用 return 方式
- 不適合在實際開發中

### 懶漢式 - 執行續安全同步代碼塊 type4
- 解決`懶漢式 - 執行續安全`問題，但不能起執行續同步作用，使得和`懶漢式 - 執行續不安全`遇到相同問題
- 不適合在實際開發中

### 單例 DoubleCheck type6
- 進行兩次 `if` 保證執行續安全
- 實例化物件，也只有一次
- 執行續安全，延遲加載，效率高
- 實際開發中，推薦此方法


### 單例靜態內部類 type7
- 採用`類裝載`機制，保證初始化實例時只有一個執行續
- 內部類不會立即被初始化，而是需要實例化時調用才會裝載
- 類的靜態屬性只會在第一次加載類的時候初始化
    - 保證執行續安全
- 利用靜態內部類實現延遲加載，效率高
- 推薦使用    

### 單例枚舉 type8
- 能避免執行續同步問題，還能防止反序列化重新創建物件
- 推薦使用

## 工廠模式
- 將實例化物件的代碼提取出來
    - 放到一個 `class` 中維護
- *依賴抽像原則*
    - 變量不要直接持有具體 `class` 的引用，而是將它放置工廠的方法中
    - 不讓 `class` 繼承具體 `class`，而是繼承抽象類或是實現 `interface`
    - 不覆蓋類中已經實現的方法
    
### Simple Factory Pattern（簡單工廠模式）
- 也叫*靜態工廠模式*
- 屬於**Creational** 模式，由一個工廠物件決定創建出哪一種產品類的實例
- 定義了一個創建類物件的類，該類*封裝實例化物件的行為*
- 當大量的創見某類、某批或某種物件時，會使用此模式

### Factory method pattern（工廠方法模式）
- 定義一個創建物件的抽象方法，由子類決定要實例化的類
    - 此方法，**將對象實例化延遲到子類**
- 實例化功能抽象成*抽象方法*，在不同的子類中在具體實現

在簡單工廠模式會因為不同的需求創建不同的簡單工廠類，像是不同口味的披薩，這導致維護性、擴展性都不佳。

### 抽象工廠模式
- 定義一個 `interface` 用於創建相關或有依賴關係的物件群，無須指名具體類
- 可將 `Simple Factory Pattern` 和 `Factory method pattern` 進行整合
- 從設計層面看，此模式就是對 `Simple Factory Pattern` 進一步*抽象*
- 將工廠抽象兩層
    - AbsFactory
    - 具體實現的工廠子類
        - 可根據創建物件類型使用相對應的工廠子類

## 原型模式（Prototype）
- 用原型實例指定創建物件的種類，定透過拷貝這些原型創建新物件
- 為 `Creational Pattern`，允許一個物件再創建另外一個可制定的物件，但無須理解創建的細節
- 透過將一個原型物件傳給那個要發動創建的物件，此要發動創建的物件透過請求原型物件拷貝它們自己來創建物件
    - `clone`

### 淺拷貝和深拷貝

##### 淺拷貝

- 數據類型為*基本數據類型*的變量，淺拷貝會直接進行值傳遞
- 數據類型為*引用類型*的變量，淺拷貝會進行引用傳遞
    - 指向同一個實例，只要修改就會影響
- `clone` 為淺拷貝

##### 深拷貝
- 複製物件中所有基本數據類型
- 為所有引用數據類型的變量請求儲存空間，並複製每個引用數據類型所引用的物件，直到物件可達的所有物件
    - 物件進行深拷貝要對整個物件進行拷貝
- 重寫 `clone` 方法來實現
- 藉由物件序列化實現


### 傳統方式
- 傳統方式會導致效率低，不斷創建新物件，並一直重新獲取原始物件的屬性。
- 不斷初始化物件，非動態獲取物件運行時的狀態，不夠靈活
- 範例：`prototype\tradition`

可以根據 JAVA 中根類 `Object` 的 `clone` 方法，其可複製一份物件。但須要實現 `Cloneable`，從而實現**原型模式**。

