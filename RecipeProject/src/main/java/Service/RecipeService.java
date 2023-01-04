package Service;

import Entity.Recipe;

import java.util.List;

// RecipeService interface
public interface RecipeService {
    List<Recipe> findAll();
    Recipe findById(Long id);
    Recipe save(Recipe recipe);
    void deleteById(Long id);

    List<Recipe> getAllRecipes();

    Recipe getRecipeById(Long id);

    Recipe createRecipe(Recipe recipe);

    Recipe updateRecipe(Long id, Recipe recipe);

    void deleteRecipe(Long id);
}

