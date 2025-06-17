/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EnumsController;

/**
 *
 * @author James Pinto
 */
public enum EnumEdificio {
    VISITANTE("Carlos", 1, 44175),
    EMPLEADO("Eduardo", 2,11382),
    ADMINISTRADOR("James", 3, 22914);
    
    private String usuario;
    private Integer nivel;
    private Integer clave;

    private EnumEdificio (String usuario, Integer nivel, Integer clave) {
        this.usuario = usuario;
        this.nivel = nivel;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getClave() {
        return clave;
    }
}
