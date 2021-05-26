/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop_prediction;

import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.System.out;

/**
 *
 * @author DellUser
 */
public class ReadMyFile {

    // Java code to illustrate reading a 
// CSV file line by line 
ReadMyFile(String file) 
{ 

	try { 

		// Create an object of filereader 
		// class with CSV file as a parameter.
                //System.out.println("filename: "+ file);
            
                
		FileReader filereader = new FileReader("/E:/shraddha/MCA/MCA-III/EDD_Project/final1234.csv"); 
                BufferedReader br= new BufferedReader(filereader);
		String[] line;
             
                // create csvReader object passing 
		// file reader as a parameter 
		
                CSVReader csvReader = new CSVReader(filereader); 
		String[] nextRecord; 
                           
                 String [] nextLine;
                 
                 String[] Crop = null;
                int lineNumber = 0;
                while ((nextLine = csvReader.readNext()) != null) {
                         lineNumber++;
                         //System.out.println("Line # " + lineNumber);

                           // nextLine[] is an array of values from the line
                          System.out.println(nextLine[2]);
                
                
                }

                
              

                
		// we are going to read data line by line 
		/*while ((nextRecord = csvReader.readNext()) != null) { 
			for (String cell : nextRecord) { 
				System.out.print(cell + "\t"); 
			} 
			System.out.println(); 
		} */
	} 
	catch (Exception e) { 
		e.printStackTrace(); 
	} 
} 

    public static void main(String[] args) {
        ReadMyFile r= new ReadMyFile("final.csv");
    }
    
}

//https://www.geeksforgeeks.org/reading-csv-file-java-using-opencv/https://www.geeksforgeeks.org/reading-csv-file-java-using-opencv/



