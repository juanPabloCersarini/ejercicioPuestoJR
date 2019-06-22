
package concesionaria;

/**
 *
 * @author Juan Pablo toString
 */
public class Auto extends Vehiculo{
    private String puertas;

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public String toString() {
        return super.toString() + " // Puertas: "+ puertas; //To change body of generated methods, choose Tools | Templates.
    }

}
