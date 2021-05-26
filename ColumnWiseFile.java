/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop_prediction;

import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DellUser
 */
public class ColumnWiseFile {

    
    public static void main(String[] args) throws IOException {
         List<String[]> lines = new ArrayList<String[]>();
         FileReader filereader = new FileReader("/E:/shraddha/MCA/MCA-III/EDD_Project/final1234.csv"); 
          BufferedReader br= new BufferedReader(filereader);
       String[] line;
        CSVReader csvReader = new CSVReader(filereader); 
        
       while ((line = csvReader.readNext()) != null) {
        // lines.add(line.split(","));
    }

// convert our list to a String array.
String[][] array = new String[lines.size()][0];
lines.toArray(array);
        
    }
    
}
