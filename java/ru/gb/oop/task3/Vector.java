package ru.gb.oop.task3;

public class Vector {
    private int coordX;
    private int coordY;
    private int coordZ;


    public Vector(int coordX, int coordY, int coordZ) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }
    public Vector() {
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(int coordZ) {
        this.coordZ = coordZ;
    }

    @Override
    public String toString() {
        return "Vector\n{" +
                "coordX = " + coordX +
                ", coord Y= " + coordY +
                ", coordZ = " + coordZ +
                '}';
    }

    /**
     * @apiNote метод, вычисляющий длину вектора
     * @return Длина вектора
     */
    public double length() {
        return Math.sqrt(coordX * coordX + coordY * coordY + coordZ * coordZ);
    }

    /**
     * @apiNote Метод, вычисляющий скалярное произведение
     * @param vector Вектор, с которым происходит произведение
     * @return Скалярное произведение
     */
    public int scalarMultiplication(Vector vector) {
        return (coordX * vector.coordX + coordY * vector.coordY + coordZ * vector.coordZ);
    }

    /**
     * @apiNote Метод, вычисляющий векторное произведение с другим вектором
     * @param vector Вектор, с которым происходит произведение
     * @return Векторное произведение
     */
    public Vector vectorMultiplication(Vector vector) {
        return new Vector(
                coordY * vector.coordZ - coordZ * vector.coordY,
                coordZ * vector.coordX - coordX * vector.coordZ,
                coordX * vector.coordY - coordY * vector.coordX
        );
    }

    /**
     * @apiNote Метод, вычисляющий косинус угла между векторами
     * @param vector Вектор, с которым вычисляется угол
     * @return Косинус угла между векторами
     */
    public double angle(Vector vector) {
        return scalarMultiplication(vector) / (length() * vector.length());
    }

    /**
     * @apiNote Метод, вычисляющий сумму двух векторов
     * @param vector Вектор, с которымм вычисляется сумма
     * @return Сумма векторов
     */
    public Vector vectorSum(Vector vector) {
        return new Vector(
                coordX + vector.coordX,
                coordY + vector.coordY,
                coordZ + vector.coordZ
        );
    }

    /**
     * @apiNote Метод, вычисляющий разность двух векторов
     * @param vector Вектор, с которымм вычисляется разность
     * @return Разность векторов
     */
    public Vector vectorDifference(Vector vector) {
        return new Vector(
                coordX - vector.coordX,
                coordY - vector.coordY,
                coordZ - vector.coordZ
        );
    }
}
