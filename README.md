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

## 七大設計原則 008

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
- 簡單來說就是繼層關係
- A 繼層 B，可說 A 和 B 存在 Generalization 關係

### Implementation
- A 實現 B

## 狀態模式

## 解釋器設計模式

## 單例設計模式

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