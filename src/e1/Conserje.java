package e1;

public class Conserje extends Personal {
    public Conserje(String nombre, String apellidos, int edad, String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones, int sueldo_base, int extra, String nocturnidad) {
        super(nombre, apellidos, edad, categoria, n_horrocruxes, ratio_horrocruxes_Galeones, 150, 10);
        this.nocturnidad = nocturnidad;
    }



    private  String nocturnidad;


    @Override
    public int getSueldo_base() {
        if (nocturnidad == null) {
            return super.getSueldo_base();
        }
        else{
            return getSueldo_base() + getExtra();
        }
    }

    @Override
    public String imprimirSalarios() {
        return super.imprimirSalarios();
    }

    @Override
    public String ImprimirRecompensas() {
        return super.ImprimirRecompensas();
    }
}

