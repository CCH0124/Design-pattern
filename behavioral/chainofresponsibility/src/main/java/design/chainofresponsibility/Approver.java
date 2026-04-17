package design.chainofresponsibility;

/**
 * Handler
 */
abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // 處理請求的抽象方法
    public abstract void processRequest(PurchaseRequest request);
}
