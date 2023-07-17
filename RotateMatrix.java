package rotatematrix;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        int[][] array = new int[row][row];
        System.out.println("Enter array Elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        transpose(array, row);

    }

    public static void transpose(int array[][], int row) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                array[i][j] = array[j][i];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
