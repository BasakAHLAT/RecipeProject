package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Service.*;
import Entity.*;


@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "categories/list";
    }

    @GetMapping("/add")
    public String addCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "categories/add";
    }

    @PostMapping("/add")
    public String addCategory(Category category) {
        categoryService.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/{id}/edit")
    public String editCategoryForm(@PathVariable Long id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "categories/edit";
    }

    @PostMapping("/{id}/edit")
    public String editCategory(Category category) {
        categoryService.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/{id}/delete")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteById(id);
        return "redirect:/categories";
    }

}
