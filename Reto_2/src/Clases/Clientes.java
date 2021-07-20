/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pc
 */
public class Clientes extends Personas {
   
    private String Direccion;
    private String Tel;
    private Empresa Emp;

    public Clientes() {
    }

    public Clientes(int documento, String nombre, String apellido) {
        super(documento, nombre, apellido);
        
    }
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public Empresa getEmp() {
        return Emp;
    }

    public void setEmp(Empresa Emp) {
        this.Emp = Emp;
    }
    
   
}
