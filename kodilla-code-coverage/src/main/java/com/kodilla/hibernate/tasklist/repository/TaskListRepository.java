package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListRepository extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}