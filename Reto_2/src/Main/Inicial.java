/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Inicial {
    private static Scanner inst_entrada_datos = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static int option;

    public static void employee_crud() {
        Personas pet = new Personas();
        ArrayList<Empleados> employee_list = new ArrayList<>();
        boolean exit_system = false;
        //while(exit_system == true)
        while (!exit_system) {
            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "                          INGRESA LA OPCIÓN"+ ANSI_RESET);
            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
            System.out.println(" 1. Crear empleado");
            System.out.println(" 2. Listar empleados existentes");
            System.out.println(" 3. Eliminar un empleado");
            System.out.println(" 4. Modificar información empleado");
            System.out.println(" 5. Salir del sistema");
           
             option = Integer.parseInt(inst_entrada_datos.nextLine());
            //Según el número que el usuario ingrese llamamos los métodos del ArrayList
            //ADD("valor") Añadir
            //SET(indice) Modificar
            //REMOVE(indice) Eliminar
            //GET() Consultar
            switch (option) {
                case 1:
                    //Instanciamos la clase Empleado, mediante el constructor vacío
                  
                    System.out.println(ANSI_RED +"Cantidad de empleados a añadir"+ ANSI_RESET);
                    int cant_employee = Integer.parseInt(inst_entrada_datos.nextLine());

                    for (int i = 1; i <= cant_employee; i++) {
                        System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                        System.out.println("                 INGRESA LA SIGUIENTE INFORMACIÓN DEL EMPLEADO " + i);
                        System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Nombre:"+ ANSI_RESET);
                        String nombre = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Apellido:"+ ANSI_RESET);
                        String apellido = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Documento:"+ ANSI_RESET);
                        int documento = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE +"Salario:"+ ANSI_RESET);
                        int salary = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE +"Email:"+ ANSI_RESET);
                        String email = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Categoría:"+ ANSI_RESET);
                        int category = Integer.parseInt(inst_entrada_datos.nextLine());
                        Empresa Emp = new Empresa("MINTIC", "999999999-1");
                       
                        Empleados inst_employee = new Empleados(documento, nombre, apellido, Emp);
                        employee_list.add(inst_employee);
                       

                    }
                    break;
                case 2:
                    System.out.println("Total empleados: " + employee_list.size());
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println("INFORMACIÓN EMPLEADO " + (i + 1));
                        Empleados employee_get = (Empleados) employee_list.get(i);
                        System.out.println("Nombre: " + employee_get.getNombre());
                        System.out.println("Apellido: " + employee_get.getApellido());
                        System.out.println("Documento: " + employee_get.getDocumento());
                        System.out.println("Empresa: " + employee_get.getEmp());
                        System.out.println("Salario: " + employee_get.getSalario());
                        
                        String nombre_cargo = "";
                switch (employee_get.getCategoria()) {
                    case 1:
                        Administrativos admin = new Administrativos(5);
                        nombre_cargo = "Administrador";
                        System.out.println("Categoria: " + nombre_cargo + "\nSubordinados a cargo: " + admin.getN_subordinados());
                        break;
                    case 2:
                        nombre_cargo = "Subordinado";
                        System.out.println("Categoria: " + nombre_cargo);
                        break;
                    default:
                        System.out.println("Cargo inválido");
                        break;
                }
                    }
                    break;
                case 3:
                    System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "            ELIMINAR PERSONAL" + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                    System.out.println("Indicanos el numero de documento de la persona a eliminar del sistema");
                    int index = Integer.parseInt(inst_entrada_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        Empleados Emp = employee_list.get(index);
                        System.out.println(ANSI_PURPLE + "Numero de Documento del empleado " + Emp.getDocumento() + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + Emp.getNombre());
                        System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + Emp.getApellido());
                        System.out.println(ANSI_BLUE + "Seguro desea eliminar a " + Emp.getNombre() + "? (Sí, No)" + ANSI_RESET);
                        String delete_usu = inst_entrada_datos.nextLine();
                        
                        if (delete_usu.toLowerCase().equals("si") || delete_usu.toLowerCase().equals("sí")) {
                            employee_list.remove(index);
                            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                            System.out.println(ANSI_BLUE + "            BASE DE DATOS Empresa MINTIC.ltda" + ANSI_RESET);
                            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                            for (int i = 0; i < employee_list.size(); i++) {
                                System.out.println("\n" + ANSI_BLUE + "            Empleado" + (i + 1) + ANSI_RESET);
                                Empleados lista_actual = employee_list.get(i);
                                System.out.println(ANSI_BLUE + "Cargo: " + ANSI_RESET + lista_actual.getCategoria());
                                System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + lista_actual.getNombre());
                                System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + lista_actual.getApellido());
                                System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + lista_actual.getDocumento());
                                System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + lista_actual.getCorreo());
                                System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + lista_actual.getSalario());
                                
                            }
                        } 
                       
                    }
                    break;
                  case 4:
                    System.out.println(ANSI_PURPLE + "            EDITAR EMPLEADO EN MINTIC" + ANSI_RESET);
                    System.out.println("Indicanos el indice de la mascota que deseas editar");
                    index = Integer.parseInt(inst_entrada_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        Empleados Emp = employee_list.get(index);
                        System.out.println(ANSI_RED + "Información actual de la mascota con código " + Emp.getCategoria() + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + Emp.getNombre());
                        System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + Emp.getApellido());
                        System.out.println(ANSI_BLUE + "Doacumento: " + ANSI_RESET + Emp.getDocumento());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + Emp.getCorreo());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + Emp.getSalario());
                        System.out.println("Qué datos desea editar?\n       1. Nombre\n       2. Apellido\n       3. Documento\n       4. Email\n       5. Salario ");
                        int option_e = Integer.parseInt(inst_entrada_datos.nextLine());
                        switch (option_e) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo: " + ANSI_RESET);
                                String nombre = inst_entrada_datos.nextLine();
                                Emp.setNombre(nombre);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Apellido nuevo: " + ANSI_RESET);
                                String Ape = inst_entrada_datos.nextLine();
                                Emp.setApellido(Ape);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Color nuevo: " + ANSI_RESET);
                               int Doc = Integer.parseInt (inst_entrada_datos.nextLine());
                                Emp.setDocumento(Doc);
                                break;
                            case 4:
                                System.out.println(ANSI_PURPLE + "Raza nueva: " + ANSI_RESET);
                                String Email =inst_entrada_datos.nextLine();
                                Emp.setCorreo(Email);
                                break;
                            case 5:
                                System.out.println(ANSI_PURPLE + "Estado de salud actual: " + ANSI_RESET);
                                int Salario = Integer.parseInt(inst_entrada_datos.nextLine());
                                Emp.setSalario(Salario);
                                break;
                            default:
                                System.out.println(ANSI_RED + "OPCIÓN INVÁLIDA" + ANSI_RESET);
                        }
                        
                    }
                    else {
                            System.out.println(ANSI_BLUE + "Cancelando proceso" + ANSI_RESET);
                        }
                    break;  
            }
        }
    }

    public static void client_crud() {
        ArrayList<Clientes> client_list = new ArrayList<>();
    }

    public static void company_crud() {
        ArrayList<Empresa> Emp_list = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee_crud();
    } 
}
