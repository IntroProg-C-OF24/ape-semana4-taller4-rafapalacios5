/*
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.
*/
package ape_semana4_ejercicio9;
import java.util.Scanner;
public class areaPolígono_9 {
    public static void main(String[] args) {
      double ladoCuadrado, alturaRectangulo, areaPoligono;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        ladoCuadrado = teclado.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        alturaRectangulo = teclado.nextDouble();
        areaPoligono = (Math.pow(ladoCuadrado, 2)) + (ladoCuadrado*alturaRectangulo) + ((ladoCuadrado*alturaRectangulo)/2)*3;
        System.out.println("El área total del Polígono es:" + areaPoligono);
    }
    
}
