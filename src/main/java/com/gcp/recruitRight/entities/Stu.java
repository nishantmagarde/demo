package com.gcp.recruitRight.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", a=" + a + "]";
	}
	public Stu(int id, int a) {
		super();
		this.id = id;
		this.a = a;
	}
	
}
