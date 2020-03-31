package com.company;
import java.util.Calendar;


public class Hora {
    private int hora=0;
    private int minutos=0;
    private int segundos=0;


    public void mostrarHora() {

        System.out.printf("HORA: %02d:%02d:%02d\n", this.hora, this.minutos, this.segundos);

    }
    public void actualizarHora(){
        Calendar calendario = Calendar.getInstance();
        this.hora = calendario.get(Calendar.HOUR_OF_DAY);
        this.minutos = calendario.get(Calendar.MINUTE);
        this.segundos = calendario.get(Calendar.SECOND);
    }

    public void aumentarUnSegundo() {

        if (this.segundos < 59)
            this.segundos += 1;
    }
    public void restarUnSegundo()
    {
        if (this.segundos > 0)
            this.segundos -= 1;

    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }


}
