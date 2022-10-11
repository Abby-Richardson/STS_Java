package com.abby.mvcdemo.models;

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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //declares that its going to be a part of MySQL
@Table(name="donations") // gives the table the name of the model
public class Donation {
	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates as auto-increment
    private Long id;
	
	@Size(min = 3, max = 255)//validation for strings
	@NotEmpty(message= "Donation name is required!")//validation for not null
	private String donationName; //The persistent layer will change this for you (don't try and snake case, will cause errors later on)
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="donor_id")
    private User donor;
	
	
	@Min(0)//validation for ints
	@Max(1000)//validation for ints
	@NotNull
	private Integer quantity; //wrapper class so our persistent class can handle the data type
	
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	//Constructors
	public Donation() {
		// TODO Auto-generated constructor stub
	}
	
	public Donation (String donationName, User donor, Integer quantity) {
		this.donationName = donationName;
		this.donor = donor;
		this.quantity = quantity;
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
    
    
    
    //getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public User getDonor() {
		return donor;
	}

	public void setDonor(User donor) {
		this.donor = donor;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

}
