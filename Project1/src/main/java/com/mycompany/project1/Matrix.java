/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Mostafa
 */
public class Matrix {
    // Function to add the two matrices
    // and store in matrix C
    public void addition(int A[][], int B[][],int size)
    {
        int i, j;
        int C[][] = new int[size][size];
 
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
        //ptint the result
        System.out.println("\nResultant Matrix of Addition:");
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < size; n++)
                System.out.print(C[m][n] + " ");
 
            System.out.println();
        }
        
    }
    
    public void subtraction(int A[][], int B[][],int size)
    {
        int i, j;
        int C[][] = new int[size][size];
 
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] - B[i][j];
        //ptint the result
        System.out.println("\nResultant Matrix of Subtraction:");
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < size; n++)
                System.out.print(C[m][n] + " ");
 
            System.out.println();
        }
        
    }
    
    public void multiplyMatrix(
        int row1, int col1, int A[][],
        int row2, int col2, int B[][])
    {
        int i, j, k;
        // Check if multiplication is Possible
        if (row2 != col1) 
        {
            System.out.println("Multiplication Not Possible"); 
        }
 
        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int C[][] = new int[row1][col2];
 
        // Multiply the two matrices
        for (i = 0; i < row1; i++) 
        {
            for (j = 0; j < col2; j++) 
            {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
 
        // Print the result
        System.out.println("\nResultant Matrix of Multiplication:");
        for (int m = 0; m < row1; m++) 
        {
            for (int n = 0; n < col2; n++)
                System.out.print(C[m][n] + " ");
 
            System.out.println();
        }
    }
    
}
