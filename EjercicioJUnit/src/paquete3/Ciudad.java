/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombre;
    private int poblacion;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public void establecerPoblacion(int x) {
        poblacion = x;
    }

    @Override
    public String toString() {
        String x = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                obtenerNombre(),
                obtenerPoblacion()
                );
        return x;
    }
    
    
}
