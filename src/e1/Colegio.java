package e1;

import java.util.List;

public class Colegio {
    private List<Integrante> integrantes;
    private List<Personal> personal;

    public void addIntegrante(Integrante integrante) {
        if (integrante == null) {
            throw new IllegalArgumentException();
        } else {
            integrantes.add(integrante);
        }
    }

    public void addResidente(Personal personales) {
        if (personales == null) {
            throw new IllegalArgumentException();
        } else {
            personal.add(personales);
        }

    }

    public String ImprimirRecompensas() {

        int aux = 0;
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for (Integrante i : integrantes) {
            sb.append(i.ImprimirRecompensas() + "\n");
            aux += i.getRecompensas();
        }
        s = "La recompensa total del Colegio Hogwarts es de " + aux + "galeones";
        return sb.toString();

    }


    public String imprimirSalarios() {
        int aux = 0;
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for (Personal i : personal) {
            sb.append(i.imprimirSalarios() + "\n");
            aux += i.getRecompensas();
        }
        s = "El gasto total en personal es de " + aux + "galeones";
        return sb.toString();

    }


    public static void main(String[] args) {


    }
//Empezar con todo menos con la implementacion de matrices, dejar para el final.
}




