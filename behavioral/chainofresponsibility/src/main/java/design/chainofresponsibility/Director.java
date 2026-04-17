package design.chainofresponsibility;

/**
 * Concrete Handlers
 */
public class Director extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("總監：審批通過。原因：" + request.getPurpose() + "，金額：$" + request.getAmount());
        } else if (nextApprover != null) {
            System.out.println("總監：金額過大，轉交給執行長...");
            nextApprover.processRequest(request);
        }
    }
}
