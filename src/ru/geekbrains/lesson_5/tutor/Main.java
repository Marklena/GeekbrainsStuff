package ru.geekbrains.lesson_5.tutor;

public class Main{
    public static void main(String[] args) {
    Cat c = new Cat ("Barsik","white", 3);
    Dog d = new Dog("Sharik", "black", 5);
    Bird b = new Bird ("Karkoosha", "grey", 1, 10);
    Parrot p = new Parrot ("Kesha", "rainbow", 2, 5);
    Shark s = new Shark("Toothee", "blue", 10);

    Animal [] zoo = {c, d, b, p, s};
    for (int i= 0; i < zoo.length; i++){
        zoo[i].move();
        zoo[i].voice();
    if (zoo[i] instanceof Bird){
        System.out.println("Enlarge a cage for" + zoo[i].name);
    }
    if (zoo[i] instanceof Parrot){
        ((Parrot) zoo[i].speak();
        }
    }
}
private static void typeCasting(){

}