package com.cg.smms.entities;

public class User {
private long ID;
private String Name;
private String type;
private String password;
public User(long iD, String name, String type, String password) {
	super();
	ID = iD;
	Name = name;
	this.type = type;
	this.password = password;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User addUser(User Name) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");  
    EntityManager em=emf.createEntityManager();  
    em.getTransaction().begin();
    
    
    User ec = new User();
    ec.setId(110);
    ec.setName("madan@123");
    ec.settype("Admin");
    ec.setpassword("19111991");
    em.persist(ec);

    em.getTransaction().commit();
    
    emf.close();
    em.close();
	return User;
}


private void setUser(String string) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean deleteUser(long id) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  User p = entityManager.find(Name.class,207);//select * from emp where eno =2
	  entityManager.remove(p);


	  entityManager.getTransaction().commit();
	return false;
}

@Override
public User updateUser(User user) {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //Certificate p= new Certificate()
	user  p= entityManager.find(user.class,207);//select * from emp where eno =2
	 // p.setName("Amul");
	  p.setId(305);

	  entityManager.getTransaction().commit();
	return null;
}

@Override
public User searchUser(User Name) {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
	  EntityManager entityManager = emf.createEntityManager();

	  entityManager.getTransaction().begin();
	  int key ;
	  
	  
	  //EmployeeClass p= new EmployeeClass()
	  User  p= entityManager.find(User.class,207);
	  System.out.println(p.getUserName());
    entityManager.getTransaction().commit();
	return null;
}
public static void main(String [] args) {
	User a = new User();
	a.addUser("arun@123") ;
	a.updateUser("Arun");
	a.deleteUser("Name");
	a.searchUser(a);

}

private void deleteUser(String string) {
	// TODO Auto-generated method stub
	
}


private void addUser(String string) {
	// TODO Auto-generated method stub
	
}

private void updateUser(String string) {
	// TODO Auto-generated method stub
	
}
}
