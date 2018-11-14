package ub.nosql.project.company;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyTestCases {
	String primaryDocumentId = null;

	@Autowired
	CompanyController companyController;
	@Test 
	public void createCompany() {
		CompanyBO companyBO = new CompanyBO();
		companyBO.setName("UBShop");
		companyBO.setUpdatedDateTime(new Date());
		companyBO.setCreationDateTime(new Date());
		assertNotNull(companyController.createCompanyBO(companyBO).getCompanyId());
	}

	@Test
	public void updateCompany() {
		primaryDocumentId="BJU2AVgAHpb17vcCGmOq";
		if (primaryDocumentId != null) {
			CompanyBO companyBO = new CompanyBO();
			companyBO.setCompanyId(primaryDocumentId);
			assertNotNull(companyController.updateCompanyBO(companyBO));
		} else {
			fail("First Test Failed ");
		}
	}
	@Test
	public void getById()
	{
		primaryDocumentId="";
		
	}
}
