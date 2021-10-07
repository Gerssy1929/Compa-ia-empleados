/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.*;

/**
 *
 * @author German
 */
public class Test {
    public static void main(String[] args) {
        Empleado EA= new EmpleadoAsalariado (70000);
        System.out.println(EA.getSueldoMensual());
    }
}
