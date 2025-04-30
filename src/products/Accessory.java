package products;

public class Accessory extends Product {
    private String color;
    protected static int idCounter = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Color: " + getColor();

    }

    @Override
    protected String generateId() {
        String formattedId;
        if (idCounter < 10) {
            formattedId = "300" + idCounter;
        } else if (idCounter < 100) {
            formattedId = "30" + idCounter;
        } else if (idCounter < 1000) {
            formattedId = "3" + idCounter;
        } else {
            System.out.println("ID limit reached");
            return null;
        }
        idCounter++;
        return formattedId;
    }
}
