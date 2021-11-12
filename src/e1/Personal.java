package e1;

import java.util.List;

public class Personal extends Integrante {
    private int sueldo_base;
    private int extra;
    List<Personal> p;

    public Personal(String nombre, String apellidos, int edad, String categoria, int n_horrocruxes, int ratio_horrocruxes_Galeones, int sueldo_base, int extra) {
        super(nombre, apellidos, edad, categoria, n_horrocruxes, ratio_horrocruxes_Galeones);
        this.sueldo_base = sueldo_base;
        this.extra = extra;


    }




    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public String imprimirSalarios(){
        return nombreCompleto()+ "" + getEdad() + "" + getSueldo_base() + "" + SumaSalario(p);
    }
  public int SumaSalario(List<Personal> p){
        int i ;
        int Sumasal= 0;
        for(i=0; i< Salarios.size ; i ++){
            Sumasal= Sumasal + getSueldo_base() + getExtra();
        }
        return Sumasal;
  }

ArrayList Salarios = new ArrayList();

    @Override
    public String ImprimirRecompensas() {
        return super.ImprimirRecompensas();
    }
}




