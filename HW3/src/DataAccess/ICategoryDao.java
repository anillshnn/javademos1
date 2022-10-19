package DataAccess;

import Entities.Category;

import java.util.List;

public interface ICategoryDao {
    List<Category> getAllCategories();
    Category getCategory(int id) throws Exception;
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Category category);
}
