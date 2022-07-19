/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


/**
 *
 * @author user
 */
public class Empleado extends Persona{
    double sueldoBruto;

    public Empleado() {
    } 

    public Empleado(double sueldoBruto, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion,String sueldomes) {
        super(nombre1, nombre2, apellido1, apellido2, correo, telefono, correo, direccion, direccion,sueldomes);
        this.sueldoBruto = sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }
    
    @Override
    public String toString() {
        return "sueldobruto: "
                + "el sueldo del empleado es: \n" +getSueldobruto();
    }

  

  

   
    }

