/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author German
 */
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;
    
    public EmpleadoAsalariado(double salarioSemanal){
        this.salarioSemanal=salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public double getSueldoMensual(){
     double pago = (this.salarioSemanal/7)*30;
     return pago;
}
}
