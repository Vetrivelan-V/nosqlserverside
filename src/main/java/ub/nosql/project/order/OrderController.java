package ub.nosql.project.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class OrderController {
	@Autowired
	OrderService categoryService;

	@PostMapping("create")
	public OrderBO createCategory(OrderBO categoryBO) {

		return categoryService.createCategory(categoryBO);
	}

	@PostMapping("update")
	public OrderBO updateCategory(OrderBO categoryBO) {

		return categoryService.updateCategory(categoryBO);
	}

	@PostMapping("getbyid")
	public OrderBO getCategoryById(OrderBO categoryBO) {

		return categoryService.getCategoryById(categoryBO);
	}

}
