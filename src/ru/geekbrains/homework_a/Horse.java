package ru.geekbrains.homework_a;

public class Horse extends Animal {

    public Horse (String name, String color, int age, int runDistance, int swimDistance, int jumpDistance){

        super(name, color, age, runDistance, swimDistance, jumpDistance);
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpDistance = jumpDistance;

    }
    public void run() {
        System.out.println(this.name + "runs on a distance of" + runDistance);
    }
    public void swim() {
        System.out.println(this.name + "swims on a distance of" + swimDistance);
    }
    public void jumps(){
        System.out.println(this.name + "jumps on a distance" + jumpDistance);
    }
}