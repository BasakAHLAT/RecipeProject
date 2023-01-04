package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> { }
