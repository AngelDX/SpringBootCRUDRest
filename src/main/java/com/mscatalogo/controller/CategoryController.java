package com.mscatalogo.controller;

import com.mscatalogo.entity.Category;
import com.mscatalogo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService ;

    @GetMapping
    public ResponseEntity<List<Category>> listCategory(){
        return ResponseEntity.ok().body(categoryService.listAllCategory());
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category, BindingResult result){
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @PutMapping()
    public ResponseEntity<Category> update(@RequestBody Category category) {return ResponseEntity.ok(categoryService.updateCategory(category));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> listById(@PathVariable(required = true) Long id) {return ResponseEntity.ok().body(categoryService.findByCategory(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Long id) {categoryService.deleteCategory(id);
        return "Eliminacion Correcta";
    }

}
