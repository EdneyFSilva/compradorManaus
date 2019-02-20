package com.sic.compradormanaus.api.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Supplier {

	@Id
	private String id;
	
	private Date created;
	
	@DBRef(lazy=true)
	private User user;
	
	private String title;
	
	
	
}
