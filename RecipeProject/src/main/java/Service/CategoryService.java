package Service;

import Entity.Category;

// CategoryService interface
public interface CategoryService {
    Object findAll();
    Category findById(Long id);
    Category save(Category category);
    void deleteById(Long id);
}
