/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop_prediction;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DellUser
 */
public class ParseCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
   
      //csv file containing data
      String strFile = "/E:/final.csv";
      String strFile2="/E:/final.csv";
      CSVReader reader = new CSVReader(new FileReader(strFile));
      String [] nextLine;
    
      int lineNumber = 0;
      while ((nextLine = reader.readNext()) != null) {
        lineNumber++;
      }
     
      CSVReader reader2 = new CSVReader(new FileReader(strFile2));
      
      String foldCrop;
      int lineC=0;
      int i=0;
      String[] Temp=new String[lineNumber];
      String last=new String();
      String [] nextLine2;
      
      
        while ((nextLine2 = reader2.readNext()) != null) 
        {
            //System.out.println("Line # " + lineC);  
            Temp[lineC]=nextLine2[1];
            lineC++;       
        }
        
        
        for(i=0;i<lineC;i++);       
         last=Temp[i-1];
         System.out.println("Last"+last);
         
    }
  }
    
    

