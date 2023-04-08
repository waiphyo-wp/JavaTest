package OOP.AuthorVsBook;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price ) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price , int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // getter and setter
    public String getName() {
        return name;
    }   

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    public String toString() {
        return name + " by "+ author.getName() + "(" + author.getGender() + ") at " + author.getEmail();
    }
}
