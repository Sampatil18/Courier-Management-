package com.cdac.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Courier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courier_id;
	private String recipient_name;
	private String recipient_address;
	private Long recipient_contact;
	private String sender_name;
	private String sender_address;
	private Long sender_contact;
	private String courier_name;
	private double rate;
	private String status;
//	private LocalDate order_date;
//	private LocalDate delivery_date;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer sender;

	public int getCourier_id() {
		return courier_id;
	}

	public void setCourier_id(int courier_id) {
		this.courier_id = courier_id;
	}

	public String getRecipient_name() {
		return recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getRecipient_address() {
		return recipient_address;
	}

	public void setRecipient_address(String recipient_address) {
		this.recipient_address = recipient_address;
	}

	public Long getRecipient_contact() {
		return recipient_contact;
	}

	public void setRecipient_contact(Long recipient_contact) {
		this.recipient_contact = recipient_contact;
	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public LocalDate getOrder_date() {
//		return order_date;
//	}
//
//	public void setOrder_date(LocalDate order_date) {
//		this.order_date = order_date;
//	}
//
//	public LocalDate getDelivery_date() {
//		return delivery_date;
//	}
//
//	public void setDelivery_date(LocalDate delivery_date) {
//		this.delivery_date = delivery_date;
//	}

	
	
	
	public Customer getSender() {
		return sender;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getSender_address() {
		return sender_address;
	}

	public void setSender_address(String sender_address) {
		this.sender_address = sender_address;
	}

	public Long getSender_contact() {
		return sender_contact;
	}

	public void setSender_contact(Long sender_contact) {
		this.sender_contact = sender_contact;
	}

	public String getCourier_name() {
		return courier_name;
	}

	public void setCourier_name(String courier_name) {
		this.courier_name = courier_name;
	}

	public void setSender(Customer sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "Courier [courier_id=" + courier_id + ", recipient_name=" + recipient_name + ", recipient_address="
				+ recipient_address + ", recipient_contact=" + recipient_contact + ", sender_name=" + sender_name
				+ ", sender_address=" + sender_address + ", sender_contact=" + sender_contact + ", courier_name="
				+ courier_name + ", rate=" + rate + ", status=" + status + ", sender=" + sender + "]";
	}		
}
