package com.tw.cn.cap.gtb.todo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddCommand {
    final TaskRepository taskRepository;

    private final String[] args;

    public  AddCommand(TaskRepository taskRepository, String... args) {
        this.args = args;
        this.taskRepository =  taskRepository;
    }


    List<String> execute() {
        String name = String.join(" ", Arrays.copyOfRange(args,1,args.length));
//        String name = Arrays.stream(args).skip(1).collect(Collectors.joining(" "));
        Task task = new Task(0, name, false);

        return taskRepository.create(task);
    }

}
