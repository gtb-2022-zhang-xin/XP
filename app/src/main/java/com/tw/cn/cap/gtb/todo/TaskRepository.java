package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class TaskRepository {
    List<Task> loadTasks() {
        List<String> lines = readTaskLines();
        List<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < lines.size(); i++) {
            Task task = TaskFactory.createTask(i + 1, lines.get(i));
            tasks.add(task);
        }
        return tasks;
    }

    List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.FILE_PATH);
        } catch (IOException e) {
            throw new CannotReadFileException();
        }
    }
}
