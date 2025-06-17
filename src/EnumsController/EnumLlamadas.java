/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnumsController;

/**
 *
 * @author USUARIO
 */
public enum EnumLlamadas {
    AMERICA_NORTE("America del norte", 12, 2.75f),
    AMERICA_CENTRAL("America central", 15, 1.89f),
    AMERICA_SUR("America del sur", 18, 1.60f),
    EUROPA("Europa", 19, 3.50f),
    ASIA("Asia", 23, 4.50f),
    AFRICA("Africa", 25, 3.10f),
    OCEANIA("Oceania", 29, 3.00f),
    RESTO_MUNDO("Resto del mundo", 31, 6.00f);
    
    private String zona;
    private Integer clave;
    private Float costo;
    
    private EnumLlamadas(String zona, Integer clave, Float costo){
        this.zona = zona;
        this.clave = clave;
        this.costo = costo;
    }

    public String getZona() {
        return zona;
    }

    public Integer getClave() {
        return clave;
    }

    public Float getCosto() {
        return costo;
    }
}
