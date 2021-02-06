package com.epam.oops.encapsulation;

public class DataBinding {

	private String userEmail;
	
	public DataBinding(String userEmail) {
		this.userEmail=userEmail;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "DataBinding [userEmail=" + userEmail + "]";
	}
	
}
