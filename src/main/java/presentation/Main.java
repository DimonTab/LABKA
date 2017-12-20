package presentation;

import application.MatrixClass;

public class Main {
    public static void main (String[] args) {
        int [][] matrix = new int[][]{{8, 3, 9, 2, 1}, {0, 6, 8, 2, 5}, {12, 4, 7, 0, 8}, {3, 5, 3, 7, 1}, {11, 3, 1, 9, 12}};
        MatrixClass matrixClass = new MatrixClass();
        System.out.println("Исходная матрица:");
        matrixClass.printMatrix(matrix);
        System.out.print("Минимальный элемент главной диагонали: " + matrixClass.minMainDiagonal(matrix));
        System.out.println();
        System.out.println("Сумма элементов больших чем минимум главной диагонали: " + matrixClass.sumElemtntsMoreThanMinElement(matrix, matrixClass.minMainDiagonal(matrix)));
    }
}
