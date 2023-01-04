package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.Recipe;
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> { }
