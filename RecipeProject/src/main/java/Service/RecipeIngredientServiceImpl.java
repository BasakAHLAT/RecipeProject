package Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import Entity.*;
import Repository.*;
import java.util.List;
// RecipeIngredientServiceImpl class
@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    @Autowired
    private RecipeIngredientsRepository recipeIngredientRepository;

    @Override
    public List<RecipeIngredients> findAll() {
        return recipeIngredientRepository.findAll();
    }

    @Override
    public RecipeIngredients findById(Long id) {
        return recipeIngredientRepository.findById(id).orElse(null);
    }

    @Override
    public RecipeIngredients save(RecipeIngredients recipeIngredient) {
        return recipeIngredientRepository.save(recipeIngredient);
    }

    @Override
    public void deleteById(Long id) {
        recipeIngredientRepository.deleteById(id);
    }

    @Override
    public List<RecipeIngredients> getAllRecipeIngredients() {
        return null;
    }

    @Override
    public RecipeIngredients getRecipeIngredientsById(Long id) {
        return null;
    }

    @Override
    public RecipeIngredients createRecipeIngredients(RecipeIngredients recipeIngredients) {
        return null;
    }

    @Override
    public RecipeIngredients updateRecipeIngredients(Long id, RecipeIngredients recipeIngredients) {
        return null;
    }

    @Override
    public void deleteRecipeIngredients(Long id) {

    }

}
