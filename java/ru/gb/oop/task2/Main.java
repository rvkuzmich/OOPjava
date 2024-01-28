package ru.gb.oop.task2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кеша", "Черно-белый", 9);
        System.out.println(cat1);
        cat1.setAge(100);
        cat1.animalInfo();
        cat1.voice();
    }
}
