package ru.geekbrains.homework_a;

public class Bird extends Animal {

    public Bird(String name, String color, int age, int runDistance, int jumpDistance) {
        super(name, color, age, runDistance, jumpDistance);
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;

    }

    @Override
    public void run() {
        System.out.println(this.name + "flies a distance");
    }
    public void jumps() {
        System.out.println(this.name + "jumps on a distance" + jumpDistance);
    }
}