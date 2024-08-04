package com.cg.smms.entities;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDetails {
private long ID;
private LocalDateTime dateOfPurchase;
private float total;
private List<Customer>customers;
private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING};
private Customer Customer;
private Shop shop;
public OrderDetails(long iD, LocalDateTime dateOfPurchase, float total, List<com.cg.smms.entities.Customer> customers,
		com.cg.smms.entities.Customer customer, Shop shop) {
	super();
	ID = iD;
	this.dateOfPurchase = dateOfPurchase;
	this.total = total;
	this.customers = customers;
	Customer = customer;
	this.shop = shop;
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public LocalDateTime getDateOfPurchase() {
	return dateOfPurchase;
}
public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
	this.dateOfPurchase = dateOfPurchase;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public Customer getCustomer() {
	return Customer;
}
public void setCustomer(Customer customer) {
	Customer = customer;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}

}

