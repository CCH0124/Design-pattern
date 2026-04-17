package design.chainofresponsibility;

/**
 * Concrete Handlers
 */
public class Manager extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("經理：審批通過。原因：" + request.getPurpose() + "，金額：$" + request.getAmount());
        } else if (nextApprover != null) {
            System.out.println("經理：金額過大，轉交給上級...");
            nextApprover.processRequest(request);
        }
    }
}
