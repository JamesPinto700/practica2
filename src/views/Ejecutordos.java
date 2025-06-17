/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Bucledowhile;
import controller.Switch;
import java.util.Scanner;

/**
 *
 * @author James Pinto
 */
public class Ejecutordos {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione una opcion enumerada del 1 al 8:");
        System.out.println("Ejercicios resueltos usando el bucle 'do while'");
        System.out.println("1. Ejercicio 6: Adivinar la contraseña con una condicion");
        System.out.println("2. Ejercicio 8: Intentos de login");
        System.out.println("3. Ejercicio 10: Tabla de potencia 2");
        System.out.println("4. Ejercicio 20: Contar vocales de una palabra");
        System.out.println("Ejercicios resuektos con el bucle 'switch'");
        System.out.println("5. Ejercicio 5: Conversor de monedas");
        System.out.println("6. Ejercicio 6: Estaciones del año");
        System.out.println("7. Ejercicio 11: Seleccion de productos, minitienda");
        System.out.println("8. Ejercicio 17: Precio de boletos segun la edad");
        int opcion = sc.nextInt();
        Bucledowhile A = new Bucledowhile();
        Switch B = new Switch();
        do {
            switch (opcion) {
                case 1:
                    String password = "";
                    int i = 0;
                    do {
                        System.out.println("Adivine la contraseña: ");
                        password = sc.nextLine();
                        i++;
                    } while (!A.contrasenias(password, i));
                    break;
                case 2:
                    //login
                    String key = "";
                    int cont = 4;
                    do {
                        System.out.println("Ingrese la contraseña");
                        key = sc.nextLine();
                        cont--;
                        if (cont == 0) {
                            System.out.println("Limite de intentos alcanzado, cuenta bloqueada por dos dias");
                            break;
                        }
                    } while (!A.login(key, cont));
                    break;
                case 3:
                    //potencias
                    int poten = 2;
                    int num = 0;
                    do {
                        System.out.println("Ingrese un numero entero: ");
                        num = sc.nextInt();
                        A.potencia(num, poten);
                        if (num >= 10) {
                            System.out.println("El resultado del numero que ingreso supera a 1000");
                            break;
                        }
                    } while (num >= 1);
                    break;
                case 4:
                    //Vocales
                    int contador = 0;
                    System.out.println("Escriba una palabra: ");
                    String palabra = sc.next();
                    A.vocales(palabra);
                    break;
                case 5:
                    //cambio de monedas
                    System.out.println("¿Cuantos dolares americanos desea transformar a:\n1 Sucres\n2 Soles peruanos\n3 Pesos chilenos\n4 Bolivares venezolanos\n5 Real brasileño");
                    int opciones = sc.nextInt();
                    double dolar = sc.nextDouble();
                    B.conversor(opciones, dolar);
                    break;
                case 6:
                    System.out.println("De cual mes desea saber su estacion: ");
                    int mes = sc.nextInt();
                    String estacion = B.estacion(mes);
                    System.out.println("la estacion del año en el mes " + mes + " es " + estacion);
                    break;
                case 7:
                    System.out.println("Bienvenido, que seccion de la tienda desea consultar:\nSeccion 1\nSeccion 2\nSeccion 3\nSeccion 4");
                    int select = sc.nextInt();
                    String seccion = B.ministore(select);
                    String productos = B.comestibles(select);
                    System.out.println("Esta es la seccion de " + seccion + " y estos son los productos disponibles:\n" + productos + "");
                    break;
                case 8:
                    System.out.println("¿Boletos para que edad desea?\nprimera opcion para niños\nsegunda opcion para adultos\ntercera opcion para adultos mayores");
                    int option = sc.nextInt();
                    System.out.println("¿Cuantos boletos desea comprar?");
                    int a = sc.nextInt();
                    Float precio = B.pasajes(option, a);
                    break;
                default:
                    break;
            }
            System.out.println("Si desea salir presione 0, de lo contrario eliga otra opcion disponible ");
        } while (opcion != 0);
    }
}
