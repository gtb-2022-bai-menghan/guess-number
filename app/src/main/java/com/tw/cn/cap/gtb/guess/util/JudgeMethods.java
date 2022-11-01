package com.tw.cn.cap.gtb.guess.util;

import java.util.Arrays;
import java.util.List;

public class JudgeMethods {
    static public boolean judgeIsSameAll(List<Integer> random, String guess, Integer station) {
        for (int i = 0; i < random.size(); i++) {
            if (random.get(i) == Integer.parseInt(guess)) {
                return station == i;
            }
        }
        return false;
    }

    static public boolean judgeIsExist(List<Integer> random, String guess) {
        int num = Integer.parseInt(guess);
        return random.contains(num);
    }
}
