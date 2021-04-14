//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
// число 5 встречается три и более раз.

package com.epam.projects.five;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class PrintNumberString {

    public static void main(String[] args) {

        int strings = 20;
        int columns = 10;
        int countFive = 0;

        int[][] matrix = new int[columns][strings];

        fillingMatrixRandomInt (columns, strings, matrix);
        printMatrixInt (matrix);

        for (int countCol = 0; countCol < columns - 1; countCol++, countFive = 0) {
            for (int i : matrix[countCol]) {
                if (i == 5) {
                    countFive++;
                }
            }
            if (countFive >= 3) {
                System.out.print (countCol + 1 + " ");
            }
        }
    }
}
