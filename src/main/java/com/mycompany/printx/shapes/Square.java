package com.mycompany.printx.shapes;

/*
 *Norbert Puchala 
 */
public class Square extends Shape {
    boolean firstPass = true;
    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
        if(firstPass)
        {
            numX = row;
            firstPass = false;
        }
        if (row == 0) {
            return;
        }
        if (row == labelRow) {
            printLabel(label, numX);
        } else {
            fillX(numX);
        }
        System.out.println("");
        row--;
        printShape(row, numX, label, labelRow);
    }

}
