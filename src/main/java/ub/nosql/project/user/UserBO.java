package ub.nosql.project.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBO extends EcommerceObject {

	private String userId;
	private int admin;
	private String firstName,lastName;
	private String companyId;
	private String emailId;
	private String phone;
	private boolean isValid;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "UserBO [userId=" + userId + ", admin=" + admin + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", companyId=" + companyId + ", emailId=" + emailId + ", phone=" + phone + ", isValid=" + isValid
				+ "]";
	}
	
}
