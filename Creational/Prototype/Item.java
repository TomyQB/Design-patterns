package Creational.Prototype;

public abstract class Item {
    private String title;
    private double price;
    private String url;

    public Item() {
    }

    public Item(Item target) {
        if (target != null) {
            this.title = target.title;
            this.price = target.price;
            this.url = target.url;
        }
    }

    public abstract Item clone();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

  
}
