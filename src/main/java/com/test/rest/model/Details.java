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
public class Details {

		public String status;
		public ArrayList<Employee> data;
		public String message;
			
	}

