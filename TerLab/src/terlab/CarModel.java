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
public class CarModel {
    private String numModel;
    private int precio;
    private Category categoria;

    public CarModel(String numModel, int precio, Category categoria) {
        this.numModel = numModel;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNumModel() {
        return numModel;
    }


    public int getPrecio() {
        return precio;
    }

    public Category getcategoria (){
        return categoria;
    }

    @Override
    public String toString() {
        return "CarModel{" + "numModel=" + numModel + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    
    
   
}
