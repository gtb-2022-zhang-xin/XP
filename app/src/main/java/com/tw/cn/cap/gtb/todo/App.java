package com.tw.cn.cap.gtb.todo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
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
            return execute(args);
        }
        return listCommand.run();

    }

    private List<String> execute(String[] args) {
        try (BufferedWriter bw = Files.newBufferedWriter(Constants.FILE_PATH, StandardOpenOption.APPEND)) {
            String taskName = args[1];
            bw.write("+ " + taskName);
            bw.newLine();
        } catch (IOException e) {
            throw new CannotReadFileException();
        }
        return List.of();
    }

}
