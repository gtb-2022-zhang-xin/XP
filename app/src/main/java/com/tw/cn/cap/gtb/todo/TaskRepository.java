package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class TaskRepository {
    ArrayList<Task> loadTasks() {
        List<String> lines = readTaskLines();
        ArrayList<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < lines.size(); i++) {
            int id = i + 1;
            String line = lines.get(i);
            String name = line.split(" ",2)[1 ];
            Task task = new Task(id, name);
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