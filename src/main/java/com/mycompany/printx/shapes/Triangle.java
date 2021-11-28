package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public class Triangle extends Shape {

    private int ogRow = -1;

    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
        {
            if (ogRow == -1) {
                ogRow = row;
                numX = 1;
            }
            if (row == 0) {
                return;
            }
            emptySpace(ogRow - numX);
            if (labelRow == row) {
                printLabel(label, numX);
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
