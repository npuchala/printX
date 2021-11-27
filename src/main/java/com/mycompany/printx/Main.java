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
        String text = "LU";
        int row = 10;
        int numX = -1;//numbers of x's to be printed
        int labelRow = 5;
        Shape tri = new Diamond();
        tri.printShape(row, numX, text, labelRow);
    }
}
