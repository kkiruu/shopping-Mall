package com.cg.smms.entities;

import java.util.List;

public class Customer {
private long ID;
private String Name;
private List<OrderDetails> orders;
private long phone_no;
private String email_id;
public Customer(long iD, String name, List<OrderDetails> orders, long phone_no, String email_id) {
	super();
	ID = iD;
	Name = name;
	this.orders = orders;
	this.phone_no = phone_no;
	this.email_id = email_id;
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public List<OrderDetails> getOrders() {
	return orders;
}
public void setOrders(List<OrderDetails> orders) {
	this.orders = orders;
}
public long getPhone_no() {
	return phone_no;
}
public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public Customer addCustomer(Customer Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Customer ec = new Customer();
    ec.setId(501);
    ec.setName("Abhishek");
    ec.setOrders("Grocery");
    
    ec.setEmail("abhi.huy@gmail.com");
    ec.setPhone("9480260890")
    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Customer;
}


private void setCustomer(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteCustomer(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Customer p = entityManager.find(Name.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Customer updateUser(Customer customer) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	  customer  p= entityManager.find(customer.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(501);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public Customer searchCustomer(Customer Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Customer  p= entityManager.find(Customer.class,207);
	  System.out.println(p.getCustomerName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Customer a = new Customer();
	a.addCustomer("Abhishek") ;
	a.updateCustomer("Abhishek");
	a.deleteCustomer("Abhishek");
	a.searchCustomer("a");

}

private void deleteCustomer(String string) {
	// TODO Auto-generated method stub
	
}


private void addCustomer(String string) {
	// TODO Auto-generated method stub
	
}

private void updateCustomer(String string) {
	// TODO Auto-generated method stub
	
}
private void searchCustomer(String string) {
	// TODO Auto-generated method stub
	
}
}
