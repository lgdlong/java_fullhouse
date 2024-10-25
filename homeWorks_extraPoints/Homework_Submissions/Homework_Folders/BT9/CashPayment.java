package Bai_2_11;

public class CashPayment extends PaymentMethod{
    public CashPayment() {
    }

    public CashPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by cas, the details are as follow:\nTransaction id: %s\nAmount: $%.2f\n", getTransactionId(), getAmount());
    }
}
