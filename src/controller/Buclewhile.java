/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 * 4 ejercicios del bucle while
 * @author James Pinto
 */
public class Buclewhile {
    
    //Palindromo (bucle while)
    public String palindromo (int num){
        int i = 0;
        String pal = "";
        String number = String.valueOf(num);
        i = number.length();
        while (i != 0) {
            pal = pal + number.charAt(i - 1);
            i--;
        }
        if (number.equals(pal) ) {
            System.out.println("El numero "+number+" es palindromo");
        } else {
            System.out.println("En numero "+number+" no es palindromo");
        }
        return number;
    }
    
    //Decimal a Binario (bucle while)
    public String binario(int num) {
        int i = 0;
        String binario = "";
        while (num != 0) {
            int digito = num % 2;
            num = num / 2;
            String digit = String.valueOf(digito);
            i = digit.length();
            binario = binario + digit.charAt(i - 1);
            i--;
        }
        System.out.println("El numero binario de decimal ingresado es: "+binario+"");
        return binario;
    }
    
    //validar
    public boolean validarClave(int pass) {
        int password = 246810;
        if (pass == password) {
            System.out.println("Acertaste la contraseña");
        }
        return pass == password;
    }
    public int validar (int pass, int cont){
        
        if(validarClave(pass)) {
            
            return -1;
        }
        return cont--;
    }
    
    //revertir
    public void revertido (int number){
        int i = 0;
        String invert = "";
        String num = String.valueOf(number);
        i = num.length();
        while (i != 0) {
            invert = invert + num.charAt(i - 1);
            i--;
        }
        System.out.println("El numero revertido de "+num+" es: "+invert);
    }
}
