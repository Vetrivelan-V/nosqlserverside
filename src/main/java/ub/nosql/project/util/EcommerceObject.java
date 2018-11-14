package ub.nosql.project.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.google.cloud.firestore.annotation.Exclude;
import com.google.cloud.firestore.annotation.IgnoreExtraProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@IgnoreExtraProperties
public class EcommerceObject {
	@Exclude
	private int exceptionId;
	@Exclude
	private String message;
	@Exclude
	private boolean isException = false;
	@Exclude
	long id;

	@Exclude
	public int getExceptionId() {
		return exceptionId;
	}

	public void setExceptionId(int exceptionId) {
		this.exceptionId = exceptionId;
	}

	@Exclude
	public boolean isException() {
		return isException;
	}

	@Exclude
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setException(boolean isException) {
		this.isException = isException;
	}

	@JsonIgnore
	@JsonProperty(access = Access.WRITE_ONLY)
	@Exclude
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SoccratesObject [exceptionId=" + exceptionId + ", message=" + message + ", isException=" + isException
				+ ", id=" + id + "]";
	}
}
