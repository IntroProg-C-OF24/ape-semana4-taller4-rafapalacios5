/*
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_ejercicio7;
import java.util.Scanner;
public class planillaLuz_7 {

    public static void main(String[] args) {
        double costoKilovatio, kilovatiosConsumidos, descuento, totalPlanilla;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de costo por Kilovatio/hora");
        costoKilovatio = teclado.nextDouble();
        System.out.println("Ingrese el número de Kilovatios consumidos en el mes");
        kilovatiosConsumidos = teclado.nextDouble();
        System.out.println("Ingrese su Edad");
        edad = teclado.nextInt();
        totalPlanilla = costoKilovatio * kilovatiosConsumidos;
        if (edad > 65) {
            descuento = totalPlanilla * 10/ 100;
            totalPlanilla = totalPlanilla - descuento;
            System.out.println("El valor a pagar de la Planilla con descuento es:" + totalPlanilla);
        } 
        else {
        System.out.println("El valor total a pagar de la Planilla es:" + totalPlanilla);
        }
    
    }

}
