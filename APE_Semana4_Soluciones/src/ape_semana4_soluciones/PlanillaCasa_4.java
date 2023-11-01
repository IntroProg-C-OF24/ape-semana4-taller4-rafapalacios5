/* 
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
*/
package ape_semana4_soluciones;
import java.util.Scanner;
public class PlanillaCasa_4 {
    public static void main(String[] args) {
     double costoMinuto, minutosMes, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo por minuto:");
        costoMinuto = teclado.nextDouble();
        System.out.println("Ingresa número de minutos consumidos en el mes:");
        minutosMes = teclado.nextDouble();
        valorPlanilla = costoMinuto * minutosMes;
        System.out.println("EL VALOR DE LA PLANILLA ES: " + valorPlanilla);
    }
}
