package com.abhi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Course_Dtls")
public class Course {
	
	@Id
	private Integer cid;
	private String name;
	private Double price;
	

}
