package com.ofd.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofd.entity.Category;
import com.ofd.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	 CategoryService categoryService;
	@PostMapping("/category")
	 public Category createCategory(@RequestBody Category cate) {

		 return categoryService.createCategory(cate);

		 

		}

		 @GetMapping("/category")

		 public List<Category> getCategory()
		 {

		 return categoryService.getCategory();
		 }
		 @GetMapping("/category/{id}")

		 public Category getCategoryById(@PathVariable int id) {

		 return categoryService.getCategoryById(id);

		}

		 @DeleteMapping("/category")

		 public boolean deleteAllCategory() {

		 return categoryService.deleteAllCategory();

		}

		 @DeleteMapping("/category/{id}")

		 public String deleteById(@PathVariable int id) {

		 return categoryService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/category/{id}")

		 public Category updateCategory(@PathVariable int id,@RequestBody Category obj) {

		 return categoryService.updateCategory(id,obj);

		 }

		 

		 

		 



}
