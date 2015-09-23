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
        this.matrix = new int[0][0];
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
    
    public int getNumberOfColumns(){
        return matrix[0].length;
    }
    
    public int getNumberOfRows(){
        return matrix.length;
    }
    
    public int getValueAt(int row, int column){
        return matrix[row][column];
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
    /*
    If A is n × m and B is an m × p, AB is n × p
    M1 number of columns must be equal to M2 number of rows
    M1 * M2 must have M1's number of rows and M2's number of columns
    */
    public int multiply(Matrix matrix2){
        
        if(getNumberOfColumns() != matrix2.getNumberOfRows()){
            System.out.println("ERROR M1 Columns # != M2 Rows #.");
        }else{
            System.out.println("M1 and M2 can be multiplied.");
        }
        
        int n,m,p;
        n = getNumberOfRows();
        p = matrix2.getNumberOfColumns();
        m = getNumberOfColumns();
        
        return 0;
    }
    
}
