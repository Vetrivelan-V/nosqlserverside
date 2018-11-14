package ub.nosql.project.category;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryBO extends EcommerceObject {

	private String categoryId;
	private String parentId;
	private String categoryName;
	private String comapanyId;
	private String categoryDescription;
	
	private ArrayList<CategoryBO> subCategories;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ArrayList<CategoryBO> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(ArrayList<CategoryBO> subCategories) {
		this.subCategories = subCategories;
	}

	public String getComapanyId() {
		return comapanyId;
	}

	public void setComapanyId(String comapanyId) {
		this.comapanyId = comapanyId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "CategoryBO [categoryId=" + categoryId + ", parentId=" + parentId + ", categoryName=" + categoryName
				+ ", comapanyId=" + comapanyId + ", categoryDescription=" + categoryDescription + ", subCategories="
				+ subCategories + "]";
	}

	 

}
