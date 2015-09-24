/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc475lab3;

/**
 *
 * @author Igor Kimieciki
 */
public class CSC475Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float[][] array1 = {{1,2,3},{4,5,6}};
        float[][] array2 = {{7,8},{9,10},{11, 12}};
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        
        System.out.println(matrix1);
        System.out.println(matrix2);
        
        matrix1.multiply(matrix2);
        
        FileReadingModule.readFileToMatrices("matrices_values.txt", matrix1, matrix2);
    }
    
}
