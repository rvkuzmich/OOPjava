package ru.gb.oop.task2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void animalInfo() {
        System.out.println("Животное по имени " + name);
    }

    void voice() {
        System.out.println("Животное по имени " + name + " подает голос");
    }

    void jump() {
        System.out.println("Животное по имени " + name + " подпрыгнуло");
    }
}
