package Bai_2_11;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCardPayment() {
        super();
    }

    public CreditCardPayment(String transactionId, double amount, String cardNumber, String cardHolderName, String expiryDate) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by credit card, the details are as follows:\nTransaction id: %s\nAmount: $%.2f\nCard number: %s\nCard holder name: %s\nExpiry date: %s\n", getTransactionId(), getAmount(), getCardNumber(), getCardHolderName(), getExpiryDate());
    }
}
