package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();

    public ListCommand() {
    }

    List<String> run() {
        List<Task> tasks = taskRepository.loadTasks();
        List<String> result = new ArrayList<String>();

        List<String> sectionResult1 = Section.tbd().format(tasks);
        result.addAll(sectionResult1);
        List<String> sectionResult = Section.completed().format(tasks);
        result.addAll(sectionResult);

        return result;
    }
}
