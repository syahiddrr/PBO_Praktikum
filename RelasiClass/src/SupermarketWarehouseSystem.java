// Superclass untuk produk di gudang supermarket
class Product {
    protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stock);
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public String getName() {
        return name;
    }
}

// Subclass untuk produk makanan
class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(String name, double price, int stock, String expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

// Subclass untuk produk elektronik
class ElectronicProduct extends Product {
    private String warrantyPeriod;

    public ElectronicProduct(String name, double price, int stock, String warrantyPeriod) {
        super(name, price, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
}

// Class Warehouse merepresentasikan Aggregation (gudang menyimpan beberapa produk)
class Warehouse {
    private String location;
    private Product[] products;

    public Warehouse(String location, Product[] products) {
        this.location = location;
        this.products = products;
    }

    public void displayAllProducts() {
        System.out.println("Products in Warehouse at " + location + ":");
        for (Product product : products) {
            product.displayProductInfo();
            System.out.println();
        }
    }

    public Product getProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}

// Class yang menunjukkan Dependency: Sistem pengelolaan pesanan bergantung pada stok barang di gudang
class OrderManagement {
    public void placeOrder(Warehouse warehouse, String productName, int quantity) {
        Product product = warehouse.getProductByName(productName);
        if (product != null && product.getStock() >= quantity) {
            product.reduceStock(quantity);
            System.out.println("Order placed: " + quantity + " of " + productName);
        } else {
            System.out.println("Insufficient stock for " + productName);
        }
    }
}

public class SupermarketWarehouseSystem {
    public static void main(String[] args) {
        // Inheritance: Membuat objek produk makanan dan elektronik
        FoodProduct apple = new FoodProduct("Apple", 0.5, 100, "2024-12-31");
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1000.0, 10, "2 years");

        // Aggregation: Warehouse menyimpan berbagai produk
        Product[] products = {apple, laptop};
        Warehouse warehouse = new Warehouse("Central Warehouse", products);

        // Menampilkan semua produk di gudang
        warehouse.displayAllProducts();

        // Dependency: Pengelolaan pesanan bergantung pada stok di gudang
        OrderManagement orderManagement = new OrderManagement();
        orderManagement.placeOrder(warehouse, "Apple", 20);  // Memesan 20 apel
        orderManagement.placeOrder(warehouse, "Laptop", 5);  // Memesan 5 laptop
        orderManagement.placeOrder(warehouse, "Laptop", 6);  // Memesan 6 laptop (tidak cukup stok)

        // Menampilkan ulang produk setelah pesanan
        System.out.println("\nAfter placing orders:");
        warehouse.displayAllProducts();
    }
}
