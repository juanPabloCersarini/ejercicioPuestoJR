
package concesionaria;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo
 */
public class Sucursal implements Consultor{
    ArrayList<Vehiculo> listaVehiculos = new ArrayList();
   
    public void crearSucursal(){
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Moto moto1 = new Moto();
        Moto moto2 = new Moto();
        
        auto1.setMarca("Peugeot");
        auto1.setModelo("206");
        auto1.setPuertas("4");
        auto1.setPrecio(200000);
        
        listaVehiculos.add(auto1);
        
        moto1.setMarca("Yamaha");
        moto1.setModelo("206");
        moto1.setCilindradas("160c");
        moto1.setPrecio(200000);
        
        listaVehiculos.add(moto1);
    }

    @Override
    public void mostrarVehiculos() {
        int i;
        for (i=0; i<listaVehiculos.size(); i++){
            System.out.println ("Marca: "+listaVehiculos.get(i).getMarca()  );  
        }
    }
}
