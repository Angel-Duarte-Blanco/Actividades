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
public class Empleados extends Personas {
    private int salario;
    private int categoria;
    private String Correo;
    private Empresa Emp;

    public Empleados() {
    }

    public Empleados(int documento, String nombre, String apellido, Empresa Emp) {
        super(documento, nombre, apellido);
        this.Emp = Emp;
        
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Empresa getEmp() {
        return Emp;
    }

    public void setEmp(Empresa Emp) {
        this.Emp = Emp;
    }
}

