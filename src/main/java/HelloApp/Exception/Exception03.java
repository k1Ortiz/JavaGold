package HelloApp.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception03 {
    public static void main(String[] args){
        try{
            FileReader rf = new FileReader("a.txt");
            rf.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
