package Service;

import Entity.Ingredient;

import java.util.List;

// IngredientService interface
public interface IngredientService {
    List<Ingredient> findAll();
    Ingredient findById(Long id);
    Ingredient save(Ingredient ingredient);
    void deleteById(Long id);

    List<Ingredient> getAllIngredients();

    Ingredient getIngredientById(Long id);

    Ingredient updateIngredient(Long id, Ingredient ingredient);

    Ingredient createIngredient(Ingredient ingredient);

    void deleteIngredient(Long id);
}



