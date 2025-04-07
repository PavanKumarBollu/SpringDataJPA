package com.pavan.bo;

import java.io.Serializable;

@Entity
public class CoronaVaccine implements Serializable {
	private Long regNo;
	private String name;
	private String company;
	private String country;
	private Double price;
	private Integer requriedDoseCount;
}
