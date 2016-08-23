/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private String propietario;
    private double salario;
    private int clave;
    
    
    public Cuenta(int numero, String propietario, double salario, int clave) {
        this.numero = numero;
        this.propietario = propietario;
        this.salario = salario;
        this.clave = clave;
        
        
    }
public void consignar(double valor){
        this.salario+=valor;
}

public void retirar(double valor){
    this.salario-=valor;
    
}

public void cambiarClave(int nuevaClave){
    this.clave = nuevaClave;
    System.out.println(propietario + " Su nueva clave es:" + nuevaClave);
    
}
public void Salario(){
    System.out.println(propietario + " Su saldo es:" + salario);
}

}
