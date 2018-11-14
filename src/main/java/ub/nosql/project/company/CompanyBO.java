package ub.nosql.project.company;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.cloud.firestore.annotation.IgnoreExtraProperties;

import ub.nosql.project.AddressBO;
import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
@IgnoreExtraProperties
public class CompanyBO extends EcommerceObject {

	private String companyId;
	private String name;
	private Date updatedDateTime;
	private Date creationDateTime;
	private String phoneNumber, officeEmailId;
	private boolean active;
	private AddressBO companyAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOfficeEmailId() {
		return officeEmailId;
	}

	public void setOfficeEmailId(String officeEmailId) {
		this.officeEmailId = officeEmailId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public AddressBO getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(AddressBO companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "CompanyBO [companyId=" + companyId + ", name=" + name + ", updatedDateTime=" + updatedDateTime
				+ ", creationDateTime=" + creationDateTime + ", phoneNumber=" + phoneNumber + ", officeEmailId="
				+ officeEmailId + ", active=" + active + ", companyAddress=" + companyAddress + "]";
	}

}
