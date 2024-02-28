package org.odevGun3nLayeredKodlamaio.business;

import org.odevGun3nLayeredKodlamaio.core.logging.Logger;
import org.odevGun3nLayeredKodlamaio.dataAccess.CategoryDao;
import org.odevGun3nLayeredKodlamaio.entities.Category;


import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    //We have only 2 Dao options so fixed array is fine
    CategoryDao[] categoryDaos;
    Logger[] loggers;
    List<Category> categoryList = new ArrayList<>();

    CategoryManager() {
    }

    public CategoryManager(CategoryDao[] categoryDaos, Logger[] loggers, List<Category> categoryList) {
        this.categoryDaos = categoryDaos;
        this.loggers = loggers;
        this.categoryList = categoryList;
    }

    public CategoryManager(CategoryDao[] categoryDaos, Logger[] loggers) {
        this.categoryDaos = categoryDaos;
        this.loggers = loggers;
    }

    public void add(Category category) {
        // Condition checks
        if (isDuplicateCategory(category)) {
            System.out.println("Category " + category.getCategoryName() + " already exists!");
            return;
        }

        categoryList.add(category);
        for (Logger logger : loggers) {
            logger.log("Added " + category.getCategoryName() + " into the category list!");
        }

        System.out.println("\nAdding " + category.getCategoryName() + " into the databases...");
        for (CategoryDao categoryDao : categoryDaos) {
            categoryDao.add(category);
        }
    }

    private boolean isDuplicateCategory(Category category) {
        for (Category categoryToCheck : categoryList) {
            if (categoryToCheck.getCategoryId() == category.getCategoryId() ||
                    categoryToCheck.getCategoryName().equals(category.getCategoryName())) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }
}