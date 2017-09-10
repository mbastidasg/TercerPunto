/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terlab;

/**
 *
 * @author MARIAJOSE
 */
import java.util.*;
public class Store {

    private Address direccion;
    private ArrayList<Car> carros;

    public Store(Address direccion) {
        this.direccion = direccion;
        carros = new ArrayList<Car>(); 
    }
    
    public Address getAddress (){
        return direccion;
    }
    
    public void addCar (Car carro){
        carros.add(carro);
    }

    @Override
    public String toString() {
        return "Store{" + "direccion=" + direccion + ", carros=" + carros + '}';
    }
    
    
    
}
