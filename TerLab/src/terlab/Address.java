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
public class Address {
    private String house;
    private String country;
    private String PostcodeM;

    public Address(String house, String country, String PostcodeM) {
        this.house = house;
        this.country = country;
        this.PostcodeM = PostcodeM;
    }

    public String getHouse() {
        return house;
    }

    
    public String getCountry() {
        return country;
    }

    
    public String getPostcodeM() {
        return PostcodeM;
    }

    
    
       
}
