package application;

import exceptions.SquareMatrixException;

public class MatrixClass {

    public void printMatrix (int [][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int minMainDiagonal (int [][] matrix) throws SquareMatrixException {
        int minElement = matrix[0][0];
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if ((i == j) && (matrix[i][j] < minElement)) {
                        minElement = matrix[i][j];
                    }
                }
            }
        } else throw new SquareMatrixException();
        return minElement;
    }

    public int sumElemtntsMoreThanMinElement(int [][] matrix, int minElement) {
        int n = matrix.length;
        int sumElements = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] > minElement) {
                    sumElements += matrix[i][j];
                }
            }
        }
        return sumElements;
    }
}
