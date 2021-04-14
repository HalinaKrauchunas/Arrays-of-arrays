//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package com.epam.projects.five;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class DiagonalPrint {

    public static void main(String[] args) {

        int columns = 4;
        int strings = 4;
        int[][] matrix = new int[columns][strings];

        fillingMatrixRandomInt(columns, strings, matrix);
        printMatrixInt (matrix);

        for (int countColumn = 0; countColumn < matrix.length; countColumn++) {
            System.out.print (matrix[countColumn][countColumn] + " ");
        }
    }
}
