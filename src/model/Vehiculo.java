
package model;


public class Vehiculo implements Registrable {
   private String patente;
    private String marca;
    private int capacidad;

    public Vehiculo(String patente, String marca, int capacidad) {
        this.patente = patente;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    @Override
    public String mostrarResumen() {

        return "VEHICULO\n"
                + "Patente: " + patente
                + "\nMarca: " + marca
                + "\nCapacidad: " + capacidad + " pasajeros";
    }

    public int getCapacidad() {
        return capacidad;
    } 
}
