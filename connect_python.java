/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop_prediction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author DellUser
 */
public class connect_python {

   
    public static void main(String[] args) throws InterruptedException, IOException {
        try{
            String pythonPath = "C:/Users/DellUser/Documents/NetBeansProjects/Crop_Prediction/src/crop_prediction/crop_1.py";
            //String pythonExe = "C:/Users/AppData/Local/Continuum/Anaconda/python.exe";
            ProcessBuilder pb = new ProcessBuilder(Arrays.asList("C:/Python27/libs", pythonPath));
            Process p = pb.start();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            System.out.println("Running Python starts: " + line);
            int exitCode = p.waitFor();
            System.out.println("Exit Code : "+exitCode);
            line = bfr.readLine();
            System.out.println("First Line: " + line);
            while ((line = bfr.readLine()) != null){
                System.out.println("Python Output: " + line);

    }            

        }catch(Exception e){System.out.println(e);}
    }
            
    
}
