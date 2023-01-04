package Service;

import Entity.RecipeIngredients;
import java.util.List;

// RecipeIngredientService interface
public interface RecipeIngredientService {
    List<RecipeIngredients> findAll();
    RecipeIngredients findById(Long id);
    RecipeIngredients save(RecipeIngredients recipeIngredient);
    void deleteById(Long id);

    List<RecipeIngredients> getAllRecipeIngredients();

    RecipeIngredients getRecipeIngredientsById(Long id);

    RecipeIngredients createRecipeIngredients(RecipeIngredients recipeIngredients);

    RecipeIngredients updateRecipeIngredients(Long id, RecipeIngredients recipeIngredients);

    void deleteRecipeIngredients(Long id);
}

