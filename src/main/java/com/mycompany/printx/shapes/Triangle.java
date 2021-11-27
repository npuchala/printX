package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public class Triangle extends Shape {

    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
        {
            if (row == 0) {
                return;
            }
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
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
