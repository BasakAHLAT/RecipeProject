package Service;

import Entity.*;
import Repository.*;
import Controller.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

// CategoryServiceImpl class
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Object findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

}

