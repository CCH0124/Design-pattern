# 迭代器模式 (The Iterator Pattern)

迭代器模式旨在提供一種標準化的機制來遍歷（traverse）集合中的元素，同時將客戶端程式碼與集合的底層資料表示（underlying representation）隔離。

## 1. 問題動機與挑戰

在軟體開發中，當客戶端程式碼（例如，`Waitress` 服務生類別）需要處理多個不同集合（Aggregate）的元素時，如果這些集合使用不同的內部結構（如 `ArrayList` 和 `Array`），將導致以下問題：

* **耦合性高：** 客戶端必須了解每個集合的具體實現細節，例如需要知道 `ArrayList` 使用 `size()` 和 `get()`，而 `Array` 使用 `length` 屬性及下標索引。
* **違反封裝：** 集合類別（例如 `DinerMenu` 和 `PancakeHouseMenu`）被迫暴露其內部資料結構，如直接透過 `getMenuItems()` 方法回傳 `MenuItem[]` 或 `ArrayList<MenuItem>`。
* **程式碼重複：** 客戶端必須為每種不同的資料結構編寫單獨的遍歷迴圈，這增加了維護成本和引入錯誤的風險。

## 2. 模式定義與核心結構

迭代器模式將遍歷（iteration）的職責獨立出來，並將其封裝在一個獨立的迭代器對象中。

* **定義：** 迭代器模式提供了一種無需暴露聚合對象的底層表示法，即可循序存取其元素的方法。
* **職責分離：** 遍歷的職責被放置在 `Iterator` 對象上，而非 `Aggregate`（集合）對象上，這簡化了集合的介面和實現。

在 Java 環境中，通常使用 `java.util.Iterator` 介面，其主要方法包括：

* `hasNext()`：檢查集合中是否還有更多元素。
* `next()`：返回集合中的下一個元素。
* `remove()`：可選方法，用於從集合中移除上一個由 `next()` 返回的元素（如果不支持移除，則應拋出 `UnsupportedOperationException`）。

## 3. 設計原則的體現

迭代器模式完美體現了以下設計原則：

* **單一職責原則 (Single Responsibility Principle, SRP)：** 該原則指出一個類別應該只有一個改變的理由。通過將遍歷邏輯委託給 `Iterator` 類，集合類只需專注於管理對象集合（高內聚性），而不會因為遍歷方式的改變而需要修改。
* **針對介面而非實現編程：** 客戶端（如 `Waitress`）不再依賴具體的集合類別，而是依賴於通用的 `Iterator` 介面。這使得客戶端代碼可以多型地（polymorphically）處理任何實現了該介面的集合。