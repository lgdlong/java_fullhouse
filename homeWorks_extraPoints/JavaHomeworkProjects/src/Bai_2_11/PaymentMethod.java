package Bai_2_11;

public abstract class PaymentMethod {
    private String transactionId;
    private double amount;

    public PaymentMethod() {
    }

    public PaymentMethod(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}
