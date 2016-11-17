package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class Juego {
    private Object JOptioPane;
    
    public void inNum(){
    int num;
    int num2;
    int intentos;
        
    do{    
    num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 0 y 50"));
    intentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos"));
    if(num<0 || num>50)
        System.err.println("Número no válido vuelve a introducir un número");
    }while(num<0 || num>50);
     
     num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
      
     for(int i = 1;i<intentos;i++){
           if(num==num2){
               System.out.println("Enhorabuena has ganado");
           break;}
           else if(num<num2){
               System.out.println("El número introducido es mayor");
           num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
           } 
           else if(num>num2)
               System.out.println("El número introducido es menor");
               num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
           }
    }
    
}
