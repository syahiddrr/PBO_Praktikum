import java.text.DecimalFormat;

import com.polban.jtk.Sales;
import com.polban.jtk.Product;

public class Main {
    public static void main(String[] args) {
        Product MyProduct = new Product("Laptop",15000000,10);

        System.out.println("Nama Produk: " + MyProduct.getProductName());
        System.out.println("Harga: " + MyProduct.getPrice());
        System.out.println("Stok: " + MyProduct.getStock());

        Sales sales = new Sales(MyProduct);
        sales.sellProduct(2);
        sales.restockProduct(5);
        sales.updateProductPrice(14500000);
    }
}
