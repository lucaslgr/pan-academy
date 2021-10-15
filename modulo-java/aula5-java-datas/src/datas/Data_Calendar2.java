package datas;

import javax.swing.*;
import java.util.Calendar;

public class Data_Calendar2 {
    public static void main(String[] args) {

        Calendar calendario1 = (Calendar) Calendar.getInstance();

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));
        int ano_atual = calendario1.get(Calendar.YEAR);
        int idade = ano_atual - ano;
        System.out.println(idade);
    }
}
