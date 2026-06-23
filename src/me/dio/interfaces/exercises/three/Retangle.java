package me.dio.interfaces.exercises.three;

public record Retangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return height * base;
    }
}
