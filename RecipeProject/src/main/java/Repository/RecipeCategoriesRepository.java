package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.RecipeCategories;
@Repository
public interface RecipeCategoriesRepository extends JpaRepository<RecipeCategories, Long> { }
