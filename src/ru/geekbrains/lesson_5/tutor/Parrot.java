package ru.geekbrains.lesson_5.tutor;

public final class Parrot extends Bird {
    public Parrot(String name, String color, int age, int flyHeight) {
        super(name, color, age, flyHeight);
    }

    public final void speak (){
    System.out.println("Polly wanna cracker!");
}
}