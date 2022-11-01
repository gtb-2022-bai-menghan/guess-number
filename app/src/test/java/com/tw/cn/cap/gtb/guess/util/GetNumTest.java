package com.tw.cn.cap.gtb.guess.util;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.List;

class GetNumTest {
    @Test
    void getRandomNum() {
        List<Integer> randomNum = GetNum.getRandomNum();
        Assertions.assertNotEquals(List.of(1, 2, 3, 4), randomNum);
    }
}