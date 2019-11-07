package com.example.demo.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Employees implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private int entryNumber;
	private String lastName;
	private String firstName;
	private String address;
	private int phone;
	private Date hireDate;
	private Date fireDate;
	private String status;
	private String contract;

    @Transient
	@ManyToOne(cascade = CascadeType.ALL)
	private Company company;

	@Transient
	@ManyToOne(cascade = {CascadeType.ALL})
	private Business business;

	@ManyToOne(cascade = {CascadeType.DETACH})
	private Department department;

    @Transient
	@ManyToOne(cascade = {CascadeType.ALL})
	private Units units;

	private String position;

	public Employees() {

	}

	public Employees(final int entryNumber, final String lastName, final String firstName, final String address, final int phone,
                     final Date hireDate,
                     final Date fireDate, final String status,
                     final String contract, final Company company, final Business business, final Department department, final Units units,
                     final String position) {
		this.entryNumber = entryNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phone = phone;
		this.hireDate = hireDate;
		this.fireDate = fireDate;
		this.status = status;
		this.contract = contract;
		this.company = company;
		this.business = business;
		this.department = department;
		this.units = units;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getEntryNumber() {
		return entryNumber;
	}

	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getFireDate() {
		return fireDate;
	}

	public void setFireDate(Date fireDate) {
		this.fireDate = fireDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}

