package com.tw.cn.cap.gtb.guess.util;

import java.util.*;
import java.util.stream.IntStream;

public class GetNum {
    static public String getRandomNum() {
        Random random = new Random();
        IntStream ints = random.ints(4, 0, 9);
        return Arrays.toString(ints.toArray());
    }

    static public String getGuessNum(String ints) {
        System.out.println("Please input your guess number: ");
        return ints;
    }
}
