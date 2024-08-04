package com.cg.smms.entities;

import java.util.List;

public class Mall {
private long ID;
public Mall(long iD, MallAdmin mallAdmin, String mallName, String location, List<Shop> shops) {
	super();
	ID = iD;
	this.mallAdmin = mallAdmin;
	this.mallName = mallName;
	this.location = location;
	this.shops = shops;
}
private MallAdmin mallAdmin;
private String mallName;
private String location;
private List<Shop> shops;
private enum categories{
	REGIONAL,SUPERREGIONAL
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public MallAdmin getMallAdmin() {
	return mallAdmin;
}
public void setMallAdmin(MallAdmin mallAdmin) {
	this.mallAdmin = mallAdmin;
}
public String getMallName() {
	return mallName;
}
public void setMallName(String mallName) {
	this.mallName = mallName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Shop> getShops() {
	return shops;
}
public void setShops(List<Shop> shops) {
	this.shops = shops;
};
public Item addItem(Item Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Item ec = new Item();
    ec.setId(701);
    ec.setItemName("More Mall");
    ec.setItemAdmin("Arun");
    ec.setItem(getShops());
    ec.setAddress("Bangalore");
    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Item;
}


private void setItem(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteItem(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Item p = entityManager.find(Item.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Item updateShop(Item item) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	  Item  p= entityManager.find(Item.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(701);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public Item searchItem(Item Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Item  p= entityManager.find(Item.class,207);
	  System.out.println(p.getItemName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Item a = new Item();
	a.addItem("Pizza") ;
	a.updateItem("Pizza");
	a.deleteItem("Pizza");
	a.searchItem("p");

}

private void deleteItem(String string) {
	// TODO Auto-generated method stub
	
}


private void addItem(String string) {
	// TODO Auto-generated method stub
	
}

private void updateItem(String string) {
	// TODO Auto-generated method stub
	
}
private void searchItem(String string) {
	// TODO Auto-generated method stub
	
}
}
