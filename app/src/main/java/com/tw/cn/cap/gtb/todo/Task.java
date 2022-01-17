package com.tw.cn.cap.gtb.todo;

/**
 * @author zhangxin
 */
public class Task {
    private final int id;
    private final String name;
    public boolean isCompleted;

    public Task(int id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    String format() {
        return String.format("%d %s", getId(), getName());
    }
}
