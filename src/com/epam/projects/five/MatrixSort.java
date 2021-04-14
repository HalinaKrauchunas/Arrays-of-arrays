//12.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
//13.Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

package com.epam.projects.five;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;
import static com.epam.projects.SortMatrix.*;

public class MatrixSort {

    public static void main(String[] args) {

        int columns = 3;
        int strings = 4;
        int[][] matrix = new int[strings][columns];

        fillingMatrixRandomInt (strings, columns, matrix);
        printMatrixInt (matrix);

        System.out.println ("\nSort string Increase");
        sortStrMatrixIncrease (columns, matrix);

        System.out.println ("\nSort string Decrease");
        sortStrMatrixDecrease (columns, matrix);

        System.out.print ("\nSort column Increase");
        sortColumnMatrixIncrease (columns, strings, matrix);

        System.out.print ("\n\nSort column Decrease");
        sortColumnMatrixDecrease (columns, strings, matrix);
    }
}