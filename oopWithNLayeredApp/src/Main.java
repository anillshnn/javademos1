import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataaccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Product product1 = new Product(1, "Iphone 11", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);



    }
}
