/*
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ape_semana4_ejercicio5;
import java.util.Scanner;
public class costoComputadora_5 {

    public static void main(String[] args) {
        double CPU, Teclado, Pantalla, Raton, costoComputadora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo del CPU:");
        CPU = teclado.nextDouble();
        System.out.println("Ingresa el costo del Teclado:");
        Teclado = teclado.nextDouble();
        System.out.println("Ingresa el costo de la Pantalla:");
        Pantalla = teclado.nextDouble();
        System.out.println("Ingresa el costo del Raton:");
        Raton = teclado.nextDouble();
        costoComputadora = CPU + Teclado + Pantalla + Raton;
        System.out.println("El costo total de la Computadora de escritorio es: " + costoComputadora);
    }

}
