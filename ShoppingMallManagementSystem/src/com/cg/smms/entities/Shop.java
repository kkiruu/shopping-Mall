package com.cg.smms.entities;

import java.rmi.dgc.Lease;
import java.util.List;

public class Shop {
private long shopId;
private enum shopCategory{ WHOLESALE , RETAIL };
private List<Employee>shopEmployees; 
private String shopName;
private List<Customer> customers;
private enum shopStatus{ OPEN , CLOSED};
private ShopOwner shopOwner;
private Lease leaseStatus;
public Shop(long shopId, List<Employee> shopEmployees, String shopName, List<Customer> customers, ShopOwner shopOwner,
		Lease leaseStatus) {
	super();
	this.shopId = shopId;
	this.shopEmployees = shopEmployees;
	this.shopName = shopName;
	this.customers = customers;
	this.shopOwner = shopOwner;
	this.leaseStatus = leaseStatus;
}
public long getShopId() {
	return shopId;
}
public void setShopId(long shopId) {
	this.shopId = shopId;
}
public List<Employee> getShopEmployees() {
	return shopEmployees;
}
public void setShopEmployees(List<Employee> shopEmployees) {
	this.shopEmployees = shopEmployees;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public ShopOwner getShopOwner() {
	return shopOwner;
}
public void setShopOwner(ShopOwner shopOwner) {
	this.shopOwner = shopOwner;
}
public Lease getLeaseStatus() {
	return leaseStatus;
}
public void setLeaseStatus(Lease leaseStatus) {
	this.leaseStatus = leaseStatus;
}
public Shop addShop(Shop Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Shop ec = new Shop();
    ec.setId(401);
    ec.setshopName("SLV candiments");
    ec.setshopOwner("Arun");
    ec.setShopEmployees(getShopEmployees());
    ec.setCustomers(customers);
    ec.setleaseStatus();
    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Shop;
}


private void setCustomer(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteShop(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Shop p = entityManager.find(Shop.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Shop updateShop(Shop shop) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	  shop  p= entityManager.find(shop.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(401);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public Customer searchShop(Shop Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Customer  p= entityManager.find(Shop.class,207);
	  System.out.println(p.getShopName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Shop a = new Shop();
	a.addShop("SLV candiments") ;
	a.updateShop("SLV candiments");
	a.deleteShop("SLV candiments");
	a.searchShop("slv");

}

private void deleteShop(String string) {
	// TODO Auto-generated method stub
	
}


private void addShop(String string) {
	// TODO Auto-generated method stub
	
}

private void updateShop(String string) {
	// TODO Auto-generated method stub
	
}
private void searchShop(String string) {
	// TODO Auto-generated method stub
	
}
}
