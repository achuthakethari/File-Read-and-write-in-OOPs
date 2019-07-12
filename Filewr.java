package oopstudent;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/* write contents into the file specified in filepath, here it will write NIE:Mysore;Java:Buyya:2014:McGraHill; into file
 * nielib.csv */
public class Filewr {
    public void writeToFile(String filewrcontents, String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(filewrcontents);
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
