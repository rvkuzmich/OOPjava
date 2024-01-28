package ru.gb.oop.task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Кеша", "Черно-белый", 9);
        System.out.println("Кот " + catOne.getName() +
                "\nцвет " + catOne.getColor() +
                "\nвозраст " + catOne.getAge() + " лет");
        catOne.setAge(100);
        System.out.println("Кот " + catOne.getName() +
                "\nцвет " + catOne.getColor() +
                "\nвозраст " + catOne.getAge() + " лет");
        Cat catTwo = new Cat("Тиша", "Табби", 9);
        System.out.println("Кот " + catTwo.getName() +
                "\nцвет " + catTwo.getColor() +
                "\nвозраста " + catTwo.getAge() + " лет");
    }
}