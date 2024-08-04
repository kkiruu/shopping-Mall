package com.cg.smms.entities;
import java.time.LocalDate;

public class ShopOwner {
private long ID;
private String Name;
private String Address;
private LocalDate dob;
private Shop shop;
public ShopOwner(long iD, String name, String address, LocalDate dob, Shop shop) {
	super();
	ID = iD;
	Name = name;
	Address = address;
	this.dob = dob;
	this.shop = shop;
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
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}
public Owner addOwner(Owner Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Owner ec = new Owner();
    ec.setId(210);
    ec.setName("arun@123");
    ec.setAdress("Bangalore");
    ec.setDOB("19-11-1991");
    em.persist(ec);
    ec.setShope("SLV candiments");
    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Owner;
}


private void setOwner(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteOwner(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Owner p = entityManager.find(Name.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Name updateCollege(College college) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	Name  p= entityManager.find(Name.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(305);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public Owner searchOwner(Owner Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Owner  p= entityManager.find(Owner.class,207);
	  System.out.println(p.getOwnerName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Owner a = new Owner();
	a.addOwner("arun@123") ;
	a.updateOwner("Arun");
	a.deleteOwner("Name");
	a.searchOwner(a);

}

private void deleteOwner(String string) {
	// TODO Auto-generated method stub
	
}


private void addOwner(String string) {
	// TODO Auto-generated method stub
	
}

private void updateOwner(String string) {
	// TODO Auto-generated method stub
	
}

}
