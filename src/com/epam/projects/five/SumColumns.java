//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
// содержит максимальную сумму.

package com.epam.projects.five;

import java.util.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class SumColumns {

    public static void main(String[] args) throws Exception {

        int columns = 3;
        int strings = 2;
        int[][] matrix = new int[columns][strings];

        int countSum = 0;

        filingMatrixPositiveInt (columns, strings, matrix);
        printMatrixInt (matrix);

        Map<Integer, Integer> sums = new HashMap<> ();

        for (int countStrings = 0; countStrings < strings; countStrings++) {
            for (int countColumn = 0; countColumn < columns; countColumn++) {
                countSum += matrix[countColumn][countStrings];
            }
            System.out.println ("Column " + (countStrings + 1) + ": " + countSum);
            sums.put (countSum, countStrings + 1);
            countSum = 0;
        }
        Integer max = Collections.max (sums.keySet ());
        System.out.println ("\nMax column " + sums.get (max) + ": " + max);
    }
}