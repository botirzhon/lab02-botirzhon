package activity;

public class SquareMatrix {

    int[][] matrix;
    int size = 3;

    // Generating two constructors (2D array, size):

    public SquareMatrix(int[][] matrix) {
        int size = matrix.length;
        this.matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public SquareMatrix(int size) {
        this.matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public SquareMatrix add(SquareMatrix other) {
        SquareMatrix obj = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                obj.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return obj;
    }


    public SquareMatrix subtract(SquareMatrix other) {
        SquareMatrix obj = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                obj.matrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return obj;
    }

    public SquareMatrix multiply(SquareMatrix other) {
        SquareMatrix A = this;
        SquareMatrix B = other;
        SquareMatrix C = new SquareMatrix(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++)
                    C.matrix[i][j] += (A.matrix[i][k] * B.matrix[k][j]);
            }
        }
        return C;
    }

    public boolean equals(SquareMatrix obj) {
        if (obj.matrix.length != this.matrix.length) return false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (obj.matrix[i][j] != this.matrix[i][j]) return false;
            }
        }
        return true;
    }


    public boolean isDiagonal() {
        int[][] matrix = this.matrix;
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean Identity() {
        int[][] matrix = this.matrix;
        int tempMajor = matrix[0][0];

        for (int i = 0; i < size; i++) {
            if (matrix[i][i] != tempMajor) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.append(matrix[i][j]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}