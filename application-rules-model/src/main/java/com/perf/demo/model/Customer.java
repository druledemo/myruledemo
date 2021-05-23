package com.perf.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	

	private String id ;
	private String custName;
	private String nationality;
	private int salary;
	private int age;
	private int cibilScore;
	private Address adr = new Address() ;
	
	private List<String> eligibleInsurances = new ArrayList<String> ();
	private List<String> firedRules = new ArrayList<String> ();
	
	
	
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFiredRules() {
		return firedRules;
	}
	public void setFiredRules(List<String> firedRules) {
		this.firedRules = firedRules;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public List<String> getEligibleInsurances() {
		return eligibleInsurances;
	}
	public void setEligibleInsurances(List<String> eligibleInsurances) {
		this.eligibleInsurances = eligibleInsurances;
	}
	
	public void addEligibleInsurances(String eligibleInsurance) {
		eligibleInsurances.add(eligibleInsurance);
	}

	public void addFiredRules(String ruleName) {
		firedRules.add(ruleName);
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", nationality=" + nationality + ", salary=" + salary
				+ ", age=" + age + ", cibilScore=" + cibilScore + ", adr=" + adr + ", eligibleInsurances="
				+ eligibleInsurances + ", firedRules=" + firedRules + "]";
	}
	

}
