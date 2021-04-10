
package poo;

import javax.swing.JOptionPane;
public class Operacion {
    
    int numero1;
    int numero2;
    int suma;
    
    public void leerNumero(){
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
    }
    
    public void sumar(){
        
        suma = numero1 + numero2;
    }
    
    public void resultado(){
        
        System.out.println("El resulatdo de la suma es " + suma);
    }
    
    
       
    
}
