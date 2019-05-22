package co.com.bussineslogic;

import co.com.beans.Mascota;
import co.com.beans.Usuario;
import co.com.beans.Vendedor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        Mascota perla = new Mascota();
        perla.setId(01);
        perla.setNombre("perla");
        perla.setEdad("7");
        perla.setRaza("Chicksu");

        Mascota paul = new Mascota();
        paul.setId(02);
        paul.setNombre("paul");
        paul.setEdad("6");
        paul.setRaza("chicksu");

        Mascota firulais = new Mascota();
        firulais.setId(04);
        firulais.setNombre("firulais");
        firulais.setEdad("4");
        firulais.setRaza("criollo");

        ArrayList<Mascota> listar = new ArrayList<Mascota>();
        listar.add(perla);
        listar.add(paul);
        listar.add(firulais);


        HashMap<String,Mascota> lista = new HashMap<String,Mascota>();
        lista.put("titi",perla);
        lista.put("kevin",paul);

        Usuario caro = new Usuario();
        caro.setId(02);
        caro.setNombre("caro");
        caro.setTelefono("456237");
        caro.setCorreo("carito@gmail.com");
        caro.setMascota(lista);
        caro.setMascotas(listar);
        //JOptionPane.showMessageDialog(null, caro.getId() + "\n" + caro.getNombre() + "\n" + caro.getTelefono() + "\n" + caro.getCorreo());
        //Metodo1}



        /*for (int i = 0; i < caro.getMascotas().size(); i++) {
            JOptionPane.showMessageDialog(null, caro.getMascotas().get(i).getNombre());
        }


        for ( Mascota temp : caro.getMascotas()) {
            JOptionPane.showMessageDialog(null,temp.getEdad());
        }*/


        /*JOptionPane.showMessageDialog(null,  "Dueño: " + caro.getNombre() + "\n"
                                                        + "ID Mascota: " + caro.getMascota().get("titi").getId() + "\n"
                                                        + "Nombre: " +caro.getMascota().get("titi").getNombre() + "\n"
                                                        + "Edad: " +caro.getMascota().get("titi").getEdad() + "\n"
                                                        + "Raza: " + caro.getMascota().get("titi").getRaza());*/

        Vendedor kevin = new Vendedor();
        kevin.setId(03);
        kevin.setNombre("kevin");
        kevin.setTelefono("7894561");
        kevin.setCorreo("kevincito.com");


        //JOptionPane.showMessageDialog(null, kevin.getId() + "\n" + kevin.getNombre() + "\n" + kevin.getTelefono() + "\n" + kevin.getCorreo());



    }


}
