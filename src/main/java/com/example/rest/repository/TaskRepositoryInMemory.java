package com.example.rest.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rest.domain.entity.Task;

@Repository
public class TaskRepositoryInMemory implements TaskRepository {

	private List<Task> store;
	private long nextId;

	public TaskRepositoryInMemory() {
		store = new ArrayList<>();
		nextId = 1;

		store.add(new Task(nextId++,
				"タスク1",
				"タスク1の説明",
				LocalDate.of(2024, 6, 30),
				false,
				"東京"));
		store.add(new Task(nextId++,
				"タスク2",
				"タスク2の説明",
				LocalDate.of(2024, 7, 15),
				false,
				"大阪"));
	}

	@Override
	public List<Task> selectAll() {
		return store;
	}

	@Override
	public Task selectById(Long id) {
		Task result = null;
		
		for (Task task : store) {
			if (task.getId().equals(id)) {
				result = task;
				break;
			}
		}
		return result;
	}

}
