package ub.nosql.project.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@PostMapping("create")
	public CategoryBO createCategory(CategoryBO categoryBO) {

		return categoryService.createCategory(categoryBO);
	}

	@PostMapping("update")
	public CategoryBO updateCategory(CategoryBO categoryBO) {

		return categoryService.updateCategory(categoryBO);
	}

	@PostMapping("getbyid")
	public CategoryBO getCategoryById(CategoryBO categoryBO) {

		return categoryService.getCategoryById(categoryBO);
	}

}
