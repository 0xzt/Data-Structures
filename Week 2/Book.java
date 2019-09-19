import java.util.Date;

public class Book {

    private int isbn; //Book identifier
    private String title; //Title of the book
    private int stock; //Quantity in stock
    private double price; //Sale price
    private int totalSold; //Number of copies sold
    private int totalReturned; //Number of copies returned
    private int sku; //Book barcode
    private int quality; //Quality of the book (1 = poor, 5 = new)

    protected Book(int isbn, String title, int stock, double price, int totalSold, int totalReturned, int sku, int quality) {
        this.isbn = isbn;
        this.title = title;
        this.stock = stock;
        this.price = price;
        this.totalSold = totalSold;
        this.totalReturned = totalReturned;
        this.sku = sku;
        this.quality = quality;
    }

    /**
     * @pre quantity
     * @pre sku
     * @post deliveryDate
     * @post orderQuantity
     * @post customerId
     * @post deliveryPreference
     *
     * @param deliveryDate Date the order is placed
     * @param orderQuantity Number of pieces ordered
     * @param customerId Customer ID
     * @param deliveryType Delivery type - 1 = USPS, 2 = FedEx, 3 - UPS
     *
     * @return orderNum
     */
    public int orderBook(Date deliveryDate, int orderQuantity, int customerId, int deliveryType) {
        //Verify quantity of order is in stock
        //Create an order and order number using the {customerId} value of the Student
        //Set delivery type

        //Return the order number
        return 0;
    }

    /**
     * @pre sku
     * @post orderNum
     * @post purchasePrice
     * @post quality (1 = poor thru 5 = new)
     *
     * @param orderNum Order number associated with the book purchase
     * @param purchasePrice Price the book was purchased for
     * @param quality Quality of the book (1 = poor, 5 = new)
     */
    public void returnBook(int orderNum, int purchasePrice, int quality) {
        //Verify order number for return
        //Calculate book price using the {quality} vale
        //Add book back to stock database
        //Update book class with stock increase
    }

    /*
     * Getter/Setter methods for constructor variables.
     */
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public int getTotalReturned() {
        return totalReturned;
    }

    public void setTotalReturned(int totalReturned) {
        this.totalReturned = totalReturned;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
