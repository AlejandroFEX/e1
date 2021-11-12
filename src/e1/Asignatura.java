package e1;

public enum Asignatura {
    Historia(500), Transformaciones(400), Defensa(350),
    Herbologia(250), Pociones(200);
    private int sueldo_base;

    Asignatura(int s) {
        sueldo_base = s;
    }

    int getSueldo_base() {
        return sueldo_base;
    }

}

