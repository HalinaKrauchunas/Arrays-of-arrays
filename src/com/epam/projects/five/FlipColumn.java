//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package com.epam.projects.five;

import static com.epam.projects.PrintMatrix.*;

public class FlipColumn {

    public static void main(String[] args) {

        int columns = 8;
        int strings = 8;
        int[][] matrix = new int[columns][strings];

        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            for (int stringsInd = 0; stringsInd < strings; stringsInd++) {
                if (columnsInd % 2 == 0) {
                    matrix[columnsInd][stringsInd] = stringsInd + 1;
                } else {
                    matrix[columnsInd][stringsInd] = columns - stringsInd;
                }
            }
        }
        printMatrixInt (matrix);
    }
}
