package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public class Triangle extends Shape {

    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
        {
            if(numX == -1)
                numX = 1;
            if (row == 0) {
                return;
            }
            emptySpace(row-1);           
            if (labelRow == row) {
                float paddingX = (((float) numX - label.length()) / 2);
                fillX((int) Math.floor(paddingX));
                printLabel(label);
                fillX((int) Math.ceil(paddingX));
            } else {
                fillX(numX);
            }
            row--;
            numX++;
            System.out.println("");
            printShape(row, numX, label, labelRow);
        }
    }

}
