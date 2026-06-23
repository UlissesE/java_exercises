package me.dio.interfaces.exercises.three;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        byte option;
        do {
            System.out.println("\nEscolha a forma geométrica para calcular a área.\n");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");
            option = sc.nextByte();
            switch (option) {
                case 1 -> {
                    GeometricForm square = createSquare();
                    System.out.println("A área do quadrado é " + square.getArea());
                }

                case 2 -> {
                    GeometricForm retangle = createRetangle();
                    System.out.println("A área do retangulo é " + retangle.getArea());
                }

                case 3 -> {
                    GeometricForm circle = createCircle();
                    System.out.println("A área do circulo é " + circle.getArea());
                }

                case 4 -> System.out.println("Saindo do sistema...");
                default -> {

                    System.out.println("Opção inválida");
                    option = 0;
                }
            }

        } while (option <= 3);

    }

    private static GeometricForm createSquare() {
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double side = sc.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRetangle() {
        System.out.println("Informe o tamanho dos lados do retangulo: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        return new Retangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o tamanho do raio do circulo: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }


}
