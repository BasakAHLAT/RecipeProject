package Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import Entity.*;
import Repository.*;
import Controller.*;

import java.util.List;


// IngredientServiceImpl class
@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientsRepository;

    @Override
    public List<Ingredient> findAll() {
        return ingredientsRepository.findAll();
    }

    @Override
    public Ingredient findById(Long id) {
        return ingredientsRepository.findById(id).orElse(null);
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return ingredientsRepository.save(ingredient);
    }

    @Override
    public void deleteById(Long id) {
        ingredientsRepository.deleteById(id);
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return null;
    }

    @Override
    public Ingredient getIngredientById(Long id) {
        return null;
    }

    @Override
    public Ingredient updateIngredient(Long id, Ingredient ingredient) {
        return null;
    }

    @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        return null;
    }

    @Override
    public void deleteIngredient(Long id) {

    }

}
