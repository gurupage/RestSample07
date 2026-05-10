package com.example.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.response.TaskResponse;
import com.example.rest.service.biz.TaskService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

	private final TaskService taskService;
	
	@GetMapping
	public ResponseEntity<List<TaskResponse>> getTaskAll(){
		List<TaskResponse> body = taskService.findAll();
		
		return ResponseEntity.ok(body);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TaskResponse> getTask(
			@PathVariable Long id){
		TaskResponse body = taskService.findById(id);
		
		return ResponseEntity.ok(body);
	}
}
