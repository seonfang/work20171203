package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deg;

	@Id
	private int eid;

	private String ename;

	private double salary;

	public Employee() {
	}

	public String getDeg() {
		return this.deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [deg=" + deg + ", eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}







