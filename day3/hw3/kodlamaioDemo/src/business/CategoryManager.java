package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.Category.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> categories;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category c : categories) {
            if (category.getName().equals(c.getName())) {
                throw new Exception("Kategori ismi tekrar edemez");
            }
        }
        categoryDao.add(category);
        System.out.println("Kategori eklendi");
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
