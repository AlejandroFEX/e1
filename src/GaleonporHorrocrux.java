public enum GaleonporHorrocrux {
    DOCENTE(50), CONSERJE(65), GUARDABOSQUES(75), FANTASMA(80), ESTUDIANTE(90);


    private double Ratio_horrocruxes_Galeones;

  GaleonporHorrocrux(double s){
      Ratio_horrocruxes_Galeones= s;
  }
  double getRatio_horrocruxes_Galeones(){
      return Ratio_horrocruxes_Galeones;
  }
}