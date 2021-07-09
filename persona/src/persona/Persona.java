/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Date fecha_actual = new Date();
        SimpleDateFormat nuevo_formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        info_persona ints_persona = new  info_persona("MISION TIC", 2022, nuevo_formato_fecha.format(fecha_actual), "Bogota D.C.", 325215, 15);
        System.out.println("**********Datos personales**********\n" + ints_persona.Consultar_informacion_persona());
        
    }
    
}
