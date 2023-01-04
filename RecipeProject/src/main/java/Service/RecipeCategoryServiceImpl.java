package Service;

import Entity.RecipeCategories;
import Repository.RecipeCategoriesRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// RecipeCategoryServiceImpl class
@Service
public class RecipeCategoryServiceImpl implements RecipeCategoryService {

    @Autowired
    private RecipeCategoriesRepository recipeCategoryRepository;

    @Override
    public List<RecipeCategories> findAll() {
        return recipeCategoryRepository.findAll();
    }

    @Override
    public RecipeCategories findById(Long id) {
        return recipeCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public RecipeCategories save(RecipeCategories recipeCategory) {
        return recipeCategoryRepository.save(recipeCategory);
    }

    @Override
    public void deleteById(Long id) {
        recipeCategoryRepository.deleteById(id);
    }

    @Override
    public List<RecipeCategories> getAllRecipeCategory() {
        return null;
    }

    @Override
    public RecipeCategories getRecipeCategoryById(Long id) {
        return null;
    }

    @Override
    public RecipeCategories createRecipeCategory(RecipeCategories recipeCategories) {
        return null;
    }

    @Override
    public RecipeCategories updateRecipeCategories(Long id, RecipeCategories recipeCategories) {
        return null;
    }

    @Override
    public void deleteRecipeCategories(Long id) {

    }

}

