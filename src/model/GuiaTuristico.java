
package model;


public class GuiaTuristico extends Persona {
    private String idioma;

    public GuiaTuristico(String nombre, String rut, String idioma) {
        super(nombre, rut);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    @Override
    public String mostrarResumen() {

        return "GUÍA TURÍSTICO\n"
                + "Nombre: " + nombre
                + "\nRUT: " + rut
                + "\nIdioma: " + idioma;
    }
}
