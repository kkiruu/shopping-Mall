package com.cg.smms.entities;

import java.time.LocalDate;

public class Item {
	private long ID;
	private String itemName;
	private double price;
	private LocalDate manufacturingDate;
	private LocalDate expiry;
	private enum category{ CLOTHING, MOBILES, ACCESSIORIES }
	public Item(long iD, String itemName, double price, LocalDate manufacturingDate, LocalDate expiry) {
		super();
		ID = iD;
		this.itemName = itemName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expiry = expiry;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public Item addItem(Item Name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();
	    
	    
	    Item ec = new Item();
	    ec.setId(701);
	    ec.setitemName("Ironbox");
	    ec.setPrice(2500);
	    ec.setManufacturingDate("13-08-2023");
	    ec.setExpiry("");
	    ec.setItem("Accesories");
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
		  p.setId(401);

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
		a.updateItem("pizza");
		a.deleteItem("pizza");
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
