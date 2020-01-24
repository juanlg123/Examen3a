package model;
public class FamiliaresModel {
    private int idfamiliares;
    private String nombres;
    private String apellidos;
    private String estado;
    int idempleados;

    public FamiliaresModel(int idfamiliares, String nombres, String apellidos, String estado, int idempleados) {
        this.idfamiliares = idfamiliares;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado = estado;
        this.idempleados = idempleados;
    }

    public int getIdfamiliares() {
        return idfamiliares;
    }

    public void setIdfamiliares(int idfamiliares) {
        this.idfamiliares = idfamiliares;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(int idempleados) {
        this.idempleados = idempleados;
    }
    
    
    
    
    
}
