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
        System.out.println("------------------------------");
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            /*
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
            */
            
            
            
            
            
            
            
            //String[] parts = string.split("-");
            //String part1 = parts[0]; // 004
            //String part2 = parts[1]; // 034556
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadingModule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadingModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
