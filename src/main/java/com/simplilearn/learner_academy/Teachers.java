package com.simplilearn.learner_academy;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="teachers")
public class Teachers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tid")
	private int tid;
	
	
	@Column(name="tname")
	private String tname;
	

	@ManyToMany
	@JoinTable(name = "class_teach", joinColumns = @JoinColumn(name = "tid", referencedColumnName = "tid"), inverseJoinColumns = @JoinColumn(name = "classno", referencedColumnName = "classno"))
	Set<Classes> classes;// ***


	public Teachers() {
		
	}
	public Teachers(String tname) {
		super();
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Classes> getClasses() {
		return classes;
	}
	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}
	
}