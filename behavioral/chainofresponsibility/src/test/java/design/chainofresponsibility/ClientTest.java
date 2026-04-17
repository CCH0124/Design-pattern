package design.chainofresponsibility;

import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void clientTest() {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // 設定責任鏈 (經理 -> 總監 -> 執行長)
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // 發送不同金額的請求
        System.out.println("--- 測試請求 1 (800元) ---");
        manager.processRequest(new PurchaseRequest(800, "購買辦公文具"));

        System.out.println("\n--- 測試請求 2 (3500元) ---");
        manager.processRequest(new PurchaseRequest(3500, "部門聚餐"));

        System.out.println("\n--- 測試請求 3 (20000元) ---");
        manager.processRequest(new PurchaseRequest(20000, "年度伺服器採購"));
    }
}
