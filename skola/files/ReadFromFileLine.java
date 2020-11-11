package skola.files;

import java.io.*;

public class ReadFromFileLine {
    public void copyFileWithCapital(String fileName){
        BufferedReader reader;
        try {
            FileReader fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            String line;
            while ((line=reader.readLine())!=null){
                line = line.toUpperCase();
                System.out.println(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
