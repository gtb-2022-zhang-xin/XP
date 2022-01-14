package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 */
public class App {

    public static void main(String[] args) {

    }

    public List<String> run() {
        List<String> result = new ArrayList<>();
        result.add("#To Be Done");
        List<String> lines = readTaskLines();
        for (int i = 0; i < lines.size(); i++) {
            result.add(String.format("%d %s", i + 1, lines.get(i)));
        }
        return result;
    }

    private List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.FILE_PATH);
        } catch (IOException e) {
            throw new CannotReadFileException();
        }
    }
}
