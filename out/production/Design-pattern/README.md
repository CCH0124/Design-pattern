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
    - [範例](principle/segregation/Segregation1.java)，改善後[範例](principle/segregation/improve/Segregation2.java)
- 依賴倒轉原則（Dependence Inversion Principle）
    - 高層模組不應該依賴低層模組，兩者都應該依賴其抽象
    - 抽象不應該依賴細節，細節應該依賴抽象
    - 核心思想是面向接口編程
    - 相對於細節的多變性，抽象的東西要穩定多。
        - 以抽象搭建的架構比細節為基礎的架構要穩定的多
        - 抽象指的是 interface 或 abstract，細節是具體實現類
    - 接口和抽象的目的就是制定規範，而不涉及任何具體操作，把展現細節任務交給他們的實現類去完成
    - 變量宣告類型盡量是抽象類或接口，這樣我們的變量引用和實際物件間，就存在者一層緩衝，益於擴展和優化
    - [範例](principle/invervion/DependecyInversion.java)，改善後[範例](principle/invervion/improve/DependecyInversionType.java)
- 里式替換原則（Liskov Substitution Principle）
    - 繼承時應該遵守
    - 繼承有些許弊端，如繼承鬼程序帶來侵入性，程序可移殖性降低，增加物件間的偶合性，父類的修改需要可慮繼承他的類別
    - 引用基類的地方能透明的使用其子類的物件
    - *盡量不重寫父類的方法*
    - 繼承讓偶合性增強，適當情況下，可透過`聚合`、`組合`、`依賴`來解決問題
    - [範例](principle/liskov/Liskov.java)，改善後[範例](principle/liskov/improve/Liskov.java) 透過介面可讓不同通訊軟體定義訊息而 `receive` 並不用做任何變動
- 開閉原則（Oprn Closed Principle）
    - 一個軟體實體像是 `class`、`model`、`method` 應該*對擴展開放，對修改關閉*
        - 抽象建構框架（使用*抽象*或*接口*類）
    - 軟體需變話時，盡量擴展（提供方）而不是透過修改（使用方）代碼實現
        - 新增方法，但對使用該方法的類不應該修改
    - 使用設計模式目的也是遵守該原則
    - [範例](principle/ocp/Ocp.java)，改善後[範例](principle/ocp/improve/Ocp.java)
- 迪米特原則（Demeter Principle）
    - 降低類之間的藕合，並非要求完全無依賴
    - 最少知道原則，一個類對自己依賴的類知道的越少越好
    - 只與直接朋友通訊
    - [範例](principle/demeter/Demeter.java)，改善後[範例](principle/demeter/improve/Demeter.java)

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
### Class
[範例](UML/classDemo.wsd)

- `+` 表示 `public`
- `-` 表示 `private`
- `#` 表示 `protected`

Field 表示 權限 名稱 : 類型 [= 缺值]
Method 表示 權限 名稱(參數列表) [: 返回類型]

### Dependence
- 在類別中使用到對方，A 用到 B，A 依賴 B，沒 B 無法編譯通過，是一種依賴關係
- 為類的成員屬性
- 為方法的返回類型
- 是方法接受參數類型
- 方法中使用到

[範例](UML/dependence.wsd)

### Generalization
- 簡單來說就是繼層關係，依賴關係的特例
- A 繼層 B，可說 A 和 B 存在 Generalization 關係
- 耦合最大的關係，
[範例](UML/generalization.wsd)

### Implementation
- A 實現 B，依賴關係的特例

[範例](UML/implementation.wsd)

### Association
- 類與類之間的關係，依賴關係的特例
- 具有導航性，雙向或單向關係
- 關係有多重性
    - 1 表示有，且僅有一個
    - 0... 表示 0 或多個
    - 0, 1 表示 0 或一個
    - n...m n 到 m 個
    - m...* 至少 m 個

1. 單向關聯

[範例](UML/one-way-association.wsd)，Customer 擁有 Address

2. 雙向關聯

[範例](UML/two-way-association.wsd)，一個顧客有多個產品，產品被哪個客戶所購買

### Aggregation
表示*整體*和*部分*的關係，整體和部分可分開，為關聯關係的特例。關係可以分開為*聚合*，不可分開則為*組合*

[範例](UML/aggregation.wsd)，電腦沒有滑鼠或螢幕它們依舊存在。

### Composition
表示*整體*和*部分*的關係，整體和部分不可分開。

[範例](UML/composition.wsd)，沒有人，頭就不會存在。

## 設計模式類型

- Creational 模式
    - 如何有效率的產生、管理與操作物件，Creational 模式即與物件的建立相關。
    - 提供了對象創建機制，可以提高現有代碼的靈活性和重用性。
    - 將物件的創建和使用分離
- Structural 模式
    - 如何設計物件之間的靜態結構，如何完成物件之間的繼承、實現與依賴關係，這關乎著系統設計出來是否健壯（robust）：像是易懂、易維護、易修改、耦合度低等等議題。
    - 解釋瞭如何將對象和類組裝成更大的結構，同時保持結構的靈活性和有效性。
- Behavioral 模式
    - 物件之間的合作行 為構成了程式最終的行為，物件之間若有設計良好的行為互動，不僅使得程式執行時更有效率，更可以讓物件的職責更為清晰、整個程式的動態結構（像是物件調度）更有彈性。
    - 負責有效的溝通和對象之間的責任分配。
- 多執行續模式
    - 在很多應用中都會使用多執行緒，尤其是在Web應用中，多執行緒以 Gof 整理的模式為基礎，考量多執行緒環境中，如何組合這些基本模式來完成多執行緒安全要求。

## Strategy
定義一系列演算法，將每一個演算法都封裝起來，並且讓它們是可對調的。此模式可讓你在不影響用戶端的強況下獨立改變演算法。

Fly 和 Quack 對於不同鴨子有不同的改變，因此個別抽象成一個行為(FlyBehavior、QuackBehavior)。也就是行為類別會實作行為介面。

Duck 將 Fly、Quack 行為*委託(delegate)*出去。


1. 把會變得部分封裝起來，如此一來，你就可以修改或擴展會遍的部分，同時不會影響不變的部分。減少程式修改造成的意外，也可讓系統更靈活。

>找出應用程式會變得部分，把他們和不會變的部分分開
>針對介面(針對 supertype)寫程式，而不是針對實作寫程式