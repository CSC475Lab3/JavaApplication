/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc475lab3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Kimieciki
 */
public class FileReadingModule {
    
    
    public static void readFileToMatrices(String fileName, Matrix matrix1, Matrix matrix2){
        //System.out.println("------------------------------");
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            //System.out.println(line);
            
            
            line = br.readLine();// Blank line
            //System.out.println(line);
            
            String[] headerData;
            headerData = line.split(" ");
            int n,m,p;
            n = Integer.parseInt(headerData[0]);
            m = Integer.parseInt(headerData[1]);
            p = Integer.parseInt(headerData[2]);
            
            br.readLine();// Blank line
            //System.out.println(line);
            
            //m1 n rows and m columns
            //m2 m rows and p columns
            //System.out.println(String.format("-- %d, %d, %d", n, m, p));
            float[][] array1 = new float[n][m];
            String[] array1String;            
            
            for (int i = 0; i < n; i++){
                line = br.readLine();
                
                array1String = line.split(", ");
                for(int j = 0; j < m; j++) array1[i][j] = Float.parseFloat(array1String[j]);
                //System.out.println(line);                
            }
            
            br.readLine();// Blank line
            //System.out.println(line);
            
            float[][] array2 = new float[m][p];
            String[] array2String;         
            
            for (int i = 0; i < m; i++){
                line = br.readLine();
                
                array2String = line.split(", ");
                for(int j = 0; j < p; j++) array2[i][j] = Float.parseFloat(array2String[j]);
                //System.out.println(line);                
            }
            
            matrix1.setMatrix(array1);
            matrix2.setMatrix(array2);
            System.out.println(matrix1);
            System.out.println(matrix2);
            
                            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadingModule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadingModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
