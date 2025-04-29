package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;


    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();

    }

    public String getTitle() {return title;}

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {return price;}

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Product id: " + this.getId() +
                "   Name: " + this.getTitle() +
                "   Price:" + this.getPrice();

    }

    protected abstract String generateId();

}
