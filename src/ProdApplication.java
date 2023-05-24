import java.util.*;

public class ProdApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> products = new TreeSet<>();

        // Attempt to add 10 unique products
        products.add(new Product("P1", "Product 1"));
        products.add(new Product("P2", "Product 2"));
        products.add(new Product("P3", "Product 3"));
        products.add(new Product("P4", "Product 4"));
        products.add(new Product("P5", "Product 5"));
        products.add(new Product("P6", "Product 6"));
        products.add(new Product("P7", "Product 7"));
        products.add(new Product("P8", "Product 8"));
        products.add(new Product("P9", "Product 9"));
        products.add(new Product("P10", "Product 10"));
        
        
        products.add(new Product("P1", "Product 1")); 

        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product implements Comparable<Product> {
    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Product other) {
        return this.id.compareTo(other.id);
    }
}
