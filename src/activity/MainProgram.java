package activity;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProgram {

    public static SquareMatrix read(String location) throws IOException {
        File file = new File(location);
        Scanner input = new Scanner(file);
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        return new SquareMatrix(matrix);
    }

    public static void write(String location, StringBuilder builder) throws IOException {
        File file = new File(location);
        PrintWriter writer = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String location = "data" + File.separator + "matrix.txt";
        String otherLocation = "data" + File.separator + "other_matrix.txt";
        String outputLocation = "data" + File.separator + "output.txt";

        // Create object to append string output of matrix
        StringBuilder builder = new StringBuilder("\n");

        // TODO : Create matrices for testing

        int size = 3;
        int[][] mtrx = new int[3][3];

        // Create matrix
        SquareMatrix matrix = new SquareMatrix(mtrx);
        SquareMatrix matrixSize = new SquareMatrix(size);

        // read matrix from file
        SquareMatrix mainMatrix = read(location);
        SquareMatrix otherMatrix = read(otherLocation);


        // TODO : Test operations of Square Matrices:

        // operations Add Square Matrices
        SquareMatrix resAddMatrix = mainMatrix.add(otherMatrix);
        // operations Subtract Square Matrices
        SquareMatrix resSubtractMatrix = mainMatrix.subtract(otherMatrix);
        // operations Multiply Square Matrices
        SquareMatrix resMultiplyMatrix = mainMatrix.multiply(otherMatrix);

        // operations Equals Square Matrices
        boolean resEqualsMatrixFalse = matrix.equals(mainMatrix);
        boolean resEqualsMatrixTrue = matrix.equals(matrixSize);

        // operations isDiagonal Square Matrices
        boolean resMatrixIsDiagonalTrue = mainMatrix.isDiagonal();
        boolean resMatrixIsDiagonalFalse = otherMatrix.isDiagonal();

        // operations Identity Square Matrices
        boolean resMatrixIdentityTrue = mainMatrix.Identity();
        boolean resMatrixIdentityFalse = otherMatrix.Identity();



        // console log results of operation

        System.out.println("Console log results");
        System.out.print("Results of add operations " + resAddMatrix);



        // write to output file:
        write(outputLocation, builder);

    }
}