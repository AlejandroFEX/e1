package e1;

public class Docente extends Personal {
    public Docente(String nombre, String apellidos, int edad, String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones, int sueldo_base, int extra, Asignatura asignatura) {
        super(nombre, apellidos, edad, categoria, n_horrocruxes, ratio_horrocruxes_Galeones, sueldo_base, 0);
        this.asignatura = asignatura;
    }


    private
     Asignatura asignatura;

    @Override
    public double getRatio_horrocruxes_Galeones() {
        double valor2 = getRatio_horrocruxes_Galeones();
        if(asignatura == Asignatura.Defensa) {
            return 0.75 * valor2;
        }
        else{
            return valor2;
        }
    }

    @Override
    public String ImprimirRecompensas() {
        return super.ImprimirRecompensas();
    }

    @Override
    public String imprimirSalarios() {
        return super.imprimirSalarios();
    }
}
