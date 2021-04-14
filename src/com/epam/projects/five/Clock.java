//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package com.epam.projects.five;

import java.util.*;

public class Clock {

    public static void main(String[] args) {

        int columns = 8;
        int strings = 8;
        int[][] matrix = new int[columns][strings];

        for (int countColumns = 0; countColumns < columns; countColumns++) {
            for (int countStrings = 0; countStrings < strings; countStrings++) {
                if (countColumns < (columns / 2)) {
                    if ((countStrings < countColumns) || (countStrings > (strings - countColumns - 1))) {
                        matrix[countColumns][countStrings] = 0;
                    } else {
                        matrix[countColumns][countStrings] = 1;
                    }
                } else {
                    if ((countStrings > countColumns) || (countStrings < (strings - countColumns - 1))) {
                        matrix[countColumns][countStrings] = 0;
                    } else {
                        matrix[countColumns][countStrings] = 1;
                    }
                }
            }
        }
        for (int[] arr : matrix) {
            System.out.println (Arrays.toString (arr));
        }
    }
}



