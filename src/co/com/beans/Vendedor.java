package co.com.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class Vendedor extends Persona {
    private int id;
    private String nombre;
    private HashMap<String,Vendedor> Vendedor;

    public HashMap<String, co.com.beans.Vendedor> getVendedor() {
        return Vendedor;
    }

    public void setVendedor(HashMap<String, co.com.beans.Vendedor> vendedor) {
        Vendedor = vendedor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
