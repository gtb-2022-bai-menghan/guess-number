package com.tw.cn.cap.gtb.guess.guess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetTipImplementTest {

    @Test
    void getTipResult() {
        GetTipImplement getTipImplement = new GetTipImplement();
        ArrayList<Integer> random = new ArrayList<>(List.of(1, 3, 5, 6));
        String tipResult = getTipImplement.getTipResult(random, "1245");
        Assertions.assertEquals("1A1B", tipResult);
    }
}