package ru.geekbrains.homework_a;

public abstract class Animal extends Object{
    protected String name;
    protected String color;
    protected int age;
    protected int runDistance;
    protected int jumpDistance;
    protected int swimDistance;

    public Animal(String name, String color, int age, int run, int jump) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;

    }
    public void run () {
        System.out.println(name + "runs on distance of" + runDistance);
    }
    public void swim (){
        System.out.println(name + "swim on distance of" + swimDistance);
    }
    public void jump (){
        System.out.println(name + "jumps on distance of" + jumpDistance);
    }
}

