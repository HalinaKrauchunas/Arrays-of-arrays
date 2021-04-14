//7. Сформировать квадратную матрицу порядка N по правилу:... и подсчитать количество положительных чисел

package com.epam.projects.five;

import com.epam.projects.*;

import static com.epam.projects.PrintMatrix.*;

public class MatrixByFormula {

    public static void main(String[] args) throws Exception {

        System.out.println ("Enter N: ");
        InputStreamReader reader = new InputStreamReader (System.in);
        int n = ParseNumber.getPositiveInt (reader);
        double[][] matrix = new double[n][n];

        int count = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                matrix[j][i] = Math.sin ((i * i) - (j * j)) / n;
                if (matrix[j][i] > 0) {
                    count++;
                }
            }
        }
        printMatrixDouble (matrix);
        System.out.println ("Count positive number in Matrix = " + count);
    }
}


