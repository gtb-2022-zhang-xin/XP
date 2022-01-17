package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Gosin
 * @Date: 2022/1/15 00:14
 */
class TaskFactoryTest {

    @Test
    void should_parse_completed_for_task() {
         boolean isCompleted = TaskFactory.createTask(1,"+ task 01").isCompleted;
         assertFalse(isCompleted);
    }
}