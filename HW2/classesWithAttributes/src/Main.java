public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setId(1);
        product.setPrice(2500);
        product.setStockAmount(120);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
        }
}
