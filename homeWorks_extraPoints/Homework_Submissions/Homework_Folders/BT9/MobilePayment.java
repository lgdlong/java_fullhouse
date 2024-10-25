package Bai_2_11;

public class MobilePayment extends PaymentMethod {
    private String phoneNumber;
    private String operator;

    public MobilePayment() {
        super();
    }

    public MobilePayment(String transactionId, double amount, String phoneNumber, String operator) {
        super(transactionId, amount);
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by mobile, the details are as follows:\nTransaction id: %s\nAmount: $%.2f\nPhone number: %s\nOperator: %s\n", getTransactionId(), getAmount(), getPhoneNumber(), getOperator());
    }
}
