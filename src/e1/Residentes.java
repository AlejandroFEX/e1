package e1;

import java.util.Calendar;

public class Residentes extends Integrante {
    public Residentes(String nombre, String apellidos, int edad, String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones, Casa casa) {
        super(nombre, apellidos, edad, categoria, n_horrocruxes, ratio_horrocruxes_Galeones);
        this.casa = casa;
    }


    private Casa casa;

    @Override
    public double getRatio_horrocruxes_Galeones() {
        double valor = super.getRatio_horrocruxes_Galeones();
        if (casa == Casa.Slytherin) {
            return 2 * valor;
        } else {
            return valor;
        }
    }

    @Override
    public String ImprimirRecompensas() {
        return nombreCompleto() + "" + Edades + "" + Categorias + "" + casa +"" + N_horrocruxe + ":" + getRecompensas() ;
    }
}


