//10. Найти положительные элементы главной диагонали квадратной матрицы.

package com.epam.projects.five;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class PositiveMainDiagonal {

    public static void main(String[] args) {

        int columns = 3;
        int strings = 3;
        int numberString = strings - 1;

        int[][] matrix = new int[columns][strings];

        filingMatrixInt (columns, strings, matrix);
        printMatrixInt (matrix);

        System.out.print ("Positive number: ");
        for (int countColumn = 0; countColumn < matrix.length; countColumn++, numberString--) {
            int number = matrix[countColumn][countColumn];
            if (number > 0) {
                System.out.print (number + " ");
            }
        }
    }
}
