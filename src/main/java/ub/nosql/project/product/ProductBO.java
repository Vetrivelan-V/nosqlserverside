package ub.nosql.project.product;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBO extends EcommerceObject {

	private String produuctId;
	private String companyId;
	private String categoryId;
	private String productName;
	private ArrayList<String> path;
	private String productDescription;
	private BigDecimal price;

	
	/** The tax matrix category. */
	private String sku;
	private long quantity;
	public String getProduuctId() {
		return produuctId;
	}
	public void setProduuctId(String produuctId) {
		this.produuctId = produuctId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public ArrayList<String> getPath() {
		return path;
	}
	public void setPath(ArrayList<String> path) {
		this.path = path;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductBO [produuctId=" + produuctId + ", companyId=" + companyId + ", categoryId=" + categoryId
				+ ", productName=" + productName + ", path=" + path + ", productDescription=" + productDescription
				+ ", price=" + price + ", sku=" + sku + ", quantity=" + quantity + "]";
	}
	 
	 
	

}
