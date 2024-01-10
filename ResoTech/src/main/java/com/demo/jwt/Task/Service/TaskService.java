package com.demo.jwt.Task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jwt.Task.Entity.Task;
import com.demo.jwt.Task.Repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public Optional<Task> getTaskById(Long taskId) {
		return taskRepository.findById(taskId);
	}

	public Task createTask(Task task) {
		// Additional validation can be added here before saving
		return taskRepository.save(task);
	}

	public Task updateTask(Long taskId, Task updatedTask) {

		if (taskRepository.existsById(taskId)) {
			updatedTask.setId(taskId);
			return taskRepository.save(updatedTask);
		} else {
			// Handle error - task not found
			return null;
		}
	}

	public void deleteTask(Long taskId) {

		taskRepository.deleteById(taskId);
	}
}
