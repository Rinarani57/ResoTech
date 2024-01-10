package com.demo.jwt.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jwt.Task.Entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	// Custom query methods if needed
}
