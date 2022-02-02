package Lab02;
import java.util.*;

/**
 * Name: Aditya Verma
 * Date: Feb 1, 2022
 * Description: Lab 01 "Arrays" Submission for CS321.
 */
public class Main {

    /**
     * Prints out my full name appended after the string "Full Name : "
     * @param fullName A string array containing my full name
     */
    public static void displayName(String fullName) {
        System.out.print("Full Name : " + fullName + "\n");
    }

    /**
     * Prints out every array element of the 1D integer array passed in as method argument.
     * @param array A 1D integer array
     */
    public static void displayArray(int[] array) {

        System.out.print("\n");

        //iterating through and printing all elements of array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    /**
     * Prints out all array elements of the 2D integer array passed in as method argument.
     * Printing each row on its own line.
     * @param array A 2D integer array
     */
    public static void display2DArray(int[][] array) {

        System.out.println();

        //iterating through and printing all elements of array
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Checks if two 1D integer arrays are equal by comparing
     * every element of both arrays correspondingly.
     * @param array1  A 1D integer array
     * @param array2  A 1D integer array
     * @return reValue ; a boolean value; True if arrays are equal, False if arrays are not equal
     */
    public static boolean equals(int[] array1, int[] array2) {

        //storing the lengths of arrays in new variables
        int lenArray1 = array1.length;
        int lenArray2 = array2.length;

        boolean retValue = true;

        /**
         * Checking if both arrays' lengths are equal, if not they are not the same,
         * the arrays cannot be equal.
         */
        if ( lenArray1 != lenArray2) {
            retValue = false;
            return retValue;
        }

        /**
         * Iterating through all elements of both arrays, checking if they are equal.
         * Returning false if a mismatch is found, meaning the arrays are not equal.
         */
        for (int i = 0; i < lenArray1; i++) {
            if (array1[i] != array2[i]) {
                retValue = false;
                return retValue;
            }
        }
        return retValue;
    }

    /**
     * Checks if two 2D integer arrays are equal by comparing
     * every element of both arrays correspondingly.
     * @param array1  A 2D integer array
     * @param array2  A 2D integer array
     * @return reValue ; a boolean value; True if arrays are equal, False if arrays are not equal
     */
    public static boolean equals2D(int[][] array1, int[][] array2) {

        //storing the lengths of arrays in new variables
        int lenArray1 = array1.length;
        int lenArray2 = array2.length;

        boolean retValue = true;

        /**
         * Checking if both arrays' lengths are equal, if not they are not the same,
         * the arrays cannot be equal.
         */
        if ( lenArray1 != lenArray2) {
            retValue = false;
            return retValue;
        }

        /**
         * Iterating row-by-row comparing all corresponding elements.
         * Returning false if a mismatch is found anywhere, meaning the 2D arrays are not equal.
         * Using the function equals() to compare respective rows in the 2D arrays.
         */
        for (int i = 0; i < lenArray1; i++) {
           boolean retVal = equals(array1[i], array2[i]);
           if (retVal == false) {
               return false;
           }
        }
        return true;
    }

    /**
     * Computes the sum of all the elements in one 1D integer array.
     * @param array  A 1D integer array
     * @return sum ; an integer value ; the sum of all elements in the 1D array.
     */
    public static int sumArray(int[] array) {

        //iterating through all elements of the array and adding them into the variable sum.
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Computes the sum of all the elements in one 2D integer array.
     * @param array  A 2D integer array
     * @return sum ; an integer value ; the sum of all elements in the 2D array.
     */
    public static int sum2DArray(int[][] array) {

        //iterating through all elements of the 2D array and adding them into the variable sum.
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    /**
     * Computes the product of two matrices.
     * @param array1  A 2D integer array
     * @param array2  A 2D integer array
     * @return multRes ; a 2D integer array containing the product of the two matrices.
     */
    public static int[][] multMatrices(int[][] array1, int[][] array2) {

        /**
         * Checking if both the arrays' lengths are equal.
         * If not, printing an error message indicating a format fault in the matrix in arguments.
         */
        if (array1.length != array2.length) {
            if (array1[0].length != array2[0].length) {
                System.out.println("Error: Matrices' dimensions are not equal (nxn)");
            }
        }

        //initialising new 2D int array to store the product of the matrices.
        int[][] multRes = new int[array1.length][array1.length];

        //iterating through the 2D arrays and saving each corresponding elements' product into multRes
        for ( int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                multRes[i][j] += array1[i][j] * array2[i][j];
            }
        }
        return multRes;
    }

    /**
     * Tests all the functions listed above.
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) {

        //test for displayName()
        String fullName = "Aditya Verma";
        displayName(fullName);

        //test for displayArray()
        int testArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("\n1D Array: ");
        displayArray(testArray);

        //test for display2DArray()
        int test2DArray[][] = {{1, 2, 3,}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        System.out.print("\n2D Array: ");
        display2DArray(test2DArray);

        //test for equals()
        int[] testEquals1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] testEquals2 = new int[]{1, 12, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean retEquals = equals(testEquals1, testEquals2);
        System.out.print("equals() result: " + retEquals + "\n");

        //test for equals2D()
        int[][] arr1 = {{1, 2, 3}, {4, 15, 99}, {345, 88, 111}};
        int[][] arr2 = {{1, 2, 3}, {4, 15, 99}, {345, 88, 111}};
        boolean retEquals2D = equals2D(arr1, arr2);
        System.out.print("\nequals2D() result: " + retEquals2D + "\n");

        //test for sumArray()
        int[] arr = new int[]{44, 8, 108};
        int sum = sumArray(arr);
        System.out.println("\nSum of 1D array = " + sum);

        //test for sum2DArray()
        int[][] arr2D = {{2, 8, 10}, {1, 49, 5, 20}, {5, 10}};
        int sum2D = sum2DArray(arr2D);
        System.out.println("\nSum of 2D array = " + sum2D);

        //test for multMatrices()
        int matrix1[][] = {{1, 2}, {4, 1}};
        int matrix2[][] = {{2, 2}, {2, 2,}};
        int resMult[][] = multMatrices(matrix1, matrix2);

        System.out.print("\nMultiplication of matrices:\n");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(resMult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
