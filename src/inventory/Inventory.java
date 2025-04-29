package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) {
        boolean found = false;

        for (T product : items) {
            if (product.getTitle().equalsIgnoreCase(productName)) {
                double oldPrice = product.getPrice();
                double newPrice = oldPrice * (1 - discount / 100.0);
                product.setPrice(newPrice);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No product found with name '" + productName + "'.");
        }
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemById(String id) {
        for (T product : items) {
            if (product.getId().equals(id)) {
                items.remove(product);
                return;
            }
        }
        System.out.println("No product found with ID " + id + ".");
    }

    public T findItemsById(int id){
        String stringId = String.valueOf(id);
        for (T product : items) {
            if (product.getId().equals(stringId)) {
                return product;
            }
        }
        System.out.println("Error: No product found with ID '" + id + "'.");
        return null;
    }

    public void displayAll() {
        for (T product : items)
            System.out.println(product.toString());
    }


}
