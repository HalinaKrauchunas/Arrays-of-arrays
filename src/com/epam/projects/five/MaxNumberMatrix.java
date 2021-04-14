//    15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package com.epam.projects.five;

import java.util.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class MaxNumberMatrix {

    public static void main(String[] args) {

        int strings = 4;
        int columns = 3;
        int max = 0;
        int[][] matrix = new int[strings][columns];

        fillingMatrixRandomInt (strings, columns, matrix);
        printMatrixInt (matrix);
        System.out.println ();

        ArrayList<Integer> numbers = new ArrayList<> ();
        for (int countStr = 0; countStr < strings; countStr++) {
            for (int countNumber : matrix[countStr]) {
                numbers.add (countNumber);
                numbers.sort (Comparator.reverseOrder ());
                max = numbers.get (0);
            }
        }
        numbers.clear ();

        for (int countStr = 0; countStr < strings; countStr++) {
            for (int countNumber : matrix[countStr]) {
                if (countNumber % 2 == 0 && numbers.size () < columns) {
                    numbers.add (countNumber);
                } else numbers.add (max);
            }
            System.out.println (numbers);
            numbers.clear ();
        }
    }
}

