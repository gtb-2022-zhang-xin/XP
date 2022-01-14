package com.tw.cn.cap.gtb.todo;

import java.nio.file.Path;

public class Constants {
    public static final String USER_HOME_PATH = System.getProperty("user.home");
    public static final String TODO_CONFIG_ROOT = ".todo";
    public static final String TASK_FILENAME = "tasks";
    public static final Path FILE_PATH = Path.of(USER_HOME_PATH,TODO_CONFIG_ROOT, TASK_FILENAME);
}