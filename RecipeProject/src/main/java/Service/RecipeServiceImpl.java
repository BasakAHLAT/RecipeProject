package Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.*;
import Entity.*;

import java.util.List;

// RecipeServiceImpl class
@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return null;
    }

    @Override
    public Recipe getRecipeById(Long id) {
        return null;
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe updateRecipe(Long id, Recipe recipe) {
        return null;
    }

    @Override
    public void deleteRecipe(Long id) {

    }

}

