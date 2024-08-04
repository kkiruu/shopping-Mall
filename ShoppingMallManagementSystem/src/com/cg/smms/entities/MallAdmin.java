package com.cg.smms.entities;

public class MallAdmin {
private long ID;
private String Name;
private String Password;
private Mall mall;
private long Phone;
public MallAdmin(long iD, String name, String password, Mall mall, long phone) {
	super();
	ID = iD;
	Name = name;
	Password = password;
	this.mall = mall;
	Phone = phone;
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
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Mall getMall() {
	return mall;
}
public void setMall(Mall mall) {
	this.mall = mall;
}
public long getPhone() {
	return Phone;
}
public void setPhone(long phone) {
	Phone = phone;
}
public Admin addAdmin(Admin Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    Admin ec = new Admin();
    ec.setId(310);
    ec.setName("pavan@123");
    ec.settype("Admin");
    ec.setpassword("19111992");
    ec.setMall("SLV candiments");
    ec.setPhone("9480260889")
    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return Admin;
}


private void setAdmin(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteAdmin(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Admin p = entityManager.find(Name.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public Admin updateUser(Admin admin) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	admin  p= entityManager.find(admin.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(305);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public User searchAdmin(Admin Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  Admin  p= entityManager.find(Admin.class,207);
	  System.out.println(p.getAdminName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	Admin a = new Admin();
	a.addAdmin("pavan@123") ;
	a.updateAdmin("Pavan");
	a.deleteAdmin("Pavan");
	a.searchAdmin(a);

}

private void deleteAdmin(String string) {
	// TODO Auto-generated method stub
	
}


private void addAdmin(String string) {
	// TODO Auto-generated method stub
	
}

private void updateAdmin(String string) {
	// TODO Auto-generated method stub
	
}
}
