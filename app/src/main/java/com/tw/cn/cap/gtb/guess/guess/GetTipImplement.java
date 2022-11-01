package com.tw.cn.cap.gtb.guess.guess;

import com.tw.cn.cap.gtb.guess.util.GetNum;
import com.tw.cn.cap.gtb.guess.util.JudgeMethods;

import java.util.List;
import java.util.Scanner;

public class GetTipImplement implements GetTip{
    static List<Integer> randomNum = GetNum.getRandomNum();
    Scanner ints = new Scanner(System.in);
    String guessNum = GetNum.getGuessNum(ints.next());
    static Integer m = 0;

    static Integer n = 0;

    @Override
    public String getTipResult(List<Integer> randomNum, String guessNum) {
        for (int i = 0; i < guessNum.length(); i ++) {
            char c = guessNum.charAt(i);
            String guess = String.valueOf(c);
            boolean judgeIsExist = JudgeMethods.judgeIsExist(randomNum, guess);
            if (judgeIsExist) {
                boolean judgeIsSameAll = JudgeMethods.judgeIsSameAll(randomNum, guess, i);
                if (judgeIsSameAll) {
                    n ++;
                } else {
                    m ++;
                }
            }
        }
        return n + "A" + m + "B";
    }
}
