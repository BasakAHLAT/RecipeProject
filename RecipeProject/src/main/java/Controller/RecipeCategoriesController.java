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
public class RecipeCategoriesController {

    @Autowired
    private RecipeCategoryService recipeCategoriesService;

    @GetMapping("/recipecategories")
    public @ResponseBody List<RecipeCategories> getAllRecipeCategories() {
        return recipeCategoriesService.getAllRecipeCategory();
    }

    @GetMapping("/recipecategories/{id}")
    public @ResponseBody RecipeCategories getRecipeCategoriesById(@PathVariable Long id) {
        return recipeCategoriesService.getRecipeCategoryById(id);
    }

    @PostMapping("/recipecategories")
    public @ResponseBody RecipeCategories createRecipeCategories(@RequestBody RecipeCategories recipeCategories) {
        return recipeCategoriesService.createRecipeCategory(recipeCategories);
    }

    @PutMapping("/recipecategories/{id}")
    public @ResponseBody RecipeCategories updateRecipeCategories(@PathVariable Long id, @RequestBody RecipeCategories recipeCategories) {
        return recipeCategoriesService.updateRecipeCategories(id, recipeCategories);
    }

    @DeleteMapping("/recipecategories/{id}")
    public @ResponseBody void deleteRecipeCategories(@PathVariable Long id) {
        recipeCategoriesService.deleteRecipeCategories(id);
    }

}