package com.cg.smms.entities;

import java.time.LocalDate;

public class Employee {
private long ID;
private String Name;
private LocalDate dob;
private float Salary;
private String Address;
private String Designation;
private Shop Shop;
public Employee(long iD, String name, LocalDate dob, float salary, String address, String designation,
		com.cg.smms.entities.Shop shop) {
	super();
	ID = iD;
	Name = name;
	this.dob = dob;
	Salary = salary;
	Address = address;
	Designation = designation;
	Shop = shop;
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
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public Shop getShop() {
	return Shop;
}
public void setShop(Shop shop) {
	Shop = shop;
}
public Employee addCustomer(Employee Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Employee ec = new Employee();
    ec.setId(601);
    ec.setName("varun");
    ec.setAdress("Bangalore");
    ec.setDob("09-12-1997");
    ec.setSalary(20000);
    ec.setDesignation("job seeker");
    ec.setShop(SLV );

    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Employee;
}


private void setEmployee(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteEmployee(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Employee p = entityManager.find(Employee.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Employee updateUser(Employee employee) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	  employee  p= entityManager.find(employee.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(501);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public Employee searchEmployee(Employee Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Employee  p= entityManager.find(Employee.class,207);
	  System.out.println(p.getEmployeeName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Employee a = new Employee();
	a.addEmployee("varun@123") ;
	a.updateEmployee("Varun");
	a.deleteEmployee("Varun");
	a.searchEmployee("v");

}

private void deleteEmployee(String string) {
	// TODO Auto-generated method stub
	
}


private void addEmployee(String string) {
	// TODO Auto-generated method stub
	
}

private void updateEmployee(String string) {
	// TODO Auto-generated method stub
	
}
private void searchEmployee(String string) {
	// TODO Auto-generated method stub
	
}
}
