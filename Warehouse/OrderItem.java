import java.util.*;
import java.io.*;

public class OrderItem implements Serializable{
    private Product product;
    private double price;
    private int quantity;

    public OrderItem(Product p, int q)
    {
        this.product = p;
        this.quantity = q;
        this.price = p.getPrice() * q;
    }
    public Product getProduct() {
        return product;
    }
    public int getProductId() {
        return product.getId();
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "Product: " +product.getName()+ " Quantity: " +quantity+ " Price: "+this.getPrice(); 
    }
}
