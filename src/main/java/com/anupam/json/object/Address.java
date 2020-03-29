/**
 * 
 */
package com.anupam.json.object;

/**
 * @author Anupam Sharma
 *
 */
public class Address {
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private String street_name;
	private String street_Number;
	
	public Address() {
		super();
	}

	public Address(String city, String state, String zipcode, String country, String street_name,
			String street_Number) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.street_name = street_name;
		this.street_Number = street_Number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getStreet_Number() {
		return street_Number;
	}

	public void setStreet_Number(String street_Number) {
		this.street_Number = street_Number;
	}

	@Override
	public String toString() {
		return "Customer [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", country=" + country
				+ ", street_name=" + street_name + ", street_Number=" + street_Number + "]";
	}

}
