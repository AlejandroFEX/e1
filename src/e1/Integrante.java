package e1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Integrante {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private double N_horrocruxes;
    private double Ratio_horrocruxes_Galeones;









    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public double getN_horrocruxes() {
        return N_horrocruxes;
    }

    public double getRecompensas() {
        return N_horrocruxes * Ratio_horrocruxes_Galeones;
    }

    public int getEdad() {
        return Edad;
    }

    public double getRatio_horrocruxes_Galeones() {
        return Ratio_horrocruxes_Galeones;
    }

    public Integrante(String nombre, String apellidos,int edad,String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones) {
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
        N_horrocruxes = n_horrocruxes;
        Ratio_horrocruxes_Galeones = ratio_horrocruxes_Galeones;

    }

    public String ImprimirRecompensas() {
        return nombreCompleto() + "" + Edad+ "" +  this.getClass().getSimpleName() + "" + N_horrocruxes + "" + Ratio_horrocruxes_Galeones + "" + Ratio_horrocruxes_Galeones * N_horrocruxes + "";
    }








    public String nombreCompleto() {
        return Nombre + " " + Apellidos;
    }

    private int index;


    public static class ArrayList {
        private Object[] elementData;
        public int size = 0;

        public ArrayList() {

            Object[] datos = new Object[10];
        }

        public boolean add(Object o) {
            elementData[size++] = o;
            return true;
        }

        public Object get(int index) {
            if (index > size || index < 0)
                throw new IndexOutOfBoundsException();
            return elementData[index];
        }

        public boolean isEmpty() {
            return size == 0;
        }

    }

    public int index() {
        return index;
    }
    Casa casa ;
    ArrayList Recompensas = new ArrayList();
    ArrayList N_horrocruxe = new ArrayList();
    ArrayList Nombres = new ArrayList();
    ArrayList Apellidoss = new ArrayList();
    ArrayList Edades = new ArrayList();
    ArrayList Ratios_Galeones_Horrocruxes = new ArrayList();
    ArrayList Categorias = new ArrayList();
}

