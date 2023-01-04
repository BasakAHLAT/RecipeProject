package Service;

import Entity.RecipeCategories;

import java.util.List;

// RecipeCategoryService interface
public interface RecipeCategoryService {
    List<RecipeCategories> findAll();
    RecipeCategories findById(Long id);
    RecipeCategories save(RecipeCategories recipeCategory);
    void deleteById(Long id);

    List<RecipeCategories> getAllRecipeCategory();

    RecipeCategories getRecipeCategoryById(Long id);

    RecipeCategories createRecipeCategory(RecipeCategories recipeCategories);

    RecipeCategories updateRecipeCategories(Long id, RecipeCategories recipeCategories);

    void deleteRecipeCategories(Long id);
}
