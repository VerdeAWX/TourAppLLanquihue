
package model;


public class ColaboradorExterno extends Persona {
    private String especialidad;

    public ColaboradorExterno(String nombre, String rut, String especialidad) {
        super(nombre, rut);
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {

        return "COLABORADOR EXTERNO\n"
                + "Nombre: " + nombre
                + "\nRUT: " + rut
                + "\nEspecialidad: " + especialidad;
    }
}
