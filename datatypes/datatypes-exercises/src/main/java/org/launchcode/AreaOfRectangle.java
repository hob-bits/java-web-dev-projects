package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the rectangle? ");
        double length = scanner.nextDouble();

        System.out.println("What is the width of the rectangle? ");
        double width = scanner.nextDouble();

        double area = (length * width);

        System.out.println("The area of the rectangle is " + area);
    }
}