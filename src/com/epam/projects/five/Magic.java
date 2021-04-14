//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить
// такой квадрат.

package com.epam.projects.five;

import com.epam.projects.*;

import static com.epam.projects.FilingMatrix.*;
import static com.epam.projects.PrintMatrix.*;

public class Magic {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int n = ParseNumber.multipleOfFour (reader);
        System.out.print ("N = ");
        int[][] magicMatrix = new int[n][n];
        System.out.println ("Source matrix: ");
        CreateArrOneToN (magicMatrix);
        printMatrixInt (magicMatrix);
        System.out.println ("Magic: ");
        Magic.ReverseArray1 (magicMatrix);
        Magic.ReverseArray2 (magicMatrix);
        printMatrixInt (magicMatrix);
    }

    public static void ReverseArray1(int[][] matrix) {

        int number;
        int len = matrix.length - 1;
        for (int countStr = 0; countStr < matrix.length / 2; countStr++) {
            for (int countColumn = 0; countColumn < matrix.length / 2; countColumn++) {
                if (countStr == countColumn) {
                    number = matrix[countStr][countColumn];
                    matrix[countStr][countColumn] = matrix[len - countStr][len - countColumn];
                    matrix[len - countStr][len - countColumn] = number;
                }
            }
        }
    }

    public static void ReverseArray2(int[][] matrix) {

        int number;
        for (int countStr = 0, countColumn = matrix.length - 1 - countStr; countStr <= (matrix.length / 2) - 1; ++countStr, --countColumn) {
            number = matrix[countStr][countColumn];
            matrix[countStr][countColumn] = matrix[countColumn][countStr];
            matrix[countColumn][countStr] = number;
        }
    }
}


