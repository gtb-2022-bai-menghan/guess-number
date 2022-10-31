package com.tw.cn.cap.gtb.guess.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeMethodsTest {

    @Test
    void judgeIsSameAll() {
        boolean judgeIsSameAll = JudgeMethods.judgeIsSameAll("", "");
        Assertions.assertFalse(judgeIsSameAll);
    }

    @Test
    void judgeIsExist() {
        boolean judgeIsExist = JudgeMethods.judgeIsExist("", "");
        Assertions.assertFalse(judgeIsExist);
    }
}