package co.com.beans;


import java.util.ArrayList;
import java.util.HashMap;

public class Usuario extends Persona {
    private int id;
    private String nombre;
    private HashMap<String,Mascota> Mascota;
    private ArrayList<Mascota> mascotas;

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashMap<String, co.com.beans.Mascota> getMascota() {
        return Mascota;
    }

    public void setMascota(HashMap<String, co.com.beans.Mascota> mascota) {
        Mascota = mascota;
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
