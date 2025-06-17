/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Buclefor;
import controller.Buclewhile;
import java.util.Scanner;

/**
 *
 * @author James Pinto
 */
public class Ejecutor {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione una opcion enumerada del 1 al 8");
        System.out.println("Ejercicios resuletos usando el bucle 'for'");
        System.out.println("1. Ejercicio 2: Sucesion Fibonacci");
        System.out.println("2. Ejercicio 4: Tabla de multiplicar");
        System.out.println("3. Ejercicio 14: Raiz cuadrada entera");
        System.out.println("4. Ejercicio 20: Cifrado Cesar");
        System.out.println("Ejercicios resueltos usando el bucle 'while'");
        System.out.println("5. Ejercicio 2: Verificar un numero palindromo");
        System.out.println("6. Ejercicio 9: Convertir un decimal a binario");
        System.out.println("7. Ejercicio 12: Validar una contraseña en tres intentos");
        System.out.println("8. Ejercicio 16: Revertir un numero");
        int option = sc.nextInt();
        Buclefor r = new Buclefor();
        Buclewhile a = new Buclewhile();

        do {
            switch (option) {
                case 1:
                    //Sucesion De Fibonacci
                    System.out.println("Hasta que valor de la sucesion desea saber");
                    int valor = sc.nextInt();
                    r.seriefibo(valor);
                    break;
                case 2:
                    //tabla de multiplicar
                    System.out.println("Ingrese un numero entero");
                    int num = sc.nextInt();
                    r.tablamult(num);
                    break;
                case 3:
                    //Raiz
                    System.out.println("Ingrese un numero");
                    int number = sc.nextInt();
                    int raiz = r.raizcuadrada(number);
                    System.out.println("El numero " + number + " es la raiz cuadrada de " + raiz + "");
                    break;
                case 4:
                    //Cifrado Cesar
                    System.out.println("Escriba la frase que desea codificar");
                    String cesar = sc.next();
                    r.cesar(cesar);
                    break;
                case 5:
                    //Palindromos
                    System.out.println("Ingrese el numero que desea verificar");
                    int pal = sc.nextInt();
                    a.palindromo(pal);
                    break;
                case 6:
                    //Binario
                    System.out.println("Digite el numero decimal que desea covertir");
                    int decimal = sc.nextInt();
                    a.binario(decimal);
                    break;
                case 7:
                    //Validar
                    System.out.println("Ingrese la contraseña, tiene 3 intentos");
                    int pass = sc.nextInt();
                    int cont1 = 3;
                    while (!a.validarClave(pass)) {
                        cont1--;
                        if (a.validarClave(pass)) {
                        } else if (cont1 > 0) {
                            System.out.println("Contraseña incorrecta, le quedan " + cont1+ " intentos");
                            System.out.println("Ingrese la contraseña");
                            pass = sc.nextInt();
                            
                        }else if(cont1 == -1){
                            System.out.println("Ya no le quedan mas intentos, vuelva a probar mas tarde");
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 8:
                    //revertir
                    System.out.println("¿Que numero desea revertir?");
                    int val = sc.nextInt();
                    a.revertido(val);
                    break;
                default:
                    break;
            }
            System.out.println("Si quiere salir presione 0 caso contrario precione cualquier numero");
            option = sc.nextInt();
        } while (option != 0);
    }
}
