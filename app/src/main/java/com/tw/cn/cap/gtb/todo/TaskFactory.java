package com.tw.cn.cap.gtb.todo;

/**
 * @author zhangxin
 */
public class TaskFactory {
    static Task  createTask(int id, String line) {
        String name = line.split(" ", 2)[1];
         return new Task(id, name);
    }
}