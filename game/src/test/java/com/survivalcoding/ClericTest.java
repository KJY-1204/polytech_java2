package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClericTest {

    @Test
    @DisplayName("selfAid를 하면 mp가 -5 HP가 최대가된다")
    void selfAid() {
        //준비
        final int InitalHp = 5;
        final int InitalMp = 10;
        Cleric cleric = new Cleric();
        cleric.HP = InitalHp;
        cleric.MP = InitalMp;

        //실행
        cleric.selfAid();

        //검증
        assertEquals(cleric.MAXHP, cleric.HP);
        assertEquals(5, cleric.MP);

        //준비
        final int mpEdgeCase = 0;
        cleric.HP = InitalHp;
        cleric.MP = mpEdgeCase;

        //실행
        cleric.selfAid();

        //검증
        assertNotEquals(cleric.MAXHP, cleric.HP);
        assertEquals(mpEdgeCase, cleric.MP);
    }

    @Test
    @DisplayName("pray를 사용하면 기도한 초+0~2의 값을 mp회복된다")
    void pray() {
        //준비
        final int InitalMp = 0;
        int praytime = 1;
        Cleric cleric = new Cleric();
        cleric.MP = InitalMp;

        //실행
        int cost = cleric.pray(praytime);
        cleric.MP += cost;

        //검증
        assertEquals(InitalMp + cost, cleric.MP);

        //준비
        praytime = 0;
        cleric.MP = InitalMp;

        //실행
        cost = cleric.pray(praytime);
        cleric.MP += cost;

        //검증
        assertEquals(InitalMp + cost, cleric.MP);

    }
}