package com.tw.cn.cap.gtb.todo;

public class Section {
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFlag() {
        return flag;
    }
}
