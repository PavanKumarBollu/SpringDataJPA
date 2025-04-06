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
	
	@Column(name="PatientRegNo")
	private String firstName;
	
	@Column(name="PatientRegNo")
	private String lastName;
	
	@Column(name="PatientRegNo")
	private String dateOfBirth;
	
	@Column(name="PatientRegNo")
	private String gender;
	
	@Column(name="PatientRegNo")
	private String phoneNumber;
	
	@Column(name="PatientRegNo")
	private String emailId;
	
	@Column(name="PatientRegNo")
	private String height;
	
	@Column(name="PatientRegNo")
	private String weight;
	
	@Column(name="PatientRegNo")
	private String bloodGroup;
	
	@Column(name="PatientRegNo")
	private String createdOn;
	
	@Column(name="PatientRegNo")
	private String modifiedOn;
	
	
	public Patient() {
		System.out.println("Hibernate internally uses ZERO-PARAM constructor during select query");
	}

}
