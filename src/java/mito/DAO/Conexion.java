package mito.DAO;

import java.sql.*;

public class Conexion {
protected Connection conexion;
//COnexion-mysql
private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
private final String DB_URL="jdbc:mysql://localhost:3306/curso_sql";

//base de datos credenciales
private final String USER="root";
private final String PASS="vasquez";
       
        public void conectar() throws Exception{
        try{
               conexion=DriverManager.getConnection(DB_URL,USER,PASS);
               Class.forName(JDBC_DRIVER);
               
        } catch (Exception e) {
                throw e;
        }
        }
        public void cerrar() throws SQLException{
              if(conexion !=null){
                      if(!conexion.isClosed()){
                        conexion.close();
                      }
              }  
        }
}
