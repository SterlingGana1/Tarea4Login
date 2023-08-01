
package Conexion;
  
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class conex {
   Connection cn;  
  
   public Connection ConectarND(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginproyecto","root","");
          System.out.println("Conexion Exitosa");
       } catch (Exception e) {
           System.out.println("Conexion Fallida");
       }
       return cn;
   }

    public Connection ConectarBD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
