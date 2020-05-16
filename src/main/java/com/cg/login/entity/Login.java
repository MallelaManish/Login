package com.cg.login.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_table2")
public class Login {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="password")
	private String password;
	@Column(name="emp_name")
	private String empName;
	@Column(name="role_id")
	private int roleid;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private double salary;
	@Column(name="gmail")
	private String gmail;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login(int empId, String password, String empName, int roleid, String designation, double salary, String gmail) {
		super();
		this.empId = empId;
		this.password = password;
		this.empName = empName;
		this.roleid = roleid;
		this.designation = designation;
		this.salary = salary;
		this.gmail = gmail;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
    
	

}
