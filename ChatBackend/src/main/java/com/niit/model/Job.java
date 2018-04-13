package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Job {
	@Id
	String jobId;
	String jobDesignation;
	String company;
	int salary;
	String location;
	String jobDesc;
	

}
