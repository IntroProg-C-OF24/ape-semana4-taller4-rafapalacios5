/*
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario; 
solo en el caso que el valor del número esté entre 2 y 6.
 */
package ape_semana4_ejercicio3;
import java.util.Scanner;
public class TablaMultiplicar_3 {

    public static void main(String[] args) {
        int numero, tablaMultiplicar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero");
        numero = teclado.nextInt();
        if (numero >= 2 && numero <= 6) {
            tablaMultiplicar = numero * 1;
            System.out.println(numero + "x1=" + tablaMultiplicar);
            tablaMultiplicar = numero * 2;
            System.out.println(numero + "x2=" + tablaMultiplicar);
            tablaMultiplicar = numero * 3;
            System.out.println(numero + "x3=" + tablaMultiplicar);
            tablaMultiplicar = numero * 4;
            System.out.println(numero + "x4=" + tablaMultiplicar);
            tablaMultiplicar = numero * 5;
            System.out.println(numero + "x5=" + tablaMultiplicar);
            tablaMultiplicar = numero * 6;
            System.out.println(numero + "x6=" + tablaMultiplicar);
            tablaMultiplicar = numero * 7;
            System.out.println(numero + "x7=" + tablaMultiplicar);
            tablaMultiplicar = numero * 8;
            System.out.println(numero + "x8=" + tablaMultiplicar);
            tablaMultiplicar = numero * 9;
            System.out.println(numero + "x9=" + tablaMultiplicar);
            tablaMultiplicar = numero * 10;
            System.out.println(numero + "x10=" + tablaMultiplicar);
            tablaMultiplicar = numero * 11;
            System.out.println(numero + "x11=" + tablaMultiplicar);
            tablaMultiplicar = numero * 12;
            System.out.println(numero + "x12=" + tablaMultiplicar);
        } else {
            System.out.println("El número ingresado no está entre 2 y 6");
        }
    }

}
