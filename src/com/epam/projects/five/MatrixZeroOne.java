//    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц
//    равно номеру столбца.
package com.epam.projects.five;

import static com.epam.projects.PrintMatrix.*;

public class MatrixZeroOne {

    public static void main(String[] args) {

        int columns = 4;
        int strings = 5;
        int countOne = 0;
        int[][] matrix = new int[columns][strings];

        for (int countStrings = 0; countStrings < strings; countStrings++, countOne = 0) {
            while (countOne != countStrings) {
                matrix[countOne][countStrings] = 1;
                countOne++;
            }
        }
        printMatrixInt (matrix);
    }
}