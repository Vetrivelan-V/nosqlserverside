package ub.nosql.project.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class ProductController {
	@Autowired
	ProductService categoryService;

	@PostMapping("create")
	public ProductBO createCategory(ProductBO categoryBO) {

		return categoryService.createCategory(categoryBO);
	}

	@PostMapping("update")
	public ProductBO updateCategory(ProductBO categoryBO) {

		return categoryService.updateCategory(categoryBO);
	}

	@PostMapping("getbyid")
	public ProductBO getCategoryById(ProductBO categoryBO) {

		return categoryService.getCategoryById(categoryBO);
	}

}
