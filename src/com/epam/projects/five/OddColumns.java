//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

package com.epam.projects.five;

import com.epam.projects.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class OddColumns {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int columns = ParseNumber.getPositiveInt (reader);
        int strings = ParseNumber.getPositiveInt (reader);
        int[][] matrix = new int[columns][strings];

        fillingMatrixRandomInt (columns, strings, matrix);
        printMatrixInt (matrix);

        for (int countStrings = 0; countStrings < columns; countStrings++) {
            if (countStrings % 2 == 0 && matrix[0][countStrings] > matrix[columns - 1][countStrings]) {
                System.out.print ("\nColumn " + (countStrings + 1) + ": ");
                for (int countColumn = 0; countColumn < columns; countColumn++) {
                    System.out.print (matrix[countColumn][countStrings] + " ");
                }
            }
        }
    }
}

//if(countColumn % 2 == 0 && matrix[countColumn][0] > matrix[countColumn][strings-1]){
//    System.out.println("Strings " + (countColumn+1) + ": " + Arrays.toString(matrix[countColumn]));
//    }
//                    System.out.print (matrix[countColumn][countStrings] + " ");


