
package ui;

import data.GestorEntidades;
import javax.swing.JOptionPane;
import model.GuiaTuristico;
import model.Vehiculo;

public class LlanquihueTourApp {

   
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "LLANQUIHUE TOUR\n\n"
                    + "1. Agregar Guía\n"
                    + "2. Agregar Vehículo\n"
                    + "3. Mostrar registros\n"
                    + "4. Salir"));

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog("Nombre:");

                    String rut = JOptionPane.showInputDialog("RUT:");

                    String idioma = JOptionPane.showInputDialog("Idioma:");

                    GuiaTuristico guia = new GuiaTuristico(nombre, rut, idioma);

                    gestor.agregarEntidad(guia);

                    JOptionPane.showMessageDialog(null, "Guía registrado correctamente.");

                    break;

                case 2:

                    String patente = JOptionPane.showInputDialog("Patente:");

                    String marca = JOptionPane.showInputDialog("Marca:");

                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Capacidad:"));

                    Vehiculo vehiculo = new Vehiculo(patente, marca, capacidad);

                    gestor.agregarEntidad(vehiculo);

                    JOptionPane.showMessageDialog(null, "Vehículo registrado.");

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null,
                            gestor.mostrarEntidades());

                    break;

                case 4:

                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar Llanquihue Tour");

                    break;

                default:

                    JOptionPane.showMessageDialog(null,
                            "Opción inválida");

            }

        } while (opcion != 4); 
    }
    
}
