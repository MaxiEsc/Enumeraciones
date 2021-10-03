
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1 de la semana: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);
//        System.out.println("Dia 6 de la semana: " + Dias.SABADO);
//        indicarDiaSemana(Dias.SABADO);
//        System.out.println("Dia 3 de la semana: " + Dias.MIERCOLES);
//        indicarDiaSemana(Dias.MIERCOLES);
        
        System.out.println("Continente N|4 :" + Continentes.AMERICA);
        System.out.println("Paises en el Continente 4 : " + Continentes.AMERICA.getPaises());
        System.out.println("habitantes en el Continente 4: " + Continentes.AMERICA.getHabitantes());
        System.out.println("Continente N|2 :" + Continentes.EUROPA);
        System.out.println("Paises en el Continente 2 : " + Continentes.EUROPA.getPaises());
        System.out.println("habitantes en el Continente 2: " + Continentes.EUROPA.getHabitantes());
        
    }
    
    private  static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:System.out.println("Primer dia de la semana");
                break;
            case MARTES:System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:System.out.println("Quinto dia de la semana");
                break;
            case SABADO:System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
