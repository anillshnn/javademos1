package Business;

import Core.Logging.ILogging;
import DataAccess.ICategoryDao;
import Entities.Category;

import java.util.List;

public class CategoryManager {
    private List<ILogging> loggers;
    private ICategoryDao categoryDao;

    public CategoryManager(List<ILogging> loggers, ICategoryDao categoryDao){
        this.loggers=loggers;
        this.categoryDao=categoryDao;
    }

    public void add(Category category) throws Exception{
        List<Category> categories=categoryDao.getAllCategories();
        boolean isThere = false;
        for (Category category1 : categories ){
            if (category.name == category1.name){
                isThere=true;
                break;
            }
        }
        if (!isThere){
            categoryDao.addCategory(category);
            for (ILogging logging : loggers){
                logging.log();
            }
        }else {
            throw new Exception("Kategori ismi tekrar edemez");
        }
    }

    public void update(Category category) {
        categoryDao.updateCategory(category);
        for(ILogging logger:loggers) {
            logger.log();
        }
    }

    public void delete(Category category) {
        categoryDao.deleteCategory(category);
        for(ILogging logger:loggers) {
            logger.log();
        }
    }

}
