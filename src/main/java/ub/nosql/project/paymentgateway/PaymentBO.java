package ub.nosql.project.paymentgateway;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentBO extends EcommerceObject {

	private String paymentId;
	private String companyId;
	private String paymentName;
	private ArrayList<OptionsBO> options;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public ArrayList<OptionsBO> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<OptionsBO> options) {
		this.options = options;
	}

}
