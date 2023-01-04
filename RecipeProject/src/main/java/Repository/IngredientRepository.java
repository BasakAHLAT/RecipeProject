package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> { }

