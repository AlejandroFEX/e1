package e1;

public class Estudiantes extends Residentes {
    public Estudiantes(String nombre, String apellidos, int edad, String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones, e1.Casa casa, ArrayList casas) {
        super(nombre, apellidos, edad, categoria, n_horrocruxes, ratio_horrocruxes_Galeones, casa);
        Casas = casas;
    }

    public enum Casa {
        Gryffindor,
        Hufflepuff, Ravenclaw, Slytherin
    }

    ArrayList Casas = new ArrayList();

    public void AddCasa(Casa casa) {
        if (casa == null)
            throw new IllegalArgumentException("La casa que añades no existe");
        Casas.add(casa);
    }

    @Override
    public String ImprimirRecompensas() {
        return super.ImprimirRecompensas();
    }
}