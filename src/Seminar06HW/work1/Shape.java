package Seminar06HW.work1;

/*
Square наследует от Rectangle, но это нарушает принцип LSP, потому что Square вносит изменения в поведение методов,
которые ожидаются от Rectangle.
Добавлен общий суперкласс Shape, содержащий общее поведение для всех фигур. Классы Rectangle и Square теперь
наследуются от этого суперкласса и корректно реализуют свои методы setHeight и setWidth, сохраняя тем самым принцип
Liskov Substitution Principle
 */

public class Shape {
    protected int height;
    protected int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
