package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTestSuite {
    @Autowired
    private TaskRepository taskRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskRepositoryFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskRepository.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskRepository.deleteById(id);
    }
}