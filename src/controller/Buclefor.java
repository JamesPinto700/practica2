/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 * 4 ejercicios del bucle for
 * @author James Pinto
 */
public class Buclefor {
    
    //Raiz cuadrada (bucle for)
    public int raizcuadrada(int number) {
        int raiz = 1;
        for (int i = 1; i <= number; i++) {
            raiz = number * i;
        }
        return raiz;
    }
    //Tabla del 12 (bucle for)
    public void tablamult(int num) {
        int multi = 0;
        for (int i = 2; i <= 12; i++) {
            multi = i * num;
            System.out.println(""+num+" x "+i+" = "+multi+"");
        }
    }
    //Sucesion de Fibonacci
    public int fibonacci(int num) {
        int A = 0;
        int B = 1;
        int fibo = 0;
        for (int i = 0; i < num; i++) {
            fibo = A + B;
            A = B;
            B = fibo;
        }
        return fibo;
    }
    
    //Cifrado Cesar
    public void cesar(String frase){
        for (int i = 0; i < frase.length(); i++) {
            char cifrado = frase.charAt(i);
            int a = ((int)cifrado)+3;
            System.out.println((char)a);
        }
    }
    
    public void seriefibo(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println(fibonacci(i));
        }
    }
}

