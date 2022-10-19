package DataAccess;

import Entities.Category;
import java.util.ArrayList;
import java.util.List;
public class HibernateCategoryDao implements ICategoryDao{
    private List<Category> categories = new ArrayList<Category>();


    @Override
    public List<Category> getAllCategories() {
        System.out.println("Kategoriler Hibernate ile getirildi");
        return categories;
    }

    @Override
    public Category getCategory(int id) throws Exception {
        for (Category category : categories){
            if (category.getId() == id){
                System.out.println(id+ " numaralı kategori Hibernate ile getirildi");
                return category;
            }else {
                System.out.println("Kategori bulunamadı");
            }
        }
        throw new Exception("Hata");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println(category.name+" isimli kategori eklendi(Hibernate)");
        this.categories.add(category);
    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("Kategori Güncellendi(Hibernate)");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("Kategori Silindi(Hibernate)");
    }
}
