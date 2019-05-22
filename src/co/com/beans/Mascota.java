package co.com.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class Mascota {
    private int id;
    private String nombre;
    private String edad;
    private String raza;


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

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
