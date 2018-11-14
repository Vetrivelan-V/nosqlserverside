package ub.nosql.project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class UserController {
	@Autowired
	UserService categoryService;

	@PostMapping("create")
	public UserBO createCategory(UserBO categoryBO) {

		return categoryService.createCategory(categoryBO);
	}

	@PostMapping("update")
	public UserBO updateCategory(UserBO categoryBO) {

		return categoryService.updateCategory(categoryBO);
	}

	@PostMapping("getbyid")
	public UserBO getCategoryById(UserBO categoryBO) {

		return categoryService.getCategoryById(categoryBO);
	}

}
