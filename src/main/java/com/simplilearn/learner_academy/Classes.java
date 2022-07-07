package com.simplilearn.learner_academy;



import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "classno")
	private int classno;

	@Column(name = "c_name")
	private String c_name;
     @ElementCollection
     @JoinTable(name="tstudent",joinColumns=@JoinColumn(name="classno"))
	@Column(name = "student")
	private Map<Integer,String> student;
     
	@Column(name="subject")
	private String subject;


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@ManyToMany(mappedBy="classes")
	Set<Teachers> teachers;

	public Classes() {
	}

	

	public Classes(String c_name, Map<Integer, String> student, String subject) {
		super();
		this.c_name = c_name;
		this.student = student;
		this.subject = subject;
	}

	public int getClassno() {
		return classno;
	}

	public void setClassno(int classno) {
		this.classno = classno;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		c_name = c_name;
	}

	public Map<Integer, String> getStudent() {
		return student;
	}

	public void setStudent(Map<Integer, String> student) {
		this.student = student;
	}

	public Set<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teachers> teachers) {
		this.teachers = teachers;
	}

}