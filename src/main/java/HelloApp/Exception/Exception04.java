package HelloApp.Exception;

import java.io.FileReader;
import java.io.IOException;

public class Exception04 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            FileReader rf = new FileReader("a.txt");
            rf.read();
        } catch (ArithmeticException | IOException e) {
            e.printStackTrace();
        }

    }

}

