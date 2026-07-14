
package data;

import java.util.ArrayList;
import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;

public class GestorEntidades {
     private ArrayList<Registrable> lista;

    public GestorEntidades() {
        lista = new ArrayList<>();
    }

    public void agregarEntidad(Registrable r) {
        lista.add(r);
    }

    public String mostrarEntidades() {

        String salida = "";

        for (Registrable r : lista) {

            salida += r.mostrarResumen() + "\n\n";

            if (r instanceof GuiaTuristico) {

                salida += ">> Este objeto es un Guía Turístico.\n\n";

            } else if (r instanceof Vehiculo) {

                salida += ">> Este objeto es un Vehículo.\n\n";

            }

        }

        return salida;

    }
}
