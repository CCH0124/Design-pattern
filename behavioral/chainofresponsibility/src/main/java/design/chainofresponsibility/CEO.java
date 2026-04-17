package design.chainofresponsibility;

/**
 * Concrete Handlers
 */
public class CEO extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("執行長：審批通過。原因：" + request.getPurpose() + "，金額：$" + request.getAmount());
    }
}