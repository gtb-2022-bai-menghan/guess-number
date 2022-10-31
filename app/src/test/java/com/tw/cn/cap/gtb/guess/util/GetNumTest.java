package com.tw.cn.cap.gtb.guess.util;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class GetNumTest {
    @Test
    void getRandomNum() {
        String randomNum = GetNum.getRandomNum();
        Assertions.assertNotEquals("[1, 2, 3, 4]", randomNum);
    }

    @Test
    void getGuessNum() {
        String guessNum = GetNum.getGuessNum("1234");
        Assertions.assertEquals("1234", guessNum);
    }
}