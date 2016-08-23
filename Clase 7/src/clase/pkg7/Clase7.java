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
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta magdalena =
                new Cuenta(1012,"Magdalena S",0,1234);
                magdalena.consignar(100000);
        Cuenta joselito =
                new Cuenta(1013,"Joselito P",500000,9876);
                joselito.cambiarClave(8524);
                joselito.Salario();
               
    }
    
}
