
# 範本方法模式（Template Method Pattern）：演算法封裝重點詳解

範本方法模式旨在將演算法的各個步驟封裝起來，允許子類別在不改變演算法整體結構的前提下，客製化或「掛入」部分實作邏輯。

## 1. 模式的核心概念與結構 (Core Concept and Structure)

範本方法模式定義了演算法的**骨架**（skeleton），將演算法的不變步驟（Invariant Steps）固定在抽象父類別中，並將需要變化的步驟延遲到具體子類別中實作。

| 組成部分 (Component) | 定義與職責 (Definition and Responsibility) | 引用 (Source) |
| :--- | :--- | :--- |
| **範本方法** (Template Method) | 這是定義演算法**步驟序列**的方法。它通常被宣告為 `final`，以確保子類別**無法修改**演算法的結構與流程。 | |
| **抽象類別** (Abstract Class) | 包含範本方法，並宣告演算法中必須由子類別提供的步驟為**抽象方法**（或稱為原始操作，Primitive Operations）。 | |
| **具體子類別** (Concrete Class) | 負責提供抽象方法（原始操作）的具體實作，從而完成演算法的特定部分。 | |

> The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

## 2. 範本方法中的方法類型 (Method Types in the Template Method)

為了提供彈性，抽象類別通常包含三種方法類型：

1. **抽象方法 (Abstract Methods) / 原始操作 (Primitive Operations):**

* 子類別**必須**提供實作的步驟。
* 範例：在製作咖啡因飲品的例子中，`brew()`（沖泡）和 `addCondiments()`（添加調料）被定義為抽象方法，因為咖啡和茶的實作不同。

2. **具體方法 (Concrete Methods):**

* 在抽象類別中提供完整的實作，並被所有子類別共享。
* 範例：`boilWater()`（燒水）和 `pourInCup()`（倒入杯中）在抽象類別 `CaffeineBeverage` 中被共享和實作。

3. **掛鉤 (Hooks):**

* 在抽象類別中宣告，但只給予空的或預設的實作（例如返回 `true` 或 `false`）。
* 掛鉤允許子類別選擇性地「掛入」演算法中的特定點，決定是否要執行某個可選步驟。
* 範例：`customerWantsCondiments()` 可以控制演算法流程，決定是否呼叫 `addCondiments()`。

## 3. 設計原則：好萊塢原則 (The Hollywood Principle)

範本方法模式體現了「好萊塢原則」（The Hollywood Principle）：「不要打電話給我們，我們會打電話給你」（Don’t call us, we’ll call you）。

* **機制：** 高層組件（抽象類別，如 `CaffeineBeverage`）掌握控制權和演算法流程，並在需要時呼叫低層組件（子類別）的方法。
* **優勢：** 這種控制反轉（Inversion of Control）有助於防止「依賴腐敗」（dependency rot），確保低層組件不會直接呼叫高層組件，從而保持系統的清晰和可維護性。

## 4. 實務應用與模式對比 (Practical Applications and Pattern Comparison)

範本方法模式是設計框架的優秀工具，框架透過範本方法控制流程，將細節留給使用者（子類別）自訂。

* **Java 實例：**
  * **排序演算法：** Java 的 `Arrays.sort()` 方法是一個範本方法，它利用 `Comparable` 介面的 `compareTo()` 方法來決定如何比較物件，從而完成排序演算法。這允許排序演算法的骨架保持不變，同時允許子類別定義具體的比較邏輯。
  * **Swing GUI：** `JFrame` 的 `paint()` 方法就是一個「掛鉤」（Hook）。預設情況下它不執行任何操作，但使用者可以覆寫它來插入自己的繪圖邏輯。

* **與策略模式 (Strategy Pattern) 的對比：**
    雖然範本方法和策略模式都用於封裝演算法，但它們的實現方式和意圖截然不同。

| 特性 (Feature) | 範本方法模式 (Template Method Pattern) | 策略模式 (Strategy Pattern) |
| :--- | :--- | :--- |
| **主要機制** | **繼承**：透過子類別來實作演算法中的步驟。 | **組合**：透過將行為物件組合到 Context 中，實現可替換的演算法系列。 |
| **演算法控制** | 抽象父類別擁有演算法的完整控制權和不變結構。 | Context 將演算法的實作完全委派給策略物件。 |
| **意圖** | 定義並保護演算法的骨架，實現程式碼的高度重用（將公共邏輯上移）。 | 讓演算法可以獨立於使用它的客戶端而自由變化。 |

* **與工廠方法模式 (Factory Method) 的關係：**
    工廠方法模式可以被視為範本方法模式的一個特例（或稱特化），其中範本方法的「原始操作」被用於建立和返回物件。