package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Forum {
	@Id
	@GeneratedValue
	
    int forumId;
	String forumName;
	String forumContext;
	Date createDate;
	int likes;
	String loginname;
	String status;
	
}