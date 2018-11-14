package ub.nosql.project.paymentgateway;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ub.nosql.project.util.EcommerceObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsBO extends EcommerceObject {

	private String optionId;
	private String key;
	private String paymentId;
	private String value;
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	@Override
	public String toString() {
		return "OptionsBO [optionId=" + optionId + ", key=" + key + ", paymentId=" + paymentId + ", value=" + value
				+ "]";
	}
	 

}
