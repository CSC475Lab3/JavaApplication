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
public class Matrix {
    private int[][] matrix;

    public Matrix() {
        this.matrix = null;
    }
    
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int matrixRow[] : this.matrix) {
            for(int i : matrixRow) {
                builder.append(String.format("%02d ", i));
            }
             builder.append("\n");
        }
        return builder.toString();
    }
    
    public int multiply(Matrix matrix2){
        return 0;
    }
    
}
