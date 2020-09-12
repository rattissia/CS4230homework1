package edu.weber.model;
import java.io.Serializable;
import java.util.List;


public class Contact implements Serializable {
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;

	private String addressType;
	
	private List<Address> addresses;
	
	
	
	public Contact(String firstName, String lastName, String phoneNumber, String addressType, List<Address> addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.addressType = addressType;
		this.addresses = addresses;
	}

	public Contact() {
		this(null, null, null, null, null);
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
}


