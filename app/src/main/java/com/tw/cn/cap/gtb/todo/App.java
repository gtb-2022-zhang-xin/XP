package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class App {
    private final TaskRepository taskRepository = new TaskRepository();
        public List<String> run () {
            ArrayList<Task> tasks = taskRepository.loadTasks();
            List<String> result = new ArrayList<>();
            result.add("#To Be Done");
            for (Task task : tasks) {
                result.add(task.format());
            }
            return result;
        }
    }
