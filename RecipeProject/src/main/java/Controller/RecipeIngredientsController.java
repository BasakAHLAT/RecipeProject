package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import Service.*;
import Entity.*;

import java.util.List;

@RestController
public class RecipeIngredientsController {

    @Autowired
    private RecipeIngredientService recipeIngredientsService;

    @GetMapping("/recipeingredients")
    public @ResponseBody List<RecipeIngredients> getAllRecipeIngredients() {
        return recipeIngredientsService.getAllRecipeIngredients();
    }

    @GetMapping("/recipeingredients/{id}")
    public @ResponseBody RecipeIngredients getRecipeIngredientsById(@PathVariable Long id) {
        return recipeIngredientsService.getRecipeIngredientsById(id);
    }

    @PostMapping("/recipeingredients")
    public @ResponseBody RecipeIngredients createRecipeIngredients(@RequestBody RecipeIngredients recipeIngredients) {
        return recipeIngredientsService.createRecipeIngredients(recipeIngredients);
    }

    @PutMapping("/recipeingredients/{id}")
    public @ResponseBody RecipeIngredients updateRecipeIngredients(@PathVariable Long id, @RequestBody RecipeIngredients recipeIngredients) {
        return recipeIngredientsService.updateRecipeIngredients(id, recipeIngredients);
    }

    @DeleteMapping("/recipeingredients/{id}")
    public @ResponseBody void deleteRecipeIngredients(@PathVariable Long id) {
        recipeIngredientsService.deleteRecipeIngredients(id);
    }

}