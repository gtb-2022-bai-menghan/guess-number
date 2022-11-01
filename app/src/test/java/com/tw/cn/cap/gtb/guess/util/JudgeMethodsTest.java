package com.tw.cn.cap.gtb.guess.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JudgeMethodsTest {

    @Test
    void judgeIsSameAll() {
        List<Integer> random0 = new ArrayList<>(List.of(1, 2, 3, 4));
        boolean judgeIsSameAll = JudgeMethods.judgeIsSameAll(random0, "5", 1);
        Assertions.assertFalse(judgeIsSameAll);
        Assertions.assertEquals(List.of(1, 2, 3, 4), random0);

        List<Integer> random1 = new ArrayList<>(List.of(1, 2, 3, 4));
        judgeIsSameAll = JudgeMethods.judgeIsSameAll(random1, "2", 2);
        Assertions.assertTrue(judgeIsSameAll);
        Assertions.assertEquals(List.of(1, 3, 4), random1);
    }

    @Test
    void judgeIsExist() {
        boolean judgeIsExist = JudgeMethods.judgeIsExist(List.of(1, 2, 3, 4), "5");
        Assertions.assertFalse(judgeIsExist);

        judgeIsExist = JudgeMethods.judgeIsExist(List.of(1, 2, 3, 4), "2");
        Assertions.assertTrue(judgeIsExist);
    }
}