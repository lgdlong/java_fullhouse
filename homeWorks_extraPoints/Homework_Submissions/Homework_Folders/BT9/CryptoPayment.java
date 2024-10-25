package Bai_2_11;

public class CryptoPayment extends PaymentMethod {
    private String walletAddress;
    private String cryptoType;

    public CryptoPayment() {
    }

    public CryptoPayment(String transactionId, double amount, String walletAddress, String cryptoType) {
        super(transactionId, amount);
        this.walletAddress = walletAddress;
        this.cryptoType = cryptoType;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public String getCryptoType() {
        return cryptoType;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void setCryptoType(String cryptoType) {
        this.cryptoType = cryptoType;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by crypto, the details are as follows:\nTransaction id: %s\nAmount: $%.2f %s(s)\nWallet address: %s\nCrypto type: %s\n", getTransactionId(), getAmount(), getCryptoType(), getWalletAddress(), getCryptoType());
    }
}
