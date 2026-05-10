package com.example.rest.domain.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

	private Long id;
	private String title;
	private String description;
	private LocalDate dueDate;
	private Boolean done;
	private String city;
}
