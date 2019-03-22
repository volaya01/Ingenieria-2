
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conection {
     public class conectardb {
    
    private String dbname = "restaurante";
    private int port=5432;
    private String hostname="localhost";
    private String username="postgres";    
    private String password = "gaia";

    public conectardb() {
    }
    
  public conectardb(String dbname, int port) {
        this.dbname = dbname;
        this.port = port;
    }
    
    
  public Connection conectPostgresg() throws SQLException{
       Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://"+hostname+":"+port+"/"+dbname,username,password);
           
           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"no ha cargado en driver (.jar) de posrtgres");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no pudo hacer conexion a la base de datos");
           
        }
          return connection;
    }
}

}
