//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
// соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.

package com.epam.projects.five;

import com.epam.projects.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class ReverseColumns {

    public static void main(String[] args) throws Exception {

        int columns = 3;
        int strings = 4;
        int[][] matrix = new int[columns][strings];

        fillingMatrixRandomInt (columns, strings, matrix);
        printMatrixInt (matrix);

        System.out.println ("Enter numbers column");
        InputStreamReader reader = new InputStreamReader (System.in);
        int oneColumn = ParseNumber.getPositiveInt (reader) - 1;
        int twoColumn = ParseNumber.getPositiveInt (reader) - 1;

        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            int oneColumns = matrix[columnsInd][oneColumn];
            matrix[columnsInd][oneColumn] = matrix[columnsInd][twoColumn];
            matrix[columnsInd][twoColumn] = oneColumns;
        }
        printMatrixInt (matrix);
    }
}



