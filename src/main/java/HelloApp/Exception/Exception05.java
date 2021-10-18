package HelloApp.Exception;

import java.io.IOException;

public class Exception05 {
    public static void main(String[] args) {
        try{
            methodA();
            methodB();
        }catch (ArrayStoreException | IOException e){
            System.out.println(e);
        }
    }

    static void methodA() throws ArrayStoreException{
        throw new ArrayStoreException();
    }

    static void methodB() throws  IOException{
        throw new IOException();
    }
}

