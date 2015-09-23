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
                builder.append(String.format("%4d ", i));
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
    public Matrix multiply(Matrix matrix2){
        
        if(getNumberOfColumns() != matrix2.getNumberOfRows()){
            System.out.println("ERROR M1 Columns # != M2 Rows #.");
        }else{
            System.out.println("M1 and M2 can be multiplied.");
        }
        
        int n,m,p;
        n = getNumberOfRows();
        p = matrix2.getNumberOfColumns();
        m = getNumberOfColumns();
        
        int[][] resultArray = new int[n][p];
        
        //resultArray[0][1] = 0;
        //System.out.println(String.format("M1[%d][%d] x M2[%d][%d]", n, m, m, p));
        
        for(int nF = 0; nF < n; nF++){
            for(int pF = 0; pF < p; pF++){
                for(int mF = 0; mF < m; mF++){
                    //System.out.println(String.format("(m1) %d * %d (m2)", getValueAt(nF, mF), matrix2.getValueAt(mF, pF)));
                    resultArray[nF][pF] += (getValueAt(nF, mF) * matrix2.getValueAt(mF, pF));
                }
            }
        }
        
        Matrix resultMatrix = new Matrix(resultArray);
        System.out.println(resultMatrix.toString());
        
        return resultMatrix;
    }
    
}
