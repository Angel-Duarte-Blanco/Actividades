/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;



/**
 *
 * @author Miguel Duarte G44
 */
public class info_persona {

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    private String nombre;
    private int nro_documento;
    private String fecha_nacimiento;
    private String ciudad;
    private int telefono;
    private int edad;

    public info_persona(String nombre, int nro_documento, String fecha_nacimiento, String ciudad, int telefono, int edad) {
        this.nombre = nombre;
        this.nro_documento = nro_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int n_documento() {
        return nro_documento;
    }
    public String Consultar_informacion_persona(){
      
        String doc;
        if (n_documento() == 2022) {
            doc = "Esta persona esta registrada";
        } else {
            doc = "Esta persona esta no registrada";
        } 
        return "Informacion de la persona\n    >>Nombre:" + getNombre() + "\n    >>Numero de documento:" + getNro_documento() + "\n    >>Fecha de nacimiento:" + getFecha_nacimiento()
               + "\n    >>Ciudad:" + getCiudad() + "\n    >>Numero de telefono:" + getTelefono() + "\n    >>Edad:" + getEdad() ;
    }
    
}
