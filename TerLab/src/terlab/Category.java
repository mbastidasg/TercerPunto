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
public class Category {
    private String nombre;

    public Category(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Category{" + "nombre=" + nombre + '}';
    }

    
    
}
