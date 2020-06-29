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
- 創建新物件比較複雜時，可利用原型模式建化創建過程，同時也提高效率
- 不用初始化物件，而是動態的獲得物件運行時狀態
- 如果原物件發生變化，其它克隆物件也會發生相應的變化，無須修改程式碼

>缺點：需要為每一個類配置一個克隆方法，對於新類別沒有很難，反之需要修改其原碼，違背 `OCP` 原則

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

## 建造者模式(Builder Pattern)
- 屬於 `Creational Pattern`
- 將產品和產品建造過程解耦，範例：`builder` 下
    - 將複雜物件的建造過程抽象，使該抽象過程的不同實現方法可以建構出不同屬性的物件
- 是以一步一步創建一個複雜物件，允許用戶端透過指定複雜對向的類型和內容就可建構它們，不需要知道內部的具體結構細節
- 每一個具體建構者都相對獨立，與其它的具體建構者無關，因此可很方便替換具體建構者或新增具體建構者
    - 用戶端使用不同的具體建構者即可得到不同的產品物件
- 可以更加細緻控產品生產過程
- 增加新的具體建構者無須修改原始程式碼，指揮者針對抽象建構者以類編碼，使系統擴展方便，符合**開閉原則**
- 此模式所創建的產品一般都有較多的*共同點*，組成成分相似，**如果產品之間的差異性很大，則不是合使用此模式**
- 如果產品*內部變化複雜*，有可能會建立多個具體建構者實現該變化，導致系統龐大，此時須要考慮是否合適

### 抽象工廠模式 vs 建造者模式
- 抽象工廠模式
    - 實現對產品家族的創建
    - 產品家族，具有不同分類維度的產品組合，使用該模式不需要關心建構過程，只需關心用什麼工廠產生
- 建造者模式
    - 要求按照指定的藍圖建構產品，主要目的是通過組裝零配件而產生的一個新產品

### 建造者模式有主要四個角色
1. Product 
一個具體的產品物件
2. Builder 
創建一個 Product 物件的各個部件指定的接口
3. ConcreteBuilder 
實現接口，建構和裝配各部件，繼承 Builder  
4. Director 
建構一個使用 Builder 接口物件。用於建立複雜的物件，其包含兩個作用
- 隔離用戶端物件生產過程
- 負責控制產品物件的生產過程

## 適配器模式(Adapter pattern)
- 將某個類的接口轉換成客戶端所期望的另一個接口表示，主要是**兼容性**，讓原本不匹配不能工作的兩類可協同工作，別名為**包裝器(Wrapp)**
- 屬於結構型模式(Structural Pattern)
- 可分為三類
    - 類適配器模式
        - 繼承
    - 物件適配器模式
        - 持有
    - 接口適配器模式
        - 實現

- 用戶端的角度看不到被適配者，是解耦的

Target（dst, 最後需要的輸出） <- Adapter <- source（src, 被適配者，需要被適配的類、物件、接口等）

### 類適配器
- 透過繼承 src 類，實現 dst 類接口，完成 src -> dst 適配
    - 在 JAVA 中繼承只能有一個，另一個必為接口
- src 類方法在 Adapter 會暴露出來，增加使用成本
- 由於其繼承 src 類，因此可以重寫方法，讓 Adapter 靈活度提高

### 物件適配器模式
- 基本上和類適配器適相同，只是將 `Adapter` 類做修改，不是繼承 src 類，而是持有該實例，同樣也解決相容性問題。
    - 持有 src 實現 dst 完成適配
- 根據**合成復用原則**，在系統中盡量使用關聯關係來替代繼承關係
    - 成本降低，更靈活

### 接口適配器
- 當不需要全部實現街口提供的方法時，可先設計一個抽象類實現接口，並為該接口中每個方法提供一個默認實現(空方法)，此時該抽象類的子類可有選擇性覆蓋父類的某些方法來實現需求

## 橋接模式(Bridge pattern)
- 將實現與抽象放在兩個不同層次中，使兩個層次可以獨立改變
    - 提高系統靈活性
    - 獲得更好結構化系統
- 屬於結構型模式(Structural Pattern)
- 是基於**類的最小原則**，藉由使用封裝、聚合和繼承等行為讓不同的類承擔不同的職責
- 此模式*替代多繼承*，減少子類數量，降低系統的管理和維護成本
- 此模式會增加對系統的理解和設計維度
    - 聚合關聯關係建立在抽象層，要求開發者針對抽象進行設計和編碼
- 需要正確識別抽象和實現的維度變化
    - 使用範圍有一定的侷限性
### [wiki 原理介紹](https://zh.wikipedia.org/wiki/%E6%A9%8B%E6%8E%A5%E6%A8%A1%E5%BC%8F)
- 從裡面可以知道抽象類和接口適聚合的關係

- Client
    - 橋接模式調用者
- Abstraction
    - 定義抽象類，維護 Implementor 即它的實現類 ConcreteImplementor，兩者為聚合關係
    - Abstraction 充當橋接類
- RefinedAbstraction
    - Abstraction 的子類
- Implementor
    - 定義具體行爲、具體特徵的接口
- ConcreteImplementor
    - 實現 Implementor 行為的具體類

## 裝飾者模式(Decorator Pattern)
- *動態*的將新功能**附加到物件上**
    - 在物件擴展方面，比繼承更有彈性
- 體現開閉原則(OCP)

### 原理
- Compoenet 
    - 被裝飾者，衣服、陶瓷、drink 等
- ConcreateCompoenet 和 Decorator
    - ConcreateCompoenet 
        - 具體主題，咖啡等
    - Decorator 
        - 裝飾者，調料
- JAVA IO 類別 FileInputStream 實現裝飾者

## 組合模式(Composite Pattern)
- 創建物件組合的樹型結構
    - 以樹狀結構表示整體或部分層次關係
- 屬於結構型模式(Structural Pattern)
- 使得用戶端單個物件和組合物件的訪問具有一致性
    - 組合能讓用戶端以一致的方式處裡個別物件和組合物件
- 需要遍歷組織機構或者處裡的物件具有樹形結構時，非常適合使用組合模式
    - 如果節點和葉子有很多差異性則不適合
- HashMap 使用組合模式
### 原理

![wiki](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/1920px-Composite_UML_class_diagram_%28fixed%29.svg.png)

- Compoenet
    - 這是組合中物件聲明接口，在適當情況下，實現所有類共有的接口默認行為，用於訪問和管理 Compoenet 子部件
    - 可以是抽象或接口
- Leaf
    - 在組合中表示葉子節點
- Composite
    - 非子節點
    - 用於儲存子部件，在 Compoenet 中實現子部件相關操作，增加、刪除等

## 外觀模式(Facade pattern)
- 為子系統中的一組接口提供一個一致介面
    - 定義更高層接口，使子系統更加容易使用
    - 屏蔽內部子系統細節，使得調用端只須跟該接口發生調用
- 解決多個複雜接口帶來的使用困難，到簡化用戶操作作用
- 對客戶端與子系統的耦合關係，讓系統內部模組易擴展和維護
- 更好劃分*訪問層次*
    - 以範例程式碼為例分 ready、play、end
- 當系統需要進行*分層設計*，可考慮此模式

### 原理
- Facade
    - 為調用端提供統一調用接口
    - 知道子系統負責處理請求，將調用端的請求代理給適當子系統物件
- Client
    - Facade 接口的調用者
- SubSystem 集合
    - 指模組或者子系統，處理 Facade 物件指派的任務，它是功能的實際提供者

## 享元模式(Flyweight Pattern)
- 運用共享技術有效地支持大量細粒度物件
- 常用於系統底層開發，解決系統性能問題
    - 資料庫連接池
- 能夠解決**重複物件的記憶體浪費**問題
    - 緩衝池概念，降低系統記憶體和提高效率
    - `String`、資料庫連接池和緩衝池等技術
- Integer 類別
    - valueOf，當值為 -127 到 128 時，就是享元模式
- 系統有大量物件農時消耗大量記憶體，如果該物件的狀態大部分可以外部化時，可考慮享元模式
- 此模式提高系統複雜度
    - 分離了內部和外部狀態
        - 需要有一個工廠類加以控制

### 原理
- Flyweight
    - 抽象的享元角色，是產品的抽象類，同時定義出物件的**外部狀態**和**內部狀態**的接口或實現
- FlyweightFactory
    - 享元工廠，用於構建一個池容器，同時提供池中獲取物件方法
- ConcreteFlyweight
    - 是*具體*的享元角色，是具體的產品類，實現抽象角色定義相關任務
- UnsharedConcreteFlyweight
    - 不可共享的角色，一般不會出現在享元工廠

>內部狀態：指物件共享出來的訊息，儲存在享元物件內部且不會隨環境的改變而改變
>外部狀態：指物件得以依賴一個標記，是隨環境改變而改變、不可共享狀態