package ru.geekbrains.lesson_5.tutor;

public class Bird extends Animal{

    private final int flyHeight;

    public Bird(String name, String color, int age, int flyHeight){
        super(name, color, age);
        this.flyHeight = flyHeight;

        }
        @Override
        public void voice(){
            System.out.println(this.name + "tweets");
        }

public void fly (){
    System.out.println(name + "flies on"+ flyHeight +"meters");
}
}


