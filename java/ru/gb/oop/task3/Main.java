package ru.gb.oop.task3;

public class Main {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(3, 3, 3);
        Vector vectorTwo = new Vector(1, 2, 1);
        System.out.println(vectorOne);
        System.out.println("vectorOne.length() = " + vectorOne.length());
        System.out.println("vectorOne.scalarMultiplication(vectorTwo) = " + vectorOne.scalarMultiplication(vectorTwo));
        System.out.println(vectorOne.vectorMultiplication(vectorTwo));
        System.out.println("vectorOne.angle(vectorTwo) = " + vectorOne.angle(vectorTwo));
        System.out.println(vectorOne.vectorSum(vectorTwo));
        System.out.println(vectorOne.vectorDifference(vectorTwo));
    }
}
