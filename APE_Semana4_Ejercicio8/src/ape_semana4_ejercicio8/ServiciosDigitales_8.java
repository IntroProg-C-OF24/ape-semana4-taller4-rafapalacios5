/*
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape_semana4_ejercicio8;
import java.util.Scanner;
public class ServiciosDigitales_8 {

    public static void main(String[] args) {
        double Netflix, youtubePremium, Dropbox, Spotify, descuento, gastoTotal;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los gastos de Netflix:");
        Netflix = teclado.nextDouble();
        System.out.println("Ingresa los gastos de youtube premium:");
        youtubePremium = teclado.nextDouble();
        System.out.println("Ingresa los gastos de Dropbox:");
        Dropbox = teclado.nextDouble();
        System.out.println("Ingresa los gastos de Spotify:");
        Spotify = teclado.nextDouble();
        System.out.println("Ingrese su Edad");
        edad = teclado.nextInt();
        gastoTotal = Netflix + youtubePremium + Dropbox + Spotify;
        if (edad < 30) {
            descuento = gastoTotal * 20 / 100;
            gastoTotal = gastoTotal - descuento;
            System.out.println("El valor total a pagar con descuento es:" + gastoTotal);
        } 
        else {
            System.out.println("El valor total a pagar :" + gastoTotal);
        }
    }

}
