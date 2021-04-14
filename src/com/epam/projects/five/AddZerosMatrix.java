//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package com.epam.projects.five;

import static com.epam.projects.PrintMatrix.*;

public class AddZerosMatrix {

    public static void main(String[] args) {

        int columns = 6;
        int strings = 6;
        int[][] matrix = new int[columns][strings];
        int len = matrix.length;

        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            for (int stringsInd = 0; stringsInd < strings; stringsInd++) {
                matrix[columnsInd][stringsInd] = columnsInd + 1;
            }
        }

        for (int columnsInd = 1; columnsInd < columns; columnsInd++) {
            for (int stringsInd = len - columnsInd; len > stringsInd; stringsInd++) {
                matrix[columnsInd][stringsInd] = 0;
            }
        }
        printMatrixInt (matrix);
    }
}





