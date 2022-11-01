package com.tw.cn.cap.gtb.guess.util;

import java.util.*;
import java.util.stream.IntStream;

public class GetNum {
    static public List<Integer> getRandomNum() {
        Random random = new Random();
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 4; i ++) {
            ints.add(random.nextInt(10));
        }
        return ints;
    }

    static public String getGuessNum() {
        System.out.println("Please input your guess number: ");
        Scanner ints = new Scanner(System.in);
        return ints.next();
    }
}
