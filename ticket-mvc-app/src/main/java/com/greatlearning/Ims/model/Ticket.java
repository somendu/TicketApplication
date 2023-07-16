package com.greatlearning.Ims.model;

import java.text.SimpleDateFormat;
import java.util.Date;   




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tickets")
@NoArgsConstructor
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="Date")
	private String date;
	@Column(name="descrition")
	private String description;
	@Column(columnDefinition = "LONGTEXT",name = "content")
	private String content;
	
	
	

}
