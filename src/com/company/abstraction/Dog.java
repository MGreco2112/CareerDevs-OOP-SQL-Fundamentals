package com.company.abstraction;

public abstract class Dog {
    public String breed;

    public void barkMethod() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}
