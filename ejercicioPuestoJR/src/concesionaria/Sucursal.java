
package concesionaria;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
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
        
       
        auto2.setMarca("Peugeot");
        auto2.setModelo("208");
        auto2.setPuertas("5");
        auto2.setPrecio(250000);
        
                
        moto1.setMarca("Honda");
        moto1.setModelo("Titan");
        moto1.setCilindradas("125c");
        moto1.setPrecio(60000);
        
     
        moto2.setMarca("Yamaha");
        moto2.setModelo("YBR");
        moto2.setCilindradas("160c");
        moto2.setPrecio(80500.50);
        
        listaVehiculos.add(auto1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(auto2);
        listaVehiculos.add(moto2);
    }

    @Override
    public void mostrarVehiculos() {
        int i;
        for (i=0; i<listaVehiculos.size(); i++){
            System.out.println (listaVehiculos.get(i).toString() + " // Precio: " + listaVehiculos.get(i).getPrecio() );
        }
    }
    
    public void mostrarMinMax(){
        int i;
        double min = 0;
        double max = 999999;
        String marcaMax = "";
        String modeloMax = "";
        String marcaMin = "";
        String modeloMin = "";
        
        for (i=0; i<listaVehiculos.size(); i++){
            if (listaVehiculos.get(i).getPrecio()>min){
                min = listaVehiculos.get(i).getPrecio();
                marcaMax = listaVehiculos.get(i).getMarca();
                modeloMax = listaVehiculos.get(i).getModelo();
            }
            if (listaVehiculos.get(i).getPrecio()<max){
                max = listaVehiculos.get(i).getPrecio();
                marcaMin = listaVehiculos.get(i).getMarca();
                modeloMin = listaVehiculos.get(i).getModelo();
            }
        }
        
        System.out.println("============================");
        System.out.println("Vehiculo más caro: " + marcaMax + " " + modeloMax);
        System.out.println("Vehiculo más barato: " + marcaMin + " " + modeloMin);
    }
        
        
    }

