/*
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
*/
package ape_semana4_ejercicio6;
import java.util.Scanner;
public class pagoPrestamo_6 {
    public static void main(String[] args) {
        double montoPrestamo, interesMensual, pagoMensual;
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el monto del préstamo");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual");
        interesMensual = teclado.nextDouble();
        pagoMensual = (montoPrestamo/12) + interesMensual;
        System.out.println("El pago mensual del préstamo es:" + pagoMensual);       
                
    }
    
}
