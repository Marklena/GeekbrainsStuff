package ru.geekbrains.lesson_5.tutor;

public class Shark extends Animal{
    public Shark(String name, String color, int age) {
        super(name, color, age);
}
@Override
public void move(){
    System.out.println(name + "waves around");
    }

    @Override
    public void voice (){
    System.out.println(name +"ultrasound");
}
}