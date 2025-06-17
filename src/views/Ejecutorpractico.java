/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Ejercicios;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutorpractico {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicios E = new Ejercicios();
        System.out.println("seleccione una opcion del 1 al 5:");
        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    int key = 0;
                    int pass = 0;
                    String user = "";
                    System.out.println("Cual es su nivel de acceso?: ");
                    key = sc.nextInt();
                    if (key > 0) {
                        System.out.println("Ingrese su nombre de usuario por favor: ");
                        user = sc.next();
                        if (!(user.equals(""))) {
                            System.out.println("Digite la contraseña porfavor:");
                            pass = sc.nextInt();
                        }
                    }
                    E.validar_usuario(key, user, pass);
                    break;
                case 2:
                    System.out.println("¿Cual es la clave de la zona?");
                    int code = sc.nextInt();
                    System.out.println("¿Cuantos minutos duro la llamada?");
                    int minutes = sc.nextInt();
                    Float costo = E.CostoDeLlamada(minutes, code);
                    if (costo > 0) {
                        System.out.println("El costo total de la llamada que realizo es de: " + costo + " dolares");
                    } else {
                        System.out.println("La clave de zona no existe");
                    }
                    break;
                case 3:
                    System.out.println("Ingresar el valor de consumo del agua: ");
                    float planilla = sc.nextFloat();
                    Float rubro = E.Planilla_Agua(planilla);
                case 4:
                    System.out.println("Eliga una opcion:\n1 Cuotas mensuales\n2 Amortizacion anual");
                    int opt = sc.nextInt();
                default:
            }
            System.out.println("Si quiere salir presione 0 caso contrario precione cualquier otro numero");
            option = sc.nextInt();
        } while (option != 0);
    }
}
