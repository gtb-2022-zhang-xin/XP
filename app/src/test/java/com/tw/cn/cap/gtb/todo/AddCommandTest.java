package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Gosin
 * @Date: 2022/1/18 10:45
 */
public class AddCommandTest {
    @Test
    void should_compose_task_name_with_multiple_args() {
        var taskRepository = new MyTaskRepository();
        AddCommand addCommand = new AddCommand(taskRepository, "add", "fizz", "buzz");
        addCommand.execute();
        String taskName = taskRepository.getTaskName();
        assertEquals("fizz buzz", taskName);
    }


    private static class MyTaskRepository extends TaskRepository {
        private Task task;

        @Override
        List<String> create(Task task) {
            this.task = task;
            return List.of();
        }

        public String  getTaskName() {
            return this.task.getName();
        }
    }
}




