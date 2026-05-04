public class Matrix_Inversion {
    public static void main(String args[])
    {
        double[][] A = {
                    {1, 0, 5},
                    {9, 6, 4},
                    {2, 8, 2}
        };
        double[][] I = {
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
        };

        for (int k = 0; k < 3; k++)
        {
                A[1][k] = A[1][k] - (9 * A[0][k]);
                I[1][k] = I[1][k] - (9 * I[0][k]);
        }

        for (int k = 0; k < 3; k++)
        {
                A[2][k] = A[2][k] - (2 * A[0][k]);
                I[2][k] = I[2][k] - (2 * I[0][k]);
        }

        for (int k = 0; k < 3; k++)
        {
                A[2][k] = A[2][k] - (8.0 / 6 * A[1][k]);
                I[2][k] = I[2][k] - (8.0 / 6 * I[1][k]);
        }

        for (int k = 0; k < 3; k++)
        {
                A[1][k] = A[1][k] / 6;
                I[1][k] = I[1][k] / 6;
        }

        for (int k = 0; k < 3; k++)
        {
                A[2][k] = A[2][k] * (3.0 / 140);
                I[2][k] = I[2][k] * (3.0 / 140);
        }

        for (int k = 0; k < 3; k++)
        {
                A[1][k] = A[1][k] + (41.0 / 6 * A[2][k]);
                I[1][k] = I[1][k] + (41.0 / 6 * I[2][k]);
        }

        for (int k = 0; k < 3; k++)
        {
                A[0][k] = A[0][k] - (5 * A[2][k]);
                I[0][k] = I[0][k] - (5 * I[2][k]);
        }

        System.out.println("Inverse: ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.4f ", I[i][j]);
            }
            System.out.println();
        }
    }
}
