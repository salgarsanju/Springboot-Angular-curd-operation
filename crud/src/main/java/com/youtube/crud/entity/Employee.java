package com.youtube.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "emptab")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	@Column
	private String employeeName;
	@Column
	private String employeeContactNumber;
	@Column
	private String employeeAddress;
	@Column
	private String employeeGender;
	@Column
	private String employeeDepartment;
	@Column
	private String employeeSkill;

}
