package com.tw.cn.cap.gtb.todo;

/**
 * @author zhangxin
 */
public class TaskFactory {
    static Task createTask(int id, String line) {
        String[] fields = line.split(" ", 2);
        String name = fields[1];
        boolean isCompleted = fields[0].equals("-");
        return new Task(id, name,isCompleted);
    }
}
