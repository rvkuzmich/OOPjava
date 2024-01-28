package ru.gb.oop.task2;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    void voice() {
        System.out.println(toString() + " мяукает");
    }

    @Override
    void jump() {
        System.out.println(toString() + " прыгает");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0 && age < 40) {
            this.age = age;
        } else {
            System.out.println("Введенный возраст некорректен");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
