package me.dio.interfaces.exercises.three;

public record Circle(double radius) implements GeometricForm {

    public static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (radius * radius);
    }
}
