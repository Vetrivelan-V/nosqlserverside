package ub.nosql.project.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class PaymentController {
	@Autowired
	PaymentService categoryService;

	@PostMapping("create")
	public PaymentBO createCategory(PaymentBO categoryBO) {

		return categoryService.createCategory(categoryBO);
	}

	@PostMapping("update")
	public PaymentBO updateCategory(PaymentBO categoryBO) {

		return categoryService.updateCategory(categoryBO);
	}

	@PostMapping("getbyid")
	public PaymentBO getCategoryById(PaymentBO categoryBO) {

		return categoryService.getCategoryById(categoryBO);
	}

}
