package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Gosin
 * @Date: 2022/1/15 01:49
 */
class SectionTest {
    @Test
    void should_show_empty() {
        List<String> result = Section.tbd().format(Collections.emptyList());
        Assertions.assertEquals(List.of("#To Be Done", "Empty"), result);
    }

    void should_show_empty1() {
        List<String> result = Section.completed().format(Collections.emptyList());
        Assertions.assertEquals(List.of("#Completed", "Empty"), result);
    }

}
