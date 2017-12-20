package application;

import exceptions.SquareMatrixException;
import org.junit.Assert;
import org.junit.Test;

public class MatrixClassTest {

    @Test(expected = SquareMatrixException.class)
    public void testMatrixNotSquare() {
        int[][] matrix = {{1, 5, 3},
                {4, 2, 6}};
        MatrixClass matrixClass = new MatrixClass();
        matrixClass.minMainDiagonal(matrix);
    }

    @Test
    public void testMatrixNormDataMin() {
        int[][] matrix = {{6, 5, 3},
                {4, 2, 6},
                {5, 7, 8}};
        MatrixClass matrixClass = new MatrixClass();
        int min =  matrixClass.minMainDiagonal(matrix);
        Assert.assertEquals(min, 2);
    }

    @Test
    public void testMatrixNormDataMinNegative() {
        int[][] matrix = {{-6, 5, 3},
                {4, 2, 6},
                {-5, 7, 8}};
        MatrixClass matrixClass = new MatrixClass();
        int min =  matrixClass.minMainDiagonal(matrix);
        Assert.assertEquals(min, -6);
    }

    @Test
    public void testMatrixNormDataSumm() {
        int[][] matrix = {{6, 1, 3},
                {4, 2, 6},
                {2, 7, 1}};
        MatrixClass matrixClass = new MatrixClass();
        int sum = matrixClass.sumElemtntsMoreThanMinElement(matrix, matrixClass.minMainDiagonal(matrix));
        Assert.assertEquals(sum, 30);
    }

    @Test
    public void testMatrixNormDataSummZero() {
        int[][] matrix = {{7, 5, 3},
                {4, 7, 6},
                {2, 7, 7}};
        MatrixClass matrixClass = new MatrixClass();
        int sum =  matrixClass.sumElemtntsMoreThanMinElement(matrix, matrixClass.minMainDiagonal(matrix));
        Assert.assertEquals(sum, 0);
    }
}
