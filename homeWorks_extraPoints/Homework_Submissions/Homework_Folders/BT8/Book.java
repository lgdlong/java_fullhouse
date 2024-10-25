package Bai_2_5;

public class Book {
    private String id;
    private String name;
    private String publicationDate;
    private String categoryName;
    private String authorName;
    private double price;
    private double discountRate;

    public Book() {
        this.id = "";
        this.name = "";
        this.publicationDate = "";
        this.categoryName = "";
        this.authorName = "";
        this.price = 0.0;
        this.discountRate = 0.0;
    }

    public Book(String id, String name, String publicationDate, String categoryName, String authorName, double price, double discountRate) {
        this.id = id;
        this.name = name;
        this.publicationDate = publicationDate;
        this.categoryName = categoryName;
        this.authorName = authorName;
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "Book [" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ']';
    }
}
