package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Cat firstCat = new Cat("Котя", 25);
        firstCat.speak();
    }
    }

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name=name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("Меня зовут: " + name + " и мне " + age + " лет");
    };
}

