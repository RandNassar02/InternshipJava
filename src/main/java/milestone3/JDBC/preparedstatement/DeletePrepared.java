package milestone3.JDBC.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePrepared {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

            PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");
            stmt.setInt(1,101);

            int i=stmt.executeUpdate();
            System.out.println(i+" records deleted");

            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
