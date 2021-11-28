package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public class Diamond extends Shape {

    private int halfway = -1;
    private int ogRow = -1;

    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
        if (row <= 0) {
            return;
        }
        if (ogRow == -1) {
            ogRow = row;
            if (row % 2 == 1) {
                halfway = (row / 2) + 1;
            } else {
                halfway = row / 2;
            }
            numX = 1;
        }
        
        if (halfway < row) {
            emptySpace(halfway - numX);
            if (labelRow == row) {
                printLabel(label, numX);
            } else {
                fillX(numX);
            }
            row--;
            numX++;
            System.out.println("");
            printShape(row, numX, label, labelRow);
            return;
        }
        
        if (halfway == row) {
            if (ogRow % 2 == 1) {
                if (labelRow == row) {
                    printLabel(label, numX);
                } else {
                    fillX(numX);
                }
                row--;
                System.out.println("");
            }
            numX--;
//            printShape(row, numX, label, labelRow);
//
//            return;
        }
        
        if (halfway >= row) {
            emptySpace(halfway - numX);
            if (labelRow == row) {
                printLabel(label, numX);
            } else {
                fillX(numX);
            }
            numX--;
            row--;
            System.out.println("");
            printShape(row, numX, label, labelRow);
        }
    }
}
