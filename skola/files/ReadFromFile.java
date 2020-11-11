package skola.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args){
        FileReader fr = null;
        try{
        fr = new FileReader("D:\\hello.txt");
        int i;
        while ( (i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();}
        catch(FileNotFoundException e){
        e.printStackTrace();}
        catch(IOException e){
        e.printStackTrace();}
    }
}
