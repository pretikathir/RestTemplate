package com.test.rest.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	public int id;
	public String employee_name;
	public int employee_salary;
	public int employee_age;
	public String profile_image;
}
