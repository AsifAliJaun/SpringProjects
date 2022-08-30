package com.java.jpa.persist;

import com.java.jpa.student.*;
import javax.persistence.*;

public class PersistStudent{
public static void main(String args[]) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	em.getTransaction()
	.begin();
	StudentEntity s1=new StudentEntity();
	s1.setS_id(114);
	s1.setS_name("jaun");
	s1.setS_age(24);
	
	StudentEntity s2=new StudentEntity();
	s2.setS_id(115);
	s2.setS_name("kohli");
	s2.setS_age(22);
	
	StudentEntity s3=new StudentEntity();
	s3.setS_id(116);
	s3.setS_name("Mahatma Gandhi");
	s3.setS_age(26);
	
	StudentEntity s4=new StudentEntity();
	s4.setS_id(117);
	s4.setS_name("ali");
	s4.setS_age(30);
	
	em.persist(s1);
    em.persist(s2);
	em.persist(s3);
	em.persist(s4);
	
	em.getTransaction().commit();
	 emf.close();
	em.close();
}
}
