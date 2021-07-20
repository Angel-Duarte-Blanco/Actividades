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
public class Empresa {
    private String name_e;
     private String NIT;

    public Empresa() {
    }
    public Empresa(String name_e, String NIT) {
        this.name_e = name_e;
        this.NIT = NIT;
    }

    public String getName_e() {
        return name_e;
    }

    public void setName_e(String name_e) {
        this.name_e = name_e;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
     
}
