package ub.nosql.project.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController("company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	@PostMapping("create")
	public CompanyBO createCompanyBO(CompanyBO companyBO) {

		return companyService.createCompanyBO(companyBO);
	}

	@PostMapping("update")
	public CompanyBO updateCompanyBO(CompanyBO companyBO) {

		return companyService.updateCompanyBO(companyBO);
	}

	@PostMapping("getbyid")
	public CompanyBO getCompanyById(CompanyBO companyBO) {

		return companyService.getCompanyById(companyBO);
	}

}
