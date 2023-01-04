package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.RecipeIngredients;

@Repository
public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Long> { }

