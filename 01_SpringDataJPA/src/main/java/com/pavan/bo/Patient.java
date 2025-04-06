package com.pavan.bo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Patient implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PatientId")
	private Integer patientId;
	
	@Column(name="PatientRegNo")
	private String patientRegNo;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="DateOfBirth")
	private String dateOfBirth;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="EmailId")
	private String emailId;
	
	@Column(name="Height")
	private String height;
	
	@Column(name="Weight")
	private String weight;
	
	@Column(name="BloodGroup")
	private String bloodGroup;
	
	@Column(name="CreatedOn")
	private String createdOn;
	
	@Column(name="ModifiedOn")
	private String modifiedOn;
	
	
	public Patient() {
		System.out.println("Hibernate internally uses ZERO-PARAM constructor during select query");
	}

}
