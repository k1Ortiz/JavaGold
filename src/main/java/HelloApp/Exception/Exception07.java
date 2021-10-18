package HelloApp.Exception;

class MyExceptionA extends Exception{
    String msgA="MyExceptionA";
}

class MyExceptionB extends Exception{
    String msgB="MyExceptionB";
}

public class Exception07 {
    public static void main(String[] args) {
        try {
            method();
        }catch (MyExceptionA e){
            System.out.println(e.msgA);
        }catch (MyExceptionB e){
            System.out.println(e.msgB);
        }
    }

    public static void method() throws MyExceptionA,MyExceptionB{
        int a=10;
        try{
            if(a==10){
                System.out.println("A");
                throw new MyExceptionA();
            }else{
                System.out.println("B");
                throw new MyExceptionB();
            }
        }catch (Exception e){
            throw e;
        }
    }

}
