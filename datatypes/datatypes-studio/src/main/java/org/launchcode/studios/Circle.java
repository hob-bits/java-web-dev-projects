package org.launchcode.studios;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle's radius: ");
        double radius = input.nextInt();
        double area = getArea(radius);

        System.out.println("The area of a circle with the radius " + radius + " is " + area + ".");
    }

    public static double getArea(double radius) {
        return (3.14 * radius * radius);
    }
}
