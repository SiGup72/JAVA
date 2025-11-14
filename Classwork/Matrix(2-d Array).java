import java.util.Arrays;
import java.util.Scanner;

class Matrix {

    // Display
    static public void Display(int ar1[][], int ar2[][]) {
        System.out.println("Matrix 1: \n" + Arrays.deepToString(ar1));
        System.out.println("Matrix 2: \n" + Arrays.deepToString(ar2));
    }

    // Addition
    public static int[][] Addition(int ar1[][], int ar2[][], int r, int c) {
        System.out.println("The sum of two matrices is:");
        int result[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return result;
    }

    // Subtraction
    public static int[][] Subtraction(int ar1[][], int ar2[][], int r, int c) {
        System.out.println("The difference of two matrices is:");
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = ar1[i][j] - ar2[i][j];
            }
        }
        return result;
    }

    // Multiplication
    public static int[][] Multiplication(int ar1[][], int ar2[][], int r, int c) {
        System.out.println("The product of two matrices is:");
        if (r != c) {
            System.out.println("Multiplication of matrices requires cols of Matrix1 = rows of Matrix2");
            return null;
        } else {
            int result[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    result[i][j] = 0; // initialize
                    for (int k = 0; k < c; k++) {
                        result[i][j] += ar1[i][k] * ar2[k][j];
                    }
                }
            }
            return result;
        }
    } 

    // Transpose
    public static int[][] Transpose(int ar[][], int r, int c) {
        System.out.println("The transpose of matrix is:");
        int result[][] = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[j][i] = ar[i][j];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int ar1[][] = new int[r][c];
        int ar2[][] = new int[r][c];

        System.out.println("Enter the elements of first array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the elements of second array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar2[i][j] = scan.nextInt();
            }
        }

        boolean run = true;
        while (run) {
            System.out.println("Which operation you want to perform");
            System.out.println("1. Display matrices");
            System.out.println("2. Addition");
            System.out.println("3. Subtraction");
            System.out.println("4. Multiplication");
            System.out.println("5. Transpose of Matrix 1");
            System.out.println("6. Transpose of Matrix 2");
            System.out.println("7. Exit");

            int x = scan.nextInt();

            switch (x) {
                case 1: {
                    Display(ar1, ar2);
                    break;
                }
                case 2: {
                    int result[][] = Addition(ar1, ar2, r, c);
                    System.out.println(Arrays.deepToString(result));
                    break;
                }
                case 3: {
                    int result[][] = Subtraction(ar1, ar2, r, c);
                    System.out.println(Arrays.deepToString(result));
                    break;
                }
                case 4: {
                    int result[][] = Multiplication(ar1, ar2, r, c);
                    if (result != null) {
                        System.out.println(Arrays.deepToString(result));
                    }
                    break;
                }
                case 5: {
                    int result[][] = Transpose(ar1, r, c);
                    System.out.println(Arrays.deepToString(result));
                    break;
                }
                case 6: {
                    int result[][] = Transpose(ar2, r, c);
                    System.out.println(Arrays.deepToString(result));
                    break;
                }
                case 7: {
                    run = false;
                    break;
                }
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
}
