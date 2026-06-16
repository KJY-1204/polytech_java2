package com.survivalcoding;

public class Hero {
    String name;
    int HP;

    public Hero(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    void attack() {
        //sout
        System.out.println("공격했다");
    }
}
