/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 * 4 ejercicios del bucle do while
 *
 * @author James Pinto
 */
public class Bucledowhile {

    public boolean contrasenias(String contra, int cont) {
        /*int clave = 72499;
        if (contra == clave) {
            System.out.println("Adivinaste la contraseña en "+cont+" intentos");
        }
        return contra == clave;*/
        if (contra.contains("cion1")) {
            System.out.println("Adivinaste la contraseña en " + cont + " intentos");
        }
        return contra.contains("cion1");
    }

    public boolean login(String pass, int i) {
        String contrasenia = "Computacion1";
        if (pass.equals(contrasenia)) {
            System.out.println("Acertaste la contraseña");
        } else if (i < 4) {
            System.out.println("Le queda " + i + " intentos");
        }
        return pass.equals(contrasenia);
    }

    public int potencia(int expo, int base) {
        if (expo > 1) {
            int result = (int) Math.pow(base, expo);
            System.out.println("2^ " + expo + " = " + result + "");
        }
        return expo;
    }

    public void vocales(String word) {
        int cont = 0;
        int i = 1;
        char f = ' ';
        do {
            String frase = word.toLowerCase();
            i++;
            f = frase.charAt(i);
        } while (i < word.length());
        if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
            cont++;
        }
        System.out.println("La palabra " + word + " tiene " + cont + " vocales");
    }
}
