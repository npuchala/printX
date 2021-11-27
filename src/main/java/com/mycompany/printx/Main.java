package com.mycompany.printx;

import com.mycompany.printx.shapes.Shape;
import com.mycompany.printx.shapes.Triangle;

/*
*Norbert Puchala
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Test.");
        String test = "hi";
        Shape tri = new Triangle();
        tri.printShape(7, 1, test, 1);
        System.out.println(test.length());
    }
}
