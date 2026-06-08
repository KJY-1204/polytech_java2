package com.survivalcoding;

public class Cleric {
    final int MAXHP = 50;
    final int MAXMP = 10;
    String name;
    int HP = 50;
    int MP = 10;

    void selfAid() {
        System.out.println("셀프 에이드");
        MP = -5;
        HP = MAXHP;
    }
}
