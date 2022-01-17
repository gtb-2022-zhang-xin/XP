package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class Section {
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    static Section completed() {
        return new Section("#Completed", true);
    }

    static Section tbd() {
        return new Section("#To Be Done", false);
    }

    public String getTitle() {
        return title;
    }

    public boolean isFlag() {
        return flag;
    }

    List<String> format(List<Task> tasks) {
        List<String> result = new ArrayList<>();
        result.add(getTitle());
        tasks.stream().filter(task -> isFlag() == task.isCompleted).map(Task::format).forEach(result::add);
        if (result.size()==1){
            result.add("Empty");
        }
        return result;
    }
}
