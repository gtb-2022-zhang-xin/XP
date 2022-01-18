package com.tw.cn.cap.gtb.todo;

import java.util.List;

/**
 * @author zhangxin
 */
public class App {
    private final ListCommand listCommand = new ListCommand();

    public static void main(String[] args) {
        new App().run().forEach(System.out::println);
        throw new UnsupportedOperationException();
    }


    public List<String> run(String... args) {
        if (args.length > 0 && "add".equals(args[0])) {
            return new AddCommand(new TaskRepository(), args).execute();
        }
        return listCommand.run();

    }

}
