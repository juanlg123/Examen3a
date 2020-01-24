package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String username;
    private String password;
    private String url;
    private Connection conn;
    
    public Database(){
        this.username = "sa";
        this.password = "12345678";
        this.url = "jdbc:sqlserver://10.227.30.42:1433;databaseName=idat";
    }
    
    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public String getUrl() { return url;}

    public Connection getConn() { return conn; }

    public void connect() throws ClassNotFoundException{
        try{            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.conn = DriverManager.getConnection(this.getUrl(), this.getUsername()
                    ,  this.getPassword());
            System.out.println("conectado!");
        }catch(SQLException se){
            System.out.println("No se ha podido conectar con la base de datos,"
                    +se.getCause()+": "+this.getUrl()+"| "+this.getUsername()+"| "+ this.getPassword());                      
        }
    } 

    public void disconnect() throws SQLException {
        this.conn.close();
    }
    
}

