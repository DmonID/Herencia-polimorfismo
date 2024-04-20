//Escribe una interfaz llamada Shape.
//La interfaz Shape declarará dos métodos a implementar: getArea() y getPerimeter().
//Escribe las clases de todas las figuras geométricas que desees, siendo obligatorio incluir tres: Circle, Triangle y Square.
//Cada clase que represente una figura geométrica deberá implementar la interfaz Shape.
//En los métodos getArea() y getPerimeter() de cada clase implementar la fórmula para calcular el área y perímetro de cada figura.
//Cada clase deberá tener los atributos que permitan calcular las propiedades mencionadas, los atributos pueden ser diferentes entre cada figura.
//Incluye un menú interactivo donde el usuario pueda seleccionar cuál cálculo desea realizar:
//a. Seleccionar propiedad a calcular: área o perímetro.
//b. Seleccionar la figura.
//c. Solicitar los atributos de la figura: lados, medidas, etc.
//d. Imprimir en pantalla el resultado de los cálculos.

import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.println("Select an option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    System.out.println("Select an option: ");
                    int optionCircle = scanner.nextInt();
                    switch (optionCircle) {
                        case 1:
                            System.out.println("The area of the circle is: " + circle.getArea());
                            break;
                        case 2:
                            System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Enter side A: ");
                    double sideA = scanner.nextDouble();
                    System.out.println("Enter side B: ");
                    double sideB = scanner.nextDouble();
                    System.out.println("Enter side C: ");
                    double sideC = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height, sideA, sideB, sideC);
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    System.out.println("Select an option: ");
                    int optionTriangle = scanner.nextInt();
                    switch (optionTriangle) {
                        case 1:
                            System.out.println("The area of the triangle is: " + triangle.getArea());
                            break;
                        case 2:
                            System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    System.out.println("Select an option: ");
                    int optionSquare = scanner.nextInt();
                    switch (optionSquare) {
                        case 1:
                            System.out.println("The area of the square is: " + square.getArea());
                            break;
                        case 2:
                            System.out.println("The perimeter of the square is: " + square.getPerimeter());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 4);
        scanner.close();
    }
}