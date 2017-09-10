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
public class Car {
    private CarModel modelo;
    private int recorrido;

    public Car(CarModel modelo , int recorrido ) {
        this.recorrido = recorrido;
        this.modelo = modelo;
    }

    public CarModel getModel (){
        return modelo;
    }
  

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }

    @Override
    public String toString() {
        return "Car{" + "modelo=" + modelo + ", recorrido=" + recorrido + '}';
    }
    
    
    
}
