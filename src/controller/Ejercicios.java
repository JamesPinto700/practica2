/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import EnumsController.EnumEdificio;
import EnumsController.EnumLlamadas;
import EnumsController.EnumPrestamo;

/**
 * 5 ejercicios propuestos (practica 2)
 *
 * @author James Pinto
 */
public class Ejercicios {
    
    /*
    1. Control de acceso a un edificio inteligente
    Una empresa de oficinas dispone de torniquetes con lectores de tarjeta.
    Cada empleado tiene un nivel de acceso: VISITANTE, EMPLEADO, ADMINISTRADOR.
    Crea un enum NivelAcceso y un programa que, leyendo un flujo de eventos de tarjetas, que permita o deniegue el paso.
    El usuario debe proporcionar su usuario y clave solo se permiten tres intentos
    */
    //Datos de entrada: usuario y clave
    //Datos de salida: validacion o bloqueo
    public void validar_usuario(int acceso, String usuario, int contrasena) {
        EnumEdificio data = null;
        for (EnumEdificio auxiliar : EnumEdificio.values()) {
            if (acceso == auxiliar.getNivel()) {
                data = auxiliar;
                break;
            }
        }
        if (data != null) {
            if (acceso == data.getNivel()) {
                if (usuario.equals(data.getUsuario())) {
                    if (contrasena == data.getClave()) {
                        System.out.println("Bienvenido señor: " + data.getUsuario());
                    } else {
                        System.out.println("contraseña incorrecta");
                    }
                } else {
                    System.out.println("usuario Incorrecto");
                }
            }
        }
    }
    
    /*
    2. Simulación de préstamo bancario
    Un banco concede préstamos de TIPO_PERSONAL, HIPOTECARIO o COFIDIS.
    Cada tipo tiene su propia tasa de interés.
    Calcula la cuota mensual con la fórmula correspondiente y muestra amortización anual.
    */
    //Datos de entrada: valor del prestamo, tiempo interes
    //datos de salida: amortizacion anual, cuota
    public static Integer CUOTA_MENSUAL = 1;
    public static Integer AMORTIZACION_ANUAL = 2;
    public Float CuotasMensuales (Float prestamo, Float interes, Float years){
        Float respuesta = 0.0f;
        Float interesmensual = interes / 12;
        Float descuentos = (float)Math.pow(1 + interes, -years * 2);
        respuesta = (prestamo * interesmensual) / (1 - descuentos);
        return respuesta;
    }
    public Float Amortizacion (Float prestamo, Float interes, Float years){
        Float respuesta = 0.0f;
        Float cuotas = CuotasMensuales(prestamo, interes, years);
        Float amortizacion = cuotas * 12;
        return respuesta;
    }
    public Float CuotaAmortizacion (Float prestamo, EnumPrestamo enum_interes , Float years, Integer opcion){
        Float respuesta = 0f;
        
        switch (opcion) {
            case 1:
                return CuotasMensuales(prestamo, enum_interes.getIntereses(), years);
            case 2:
                return Amortizacion(prestamo, enum_interes.getIntereses(), years);
                
            default:
                break;
        }
        return respuesta;
    }
    
    /*10. Llamadas telefónicas
    El costo de las llamadas telefónicas internacionales depende de la zona geográfica
    en la que se encuentre el país destino y del número de minutos hablados.
    En la siguiente tabla se presenta el costo del minuto por hora.
    Cada zona se le ha asociado con una clave (Use tipos de datos ENUMERADOS PARA LA ZONA)
    */
    //Datos de entrada: minutos, clave del pais
    //Datos de salida: precio a pagar
    public Float CostoDeLlamada(Integer minutos, Integer clave) {
        EnumLlamadas data = null;
        Float precio = 0f;
        for (EnumLlamadas aux : EnumLlamadas.values()) {
            if (clave == aux.getClave()) {
                data = aux;
                break;
            }
        }
        if (data != null) {
            precio = data.getCosto() * minutos;
        }
        return precio;
    }

    /*
    La empresa municipal de agua potable de Loja desea cobrar y calcular mensualmente el valor exacto
    de consumo del agua potable de cada medidor que pertenece a un contribuyente, de acuerdo a la ordenanza vigente,
    la cual establece la planilla de acuerdo a los siguientes rubros:
    A) SERVICIO DE AGUA POTABLE
    B) IMPUESTO DE ALCANTARILLADO: 35% DEL VALOR DEL RUBRO DEL SERVICIO DE AGUA POTABLE.
    C) TASA POR RECOLECCIÓN DE BASURA: 0.75 DÓLARES
    D) TASA POR COSTO DE PROCESAMIENTO DE DATOS: 0.50 DÓLARES
     */
    public Float Planilla_Agua(Float consumo) {
        float valortotal = 0.0f;
        float rubro = 0.0f;
        if (consumo >= 0 && consumo <= 15) {
            valortotal = 3.0f;
        } else if (consumo > 15 && consumo <= 25) {
            valortotal = (consumo * 0.1f) + 3.0f;
        } else if (consumo > 25 && consumo <= 40) {
            valortotal = (consumo * 0.2f) + (25 * 0.1f);
        } else if (consumo > 40 && consumo <= 60) {
            valortotal = (consumo * 0.3f) + (40 * 0.2f);
        } else if (consumo > 60) {
            valortotal = (consumo * 0.35f) + (40 * 0.3f);
        }
        float interes = valortotal * 0.35f;
        rubro = (interes + valortotal) + (0.75f + 0.5f);
        System.out.println("Planilla de agua: \nImpuesto de alcantarillado: %35\nTasa por recoleccion de basura: 0.75 dolares"
                + "\nTasa por costo de procesamiento de datos: 0.50 dolares\nValor total a pagar: " + rubro + "dolares");
        return rubro;
    }
}
