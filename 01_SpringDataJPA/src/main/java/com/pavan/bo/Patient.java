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
	
	private String patientRegNo;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String phoneNumber;
	private String emailId;
	private String height;
	private String weight;
	private String bloodGroup;
	private String createdOn;
	private String modifiedOn;
	
	
	public Patient() {
		System.out.println("Hibernate internally uses ZERO-PARAM constructor during select query");
	}

}
