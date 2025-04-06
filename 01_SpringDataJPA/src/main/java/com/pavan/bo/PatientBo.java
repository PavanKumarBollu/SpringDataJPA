package com.pavan.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class PatientBo {
	
	private Integer PatientId;
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
	
	
	public PatientBo() {
		System.out.println("Hibernate internally uses ZERO-PARAM constructor during select query");
	}

}
