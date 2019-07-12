package oopstudent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* read the file specified in filepath, first time it reads libname.csv and returns NIE,Mysore and
 * second time it reads libbooks.csv and returns  Java,Buyya,2014,McGraHill */
public class Filerd {

    String lines="";

   public String readFromFile(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = "";

            currentline = br.readLine();


            while (currentline != null) {
                lines += currentline + "\n";
                currentline = br.readLine();

            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (lines);
    }

}