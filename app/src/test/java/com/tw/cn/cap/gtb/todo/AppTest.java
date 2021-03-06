/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        List<String> lines = List.of("+ task 01", "+ task 02", "- task 03");
        writeDataFile(lines);
        app = new App();
    }

@Nested
    class ListCommand {
        @Nested
        class WhenThereIsExistedTasks {

            @Test
            void should_list_existing_tasks() throws IOException {
                //Given
//                App app = new App();
                //When
                List<String> result = app.run();
                //Then
                Assertions.assertEquals(List.of("#To Be Done", "1 task 01", "2 task 02",
                        "#Completed", "3 task 03"), result);
            }
        }

    }


@Nested
    class AddCommand {
        @Nested
        class WhenAddSingleName {

            @Test
            void should_add_with_single_name() {
                //Given
                //When
                new App().run("add", "task");
                //Then
                List<String> result = app.run();
                Assertions.assertEquals(List.of("#To Be Done", "1 task 01", "2 task 02", "4 task",
                        "#Completed", "3 task 03"), result);
            }
        }

    }


    private void writeDataFile(List<String> s3) {
        try (BufferedWriter bw = Files.newBufferedWriter(Constants.FILE_PATH)) {
            for (String line : s3) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
