/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class consultas {
     private Connection con;
     private ResultSet rs;
     private String consulta, error;
     
     
     public consultas(Connection c, String sql){
         this.con=c;
         this.consulta=sql;
            try{
                Statement st = con.createStatement();
                rs = st.executeQuery(consulta);
                error = null;
            }catch (SQLException ex){
                error = ex.getMessage();
                }
     }
}
