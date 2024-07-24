package model;

public class DataProduct {
    private String name;
    private String image;
    private double price;
    private int stock;

    public DataProduct() {
    }
    public DataProduct(String name, String image, double price, int stock) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
