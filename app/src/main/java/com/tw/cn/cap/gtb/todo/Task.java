package com.tw.cn.cap.gtb.todo;

import java.util.Objects;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        };
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        };
//        Task task = (Task) o;
//        return id == task.id && isCompleted == task.isCompleted && Objects.equals(name, task.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, isCompleted);
//    }
}
