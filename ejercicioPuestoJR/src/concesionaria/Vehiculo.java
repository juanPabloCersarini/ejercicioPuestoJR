package concesionaria;

/**
 *
 * @author Juan Pablo 
 */
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   public int compareTo(Vehiculo v){
        if(this.getPrecio()>v.getPrecio()){
            return -1;
        }else if(this.getPrecio()>v.getPrecio()){
            return 0;
        }else{
            return 1;
        }
   }
      
    public String toString() {
        return "Marca: "+ marca + " // Modelo: "+ modelo; //To change body of generated methods, choose Tools | Templates.
    }

}
