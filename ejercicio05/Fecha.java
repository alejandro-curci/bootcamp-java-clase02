package ejercicio05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Months in Fecha go between 1 and 12
    // Months in GregorianCalendar go between 0 and 11
    public boolean validarFecha() {
        Calendar auxCalendar = new GregorianCalendar(year, month-1, day);
        return auxCalendar.get(Calendar.DATE) == day && auxCalendar.get(Calendar.MONTH) == month-1 && auxCalendar.get(Calendar.YEAR) == year;
    }

    public void sumarDia() {
        Calendar auxCalendar = new GregorianCalendar(year, month-1, day);
        auxCalendar.add(Calendar.DATE, 1);
        day = auxCalendar.get(Calendar.DATE);
        month = auxCalendar.get(Calendar.MONTH)+1;
        year = auxCalendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "Fecha: " + day + "/" + month + "/" + year;
    }
}
