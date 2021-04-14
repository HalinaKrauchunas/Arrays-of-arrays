//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное). Пыталась решить другим способом, но
// пока не вышло

package com.epam.projects.five;

import java.util.*;

public class Oclock {

    public static void main(String[] args) {

        int columns = 6;
        int strings = 6;
        int numberString = strings - 1;

        int[][] matrix = new int[columns][strings];

        for (int countColumn = 0; countColumn < matrix.length; countColumn++, numberString--) {
            matrix[countColumn][countColumn] = 1;
            matrix[countColumn][numberString] = 1;
        }

        for (int[] arr : matrix) {
            System.out.println (Arrays.toString (arr));
        }
    }
}