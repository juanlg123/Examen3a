package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadosModel extends Database{
    private int idempleados;
    private String nombres;
    private String apellidos;
    private String dni;

    public EmpleadosModel(int idempleados, String nombres, String apellidos, String dni) {
        this.idempleados = idempleados;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public EmpleadosModel() {
        
    }

    public int getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(int idempleados) {
        this.idempleados = idempleados;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    public void regirtrar(String nombres, String apellidos, String dni) {   
        try {
            this.connect();
            if (this.getConn() != null) {
                String sql = "insert into empleados (nombres, apellidos,dni) "
                        +"values(?,?,?)";
                System.out.println(sql);
                PreparedStatement preparedStmt = this.getConn()
                        .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                //para los campos
                preparedStmt.setString(1, nombres);
                preparedStmt.setString(2, apellidos);
                preparedStmt.setString(3, dni);
                int affects = preparedStmt.executeUpdate();
                this.disconnect();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Ha ocurrido un error 1: "+ex.getCause());
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error 2: "+ex.getCause());
        }
    }
    
    public void actualizar(EmpleadosModel empleados) {
        try {
            this.connect();
            if (this.getConn() != null) {
                String sql = "update empleados set "
                        + "nombres =?, apellidos =?, dni =? where idempleados = ?";
                PreparedStatement preparedStmt = this.getConn()
                        .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                preparedStmt.setString(1, empleados.getNombres());
                preparedStmt.setString(2, empleados.getApellidos());
                preparedStmt.setString(3, empleados.getDni());
                preparedStmt.setInt(4, empleados.getIdempleados());
                
                int affects = preparedStmt.executeUpdate();
                this.disconnect();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadosModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
}
