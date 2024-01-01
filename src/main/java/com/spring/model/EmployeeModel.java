package com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetails")
public class EmployeeModel  {
	@Id
	@Column(columnDefinition = "varchar(60)",nullable = false)
	private String eid;
	@Column(columnDefinition = "varchar(100)")
	private String name; 
	@Column(columnDefinition = "varchar(100)")
	private String dob;
	@Column(columnDefinition = "varchar(50)")
	private String phone;
	@Column(columnDefinition = "varchar(100)")
	private String email;
	public EmployeeModel() {
		super();
	}
	public EmployeeModel(String eid, String name, String dob, String phone, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeModel [eid=" + eid + ", name=" + name + ", dob=" + dob + ", phone=" + phone + ", email=" + email
				+ "]";
	}
}
