//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

package com.epam.projects.five;

import com.epam.projects.*;

import java.util.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class PrintStrAndColumn {

    public static void main(String[] args) throws Exception {

        int columns = 8;
        int strings = 3;
        int[][] matrix = new int[columns][strings];
        fillingMatrixRandomInt (columns, strings, matrix);
        printMatrixInt (matrix);

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.println ("Enter a number column: ");
        int numberColumns = ParseNumber.getPositiveInt (reader);
        System.out.println ("Enter a number string: ");
        int numberStrings = ParseNumber.getPositiveInt (reader);

        System.out.println ("Columns " + numberColumns + ": " + Arrays.toString (matrix[numberColumns - 1]));
        System.out.print ("Strings " + numberStrings + ": ");
        for (int[] s : matrix) {
            System.out.print (s[numberStrings - 1] + " ");
        }
    }
}
