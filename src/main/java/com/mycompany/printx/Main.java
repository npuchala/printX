package com.mycompany.printx;

import com.mycompany.printx.shapes.Diamond;
import com.mycompany.printx.shapes.Shape;
import com.mycompany.printx.shapes.Triangle;

/*
*Norbert Puchala
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Test.");
        String test = "LU";
        int row = 5;
        int numX = -1;//numbers of x's to be printed
        int labelRow = 1;
        Shape tri = new Diamond();
        tri.printShape(row, numX, test, labelRow);
    }
}
