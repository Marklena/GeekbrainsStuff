package ru.geekbrains.homework_a;

public class Main{
    public static void main(String[] args) {
        Cat c = new Cat("Ceasar","grey", 2, 200, 2);
        Dog d = new Dog("Mukhtar", "black", 3, 500, 10, 0.5);
        Bird b = new Bird("Coco", "yellow", 5, 5, 0.2);
        Horse h = new Horse("Agdam", "brown", 4, 1500, 100, 3)

        Animal[] zoo = {c, d, b, h};
        for (int i= 0; i < zoo.length; i++) {
            zoo[i].run();
            zoo[i].jump();

            if (zoo[i] instanceof Dog && zoo[i] Horse){
                zoo[i].swim();

            System.out.println(zoo[i].name + "can swim");
        }

            }
            }
    private static void typeCasting() {
    }
    }
