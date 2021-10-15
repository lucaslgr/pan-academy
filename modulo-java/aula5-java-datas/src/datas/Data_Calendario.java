package datas;

import java.util.Calendar;

public class Data_Calendario {
    public static void main(String[] args) {
        //Create a new calendar
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = (Calendar) Calendar.getInstance();
        Calendar calendario3 = (Calendar) Calendar.getInstance();

        //print the objct Calendar
        System.out.println(calendario1);
        System.out.println("-".repeat(50));

        //print the current data and time
        System.out.println("Calendario1 antes " + calendario1.getTime());
        System.out.println("Calendario2 antes " + calendario2.getTime());
        System.out.println("Calendario3 antes " + calendario3.getTime());
        System.out.println("-".repeat(50));

        calendario1.add(Calendar.MONTH, 2);
        calendario2.add(Calendar.YEAR, 2);
        calendario3.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("-".repeat(50));

        //print the current data and time
        System.out.println("Calendario1 depois " + calendario1.getTime());
        System.out.println("Calendario2 depois " + calendario2.getTime());
        System.out.println("Calendario3 depois " + calendario3.getTime());
        System.out.println("-".repeat(50));
    }
}
