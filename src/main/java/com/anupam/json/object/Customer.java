/**
 * 
 */
package com.anupam.json.object;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Anupam Sharma
 *
 */
@Document(indexName = "customer-index1", type = "customerObject")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String first_name;
	private String last_name;
	private String dateOfBirth;

	@Field(type = FieldType.Object)
	Address address;
	@Field(type = FieldType.Object)
	CommunicationInfo communication_information;
	@Field(type = FieldType.Object)
	PaymentInfo payment_details;

	public Customer() {
		super();
	}

	public Customer(String first_name, String last_name, String dateOfBirth) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CommunicationInfo getCommunication_information() {
		return communication_information;
	}

	public void setCommunication_information(CommunicationInfo communication_information) {
		this.communication_information = communication_information;
	}

	public PaymentInfo getPayment_details() {
		return payment_details;
	}

	public void setPayment_details(PaymentInfo payment_details) {
		this.payment_details = payment_details;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", communication_information=" + communication_information
				+ ", payment_details=" + payment_details + "]";
	}
}
