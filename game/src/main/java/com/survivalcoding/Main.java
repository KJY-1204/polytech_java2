package com.survivalcoding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*
        //인스턴스 생성
        Hero hero = new Hero();

        int a = 10;
        long l = 10L; //literal 리터널

        */
        /*
        Cleric cleric = new Cleric();

        cleric.name = "cleric";
        cleric.selfAid();
        System.out.println(cleric.MP);

        cleric.MP += cleric.pray(1);
        System.out.println(cleric.MP);


 */

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("홍길등"));
        personList.add(new Person("한석봉"));

        System.out.println("List에 담긴 Person 목록");
        for (Person person : personList) {
            System.out.println("이름 : " + person.getName());
        }
    }
}

