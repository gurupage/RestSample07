package com.example.rest.service.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.domain.entity.Task;
import com.example.rest.dto.response.TaskResponse;

@Service
public class ResponseCreatorImpl implements ResponseCreator {

	@Override
	public TaskResponse createTaskResponse(Task e) {
		TaskResponse result = new TaskResponse(
		e.getId(),
		e.getTitle(),
		e.getDescription(),
		e.getDueDate(),
		e.getDone(),
		e.getCity()
				);
		return result;
	}

	@Override
	public List<TaskResponse> createTaskResponseList(List<Task> l) {
		List<TaskResponse> result = new ArrayList<>();
		for (Task t : l) {
			result.add(createTaskResponse(t));
		}
		return result;
	}

}
