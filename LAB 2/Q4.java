import java.util.Scanner;

class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j,sum = 0;
        int[][] mat = new int[3][3];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j)
                {
                    sum = sum + mat[i][j];
                }
            }
        }

        System.out.printf("SUM of diagonal is " + sum);
    }
}