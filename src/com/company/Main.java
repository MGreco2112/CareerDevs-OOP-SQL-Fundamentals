package com.company;

import com.company.classes.Class1;
import com.company.classes.Class2;
import com.company.inheritance.Mouse1;
import com.company.polymorphism.Bird;
import com.company.polymorphism.Robin;

public class Main {

    public static void main(String[] args) {
//        Mouse1 mouse1 = new Mouse1();
//
//        mouse1.rightClick();
//
//        mouse1.scrollDown();
//
//        Bird bird = new Bird();
//
//        bird.sing();
//
//        Robin b = new Robin();
//
//        b.sing();

        Class1 class1 = new Class1();

        Class2 newClass = new Class2();

        System.out.println(class1.x);

        System.out.println(newClass.y);

        class1.printHi();
    }
}
