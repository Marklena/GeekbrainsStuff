package ru.geekbrains.lesson_5.tutor;

public abstract class Animal extends Object{
    protected String name;
    protected String color;
    protected int age;


    public Animal(String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void move () {
        System.out.println(name + "walks on paws");
    }
    public abstract void voice (){

    }
}