/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.EmpleadosModel;

/**
 *
 * @author Administrador
 */
public class EmpleadosController extends ActionSupport {

    private int idempleados;
    private String nombres;
    private String apellidos;
    private String dni;

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

    public String registrar() {
        return SUCCESS;
    }

    public String registrarEmpleado() {
        String nombres = getNombres();
        String apellidos = getApellidos();
        String dni = getDni();

        EmpleadosModel empleado = new EmpleadosModel();
        empleado.regirtrar(nombres, apellidos, dni);
        return SUCCESS;
    }

    public String actualizar() {
        return SUCCESS;
    }

    public String actualizarEmpleado() {
        String nombres = getNombres();
        String apellidos = getApellidos();
        String dni = getDni();
        int id = getIdempleados();

        EmpleadosModel empleado = new EmpleadosModel(id, nombres, apellidos, dni);
        empleado.actualizar(empleado);
        return SUCCESS;
    }

    public String listarempleado() {
        return SUCCESS;
    }
}
