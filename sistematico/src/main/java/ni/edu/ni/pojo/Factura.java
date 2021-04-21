/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.ni.pojo;

/**
 *
 * @author JADPA26
 */
public class Factura {
    int cod;
    String name;
    int cant;
    float price;
    float subtotal;

    public Factura(int cod, String name, int cant, float price, float subtotal) {
        this.cod = cod;
        this.name = name;
        this.cant = cant;
        this.price = price;
        this.subtotal = subtotal;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public int getCant() {
        return cant;
    }

    public float getPrice() {
        return price;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
