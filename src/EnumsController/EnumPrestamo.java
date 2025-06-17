/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnumsController;

/**
 *
 * @author James Pinto
 */
public enum EnumPrestamo {
    PERSONAL(5.5f), HIPOTECARIO(4.5f), COFIDIS(4.0f);
    private Float intereses;
    private EnumPrestamo (Float intereses){
        this.intereses = intereses;
    }

    public Float getIntereses() {
        return intereses;
    }
}
