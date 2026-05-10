package com.example.rest.repository;

import java.util.List;

import com.example.rest.domain.entity.Task;

public interface TaskRepository {

	List<Task> selectAll();
	Task selectById(Long id);
}
