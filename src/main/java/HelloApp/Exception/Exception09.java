package HelloApp.Exception;

import java.sql.SQLException;

class MyResources implements AutoCloseable {
    private final String msg;

    public MyResources(String msg) {
        this.msg = msg;
    }

    public void close() throws Exception {
        System.out.println("Close " + msg);
    }
}

public class Exception09 {
    public static void main(String[] args) {
        try (MyResources obj1 = new MyResources("obj1");
             MyResources obj2 = new MyResources("obj2")) {
            System.out.println("Tryブロック内の処理");
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("Catchブロック: SQLException");
        } catch (Exception e) {
            System.out.println("Catchブロック: Exception");
        } finally {
            System.out.println("Finallyブロック");
        }
    }

}
