package com.abby.bookclubfullspring.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //declares that its going to be a part of MySQL
@Table(name="books") // gives the table the name of the model
public class Book {
	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates as auto-increment
    private Long id;
	
	@Size(min = 3, max = 255)//validation for strings
	@NotEmpty(message= "Book title is required!")//validation for not null
	private String title; //The persistent layer will change this for you (don't try and snake case, will cause errors later on)
	
	@Size(min = 2, max = 50)
	@NotEmpty(message = "Author is required!")
	private String authorName;
	
	@Size(min=3, max = 255)
	@NotEmpty(message = "Please give a description of the book.")
	private String description;
	
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
	//Constructors
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	



	//adds when updated at and created at
	@PrePersist //adds the created at date and time to sql on creation
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate //adds the updated at date and time when being updated
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
    
    

}
	

