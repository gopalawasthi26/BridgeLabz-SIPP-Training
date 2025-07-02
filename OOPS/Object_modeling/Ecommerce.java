import java.util.ArrayList;
import java.util.List;

// Product class (can exist independently)
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("  Product ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}

// Order class (aggregates products)
class Order {
    int orderId;
    List<Product> products;
    Customer customer;

    Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.name);
        for (Product p : products) {
            p.display();
        }
    }
}

// Customer class (places orders)
class Customer {
    int id;
    String name;
    List<Order> orders;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Communication method: placing an order
    Order placeOrder(int orderId, List<Product> productList) {
        Order newOrder = new Order(orderId, this);
        for (Product p : productList) {
            newOrder.addProduct(p);
        }
        orders.add(newOrder);
        System.out.println(name + " placed an order (ID: " + orderId + ")");
        return newOrder;
    }

    void viewOrders() {
        System.out.println("\nOrders for customer: " + name);
        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Headphones", 2000);
        Product p3 = new Product(103, "Smartphone", 25000);

        // Create a customer
        Customer customer1 = new Customer(1, "Gopal Awasthi");

        // Place orders
        List<Product> order1Products = new ArrayList<>();
        order1Products.add(p1);
        order1Products.add(p2);

        List<Product> order2Products = new ArrayList<>();
        order2Products.add(p3);

        customer1.placeOrder(1001, order1Products);
        customer1.placeOrder(1002, order2Products);

        // View customer's orders
        customer1.viewOrders();
    }
}
