package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public class Diamond extends Shape {

    private int halfway = -1;
    private int ogRow;

    @Override
    public void printShape(int row, int numX, String label, int labelRow) {
//        System.out.println(halfway);

        if (row == 0) {
            return;
        }

        if (halfway == -1) {
            ogRow = row;
            if (row % 2 == 1) {
                halfway = (row / 2) + 1;
            } else {
                halfway = row / 2;
            }
            System.out.println(halfway);
            numX = 1;
        }

//        if (halfway == row) {
//           emptySpace(halfway - row);
//           fillX(numX);
//
//            row--;
//            numX--;
//            System.out.println("");
//
//            printShape(row, numX, label, labelRow);
//            return;
//        }
        if (halfway < row) {
            emptySpace(halfway - numX);
            fillX(numX);
            row--;
            numX++;
            System.out.println("");
            printShape(row, numX, label, labelRow);
            return;
        }
        if (halfway == row) {
            if (ogRow % 2 == 1) {
                fillX(numX);
                System.out.println("");
                row--;

            }
            numX--;
        }
        if (halfway >= row) {
            emptySpace(halfway - numX);
            fillX(numX);
            numX--;
            row--;
            System.out.println("");
            printShape(row, numX, label, labelRow);
        }

    }
}
