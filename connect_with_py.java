/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop_prediction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

/**
 *
 * @author DellUser
 */
public class connect_with_py {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ScriptException {
    try{
 
String prg = "import sys\nprint int(sys.argv[1])+int(sys.argv[2])\n";
//BufferedWriter out = new BufferedWriter(new FileWriter("crop_1.py"));
//out.write(prg);
//out.close();
//int number1 = 10;
//int number2 = 32;
 
//ProcessBuilder pb = new ProcessBuilder("python","crop_1.py",""+number1,""+number2);
ProcessBuilder pb = new ProcessBuilder("python","crop_1.py");
Process p = pb.start();
 
BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
int ret = new Integer(in.readLine()).intValue();
System.out.println("value is : "+ret);
}catch(Exception e){System.out.println(e);}
    
    }}
