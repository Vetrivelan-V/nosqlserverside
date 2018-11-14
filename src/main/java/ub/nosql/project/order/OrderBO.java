package ub.nosql.project.order;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.AddressBO;
import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBO extends EcommerceObject {

	private String orderId;
	private String userId;
	private String companyId;
	private AddressBO billingAddress;
	private int orderStatus;
	private AddressBO deliveryAddress;
	private ArrayList<OrderLineBO> orderLines;
	private BigDecimal totalPrice,tax,subTotal;
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AddressBO getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressBO billingAddress) {
		this.billingAddress = billingAddress;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public AddressBO getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(AddressBO deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public ArrayList<OrderLineBO> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(ArrayList<OrderLineBO> orderLines) {
		this.orderLines = orderLines;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "OrderBO [orderId=" + orderId + ", userId=" + userId + ", companyId=" + companyId + ", billingAddress="
				+ billingAddress + ", orderStatus=" + orderStatus + ", deliveryAddress=" + deliveryAddress
				+ ", orderLines=" + orderLines + ", totalPrice=" + totalPrice + ", tax=" + tax + ", subTotal="
				+ subTotal + "]";
	}

	 
	

}
