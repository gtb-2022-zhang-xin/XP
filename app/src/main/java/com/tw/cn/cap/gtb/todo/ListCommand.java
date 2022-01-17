package com.tw.cn.cap.gtb.todo;public class ListCommand{private final com.tw.cn.cap.gtb.todo.TaskRepository taskRepository = new com.tw.cn.cap.gtb.todo.TaskRepository();	public ListCommand()	{	}private java.util.List<java.lang.String> ListTasks() {
        java.util.List<com.tw.cn.cap.gtb.todo.Task> tasks = taskRepository.loadTasks();
        java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();

        java.util.List<java.lang.String> sectionResult1 = com.tw.cn.cap.gtb.todo.Section.tbd().format(tasks);
        result.addAll(sectionResult1);
        java.util.List<java.lang.String> sectionResult = com.tw.cn.cap.gtb.todo.Section.completed().format(tasks);
        result.addAll(sectionResult);

        return result;
    }}
