package LOTR;

/**
 * Personaje LOTR
 * @author Ian del Castillo
 * @version 1.0
 * @since 2025
 */

public class Personaje {

    String nombre;
    String raza;
    String clase;

    /**
     * Constructor de PersonajeLOTR.
     * @param nombre Nombre del personaje.
     * @param raza Raza del personaje.
     * @param clase Tipo de clase del personaje.
     */
    public Personaje(String nombre, String raza, String clase) {
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
    }


    /**
     * Muestra los datos del personaje
     * @return nombre, raza y clase
     */
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Clase: "+clase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

}
