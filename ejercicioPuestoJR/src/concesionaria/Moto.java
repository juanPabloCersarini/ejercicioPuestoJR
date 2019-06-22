
package concesionaria;

/**
 *
 * @author Juan Pablo toString
 */
public class Moto extends Vehiculo{
    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    public String toString() {
        return super.toString() + " // Cilindradas: "+ cilindradas; //To change body of generated methods, choose Tools | Templates.
    }
    
}
