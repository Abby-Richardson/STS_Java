package com.abby.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //declares that it is going to be a part of MySQL
@Table(name="expenses") //gives the table name of the model
public class Expense {
	//Attributes
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) //generates auto incrementing
	 private Long id;
	 
	 
	 @Size(min = 3, max = 255)// validation constraint
	 @NotNull (message = "Expense name is required!") //validation for not null
	 private String expenseName; //The persistent layer will change this for you (no need to snake case)
	 
	 @Size(min = 2, max=50)//validation constraint
	 @NotNull(message = "Vendor name is required!") //validation for not null (NotNull is interchangeable with NotEmpty
	 private String vendor;
	
	 @Min(0) //validation for doubles
	 @Max(100000) //validation for doubles
	 @NotNull
	 private Double amount; //wrapper class so our persistent class can handle the data type
	 
	 @Size(min = 5, max = 200)
	 @NotNull(message="Please provide a description.")
	 private String description;
	 
	 @Column(updatable=false)
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date createdAt;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date updatedAt;
	
	 
	 
	 
	//Constructors
	public Expense() {
	}
	
	//overloaded constructor
	public Expense (String expenseName, String vendor, Double amount, String description) {
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}


	


	//Created at and updated at
    @PrePersist //adds the created at date and time to SQL on creation
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate //adds the updated at date and time when being updated
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    //getters and setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}
    
}
