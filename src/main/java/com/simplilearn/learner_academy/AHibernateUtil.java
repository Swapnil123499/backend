package com.simplilearn.learner_academy;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class AHibernateUtil {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction= session.beginTransaction();
		
		
		
		

		
		
		
		//**********************************************//
		Classes class1=new Classes();
		class1.setClassno(1);
		class1.setC_name("class 8");
		class1.setSubject("hindi");
		Map<Integer,String> student=new HashMap<Integer,String>();
		student.put(1, "harish");
		student.put(2, "dani");
		student.put(3, "pritam");
		student.put(4, "kunal");
		student.put(5, "shamu");
		student.put(6, "lily");
		student.put(7, "chmely");
		
		class1.setStudent(student);
		session.save(class1);
		//********************************************//
		Classes clas1=new Classes();
		clas1.setClassno(1);
		clas1.setC_name("class 8");
		clas1.setSubject("math");
		Map<Integer,String> student8=new HashMap<Integer,String>();
		student8.put(1, "harish");
		student8.put(2, "dani");
		student8.put(3, "pritam");
		student8.put(4, "kunal");
		student8.put(5, "shamu");
		student8.put(6, "lily");
		student8.put(7, "chmely");
		
		clas1.setStudent(student8);
		session.save(clas1);
		
		//********************************************//
		Classes class2=new Classes();
		class2.setClassno(2);
		class2.setC_name("class 9");
		class2.setSubject("english");
		Map<Integer,String> student1=new HashMap<Integer,String>();
		student1.put(1, "ramesh");
		student1.put(2, "rita");
		student1.put(3, "sunita");
		student1.put(4, "lata");
		student1.put(5, "tapsi");
		student1.put(6, "santanu");
		student1.put(7, "manda");
		student1.put(8, "kanta");
		student1.put(9, "suresh");
		student1.put(10, "ramesh");
		class2.setStudent(student1);
		session.save(class2);
		//***************************************//
		Classes class9=new Classes();
		class9.setClassno(2);
		class9.setC_name("class 9");
		class9.setSubject("biology");
		Map<Integer,String> stu=new HashMap<Integer,String>();
		stu.put(1, "ramesh");
		stu.put(2, "rita");
		stu.put(3, "sunita");
		stu.put(4, "lata");
		stu.put(5, "tapsi");
		stu.put(6, "santanu");
		stu.put(7, "manda");
		stu.put(8, "kanta");
		stu.put(9, "suresh");
		stu.put(10, "ramesh");
		class9.setStudent(stu);
		session.save(class9);
		//***************************************//
		Teachers tcr=new Teachers();
		tcr.setTid(1);
		tcr.setTname("khanSir");
		session.save(tcr);
		//******************************************//
		Teachers tcr1=new Teachers();
		tcr1.setTid(2);
		tcr1.setTname("ojhasir");
		session.save(tcr1);
		
		//**********************************************//
		Set<Teachers> teacher1=new HashSet<Teachers>();
		teacher1.add(tcr1);
		class1.setTeachers(teacher1);
		//***********************************************//
		Set<Teachers> teacher5=new HashSet<Teachers>();
		teacher5.add(tcr);
		clas1.setTeachers(teacher5);
	//*****************************************************//	
		
		Set<Teachers> teacher2=new HashSet<Teachers>();
		teacher2.add(tcr);
		class2.setTeachers(teacher2);
	//***********************************************************//
		Set<Teachers> teacher27=new HashSet<Teachers>();
		teacher27.add(tcr1);
		class9.setTeachers(teacher27);
	//***********************************************************//	
		transaction.commit();
		factory.close();
		session.close();
	}

}