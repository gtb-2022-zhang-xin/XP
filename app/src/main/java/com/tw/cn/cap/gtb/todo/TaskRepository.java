package com.tw.cn.cap.gtb.todo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
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

    List<String> create(Task task) {
        String taskName = task.getName();
        try (BufferedWriter bw = Files.newBufferedWriter(Constants.FILE_PATH, StandardOpenOption.APPEND)) {
//            String taskName = getArgs()[1];
            bw.write("+ " + taskName);
            bw.newLine();
        } catch (IOException e) {
            throw new CannotReadFileException();
        }
        return List.of();
    }
}
