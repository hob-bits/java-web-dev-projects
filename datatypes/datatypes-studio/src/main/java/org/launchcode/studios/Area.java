package org.launchcode.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle's radius: ");
        double radius = input.nextInt();
        double pi = 3.14;
        double area = (pi * radius * radius);

        System.out.println("The area of a circle with the radius " + radius + " is " + area + ".");
    }
}
