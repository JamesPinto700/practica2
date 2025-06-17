/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 * 4 ejercicios con switch
 * @author James Pinto
 */
public class Switch {

    public double conversor(int option, double moneda) {
        double valor = 0.0f;
        int i = 0;
        switch (option) {
            case 1:
                valor = moneda * 25000.00f;
                System.out.println("" + moneda + " dolares equivale a " + valor + " sucres");
            case 2:
                valor = moneda * 3.63f;
                System.out.println("" + moneda + " dolares equivale a " + valor + " soles");
                break;
            case 3:
                valor = moneda * 4202.75f;
                System.out.println("" + moneda + " dolares equivale a " + valor + " pesos");
                break;
            case 4:
                valor = moneda * 99.57f;
                System.out.println("" + moneda + " dolares equivale a " + valor + " bolivares");
                break;
            case 5:
                valor = moneda * 5.58f;
                System.out.println("" + moneda + " dolares equivale a " + valor + " reales");
                break;
            default:
                break;
        }
        return valor;
    }

    public String estacion(int meses) {
        String seasons = "";
        switch (meses) {
            case 1:
                seasons = "Invierno";
                break;
            case 2:
                seasons = "Invierno";
                break;
            case 3:
                seasons = "Primavera";
                break;
            case 4:
                seasons = "Primavera";
                break;
            case 5:
                seasons = "Primavera";
                break;
            case 6:
                seasons = "Verano";
                break;
            case 7:
                seasons = "Verano";
                break;
            case 8:
                seasons = "Verano";
                break;
            case 9:
                seasons = "Otoño";
                break;
            case 10:
                seasons = "Otoño";
                break;
            case 11:
                seasons = "Otoño";
                break;
            case 12:
                seasons = "Invierno";
                break;
            default:
                break;
        }
        return seasons;
    }
    
    public String ministore (int selection ){
        String section = "";
        switch (selection) {
            case 1:
                section = "Vegetales";
                break;
            case 2:
                section = "Frutas";
                break;
            case 3:
                section = "Carnes";
                break;
            case 4:
                section = "Lacteos";
                break;
            default:
                break;
        }
        return section;
    }
    
    public String comestibles (int select) {
        String comestibles = "";
        switch (select) {
            case 1:
                comestibles = "Col a 1.50$\nTomates a 0.60$\nLechuga a 1.00$\nPapas a 1.00 1 Lbs\nZanahoria a 0.80$";
                break;
            case 2:
                comestibles = "Manzana a 0.25$\nUvas a 1.00$ 1 Lbs\nGuineo 2.10 el racimo\nMandarina a 0.30$\nFrutilla a 1.50$ 1 Lbs";
                break;
            case 3:
                comestibles = "Carne de chancho a 2.75 1 Lbs\nCarne de res a 3.00$ 1 Lbs\nPollo a 1.90$ 1 Lbs";
                break;
            case 4:
                comestibles = "Leche a 2.00$ Lt\nQueso a 2.50$\nQuesillo a 1.70$ 1 Lbs\nYogurt a 3.00 LT";
                break;
            default:
                break;
        }
        return comestibles;
    }
    
    public Float pasajes (int edad, int num){
        float precio = 0.0f;
        switch (edad) {
            case 1:
                precio = (float)num * 0.50f;
                System.out.println("Los niños pagan "+precio+"$ por boleto");
                break;
            case 2:
                precio = (float)num * 1.00f;
                System.out.println("Los adultos pagan "+precio+"$ por boleto");
                break;
            case 3:
                precio = (float)num * 0.75f;
                System.out.println("Los adultos mayores pagan "+precio+"$ por boleto");
                break;
            default:
                break;
        }
        return precio;
    }
}
