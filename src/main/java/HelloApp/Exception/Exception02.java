package HelloApp.Exception;

public class Exception02 {
    public static void main(String[] args){
        String s = "A"; int[] num = {10,0};
        try{
            System.out.print(Integer.parseInt(s));
        } catch(NumberFormatException | ArithmeticException e){
            e.printStackTrace();
        }
    }
}
