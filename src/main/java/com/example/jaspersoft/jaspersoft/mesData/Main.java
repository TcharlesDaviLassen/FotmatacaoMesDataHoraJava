package com.example.jaspersoft.jaspersoft.mesData;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        try {

            Date data = new Date();
            System.out.println("Starting: " + data);

            Calendar c = Calendar.getInstance();
            System.out.println("Data e Hora atual: " + c.getTime());

            data = c.getTime();
            System.out.println("Data atual sem formatação: " + data);

            // Formata a data
            DateFormat formataData = DateFormat.getDateInstance();
            System.out.println("Data atual com formatação: " + formataData.format(data));

            // Formata Hora
            DateFormat hora = DateFormat.getTimeInstance();
            System.out.println("Hora formatada: " + hora.format(data));

            // Formata Data e Hora
            DateFormat dtHora = DateFormat.getDateTimeInstance();
            System.out.println("Formata Data e Hora: " + dtHora.format(data));

            // Formata Data Completa
            DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); // Data Completa
            System.out.println("Data brasileira: " + f.format(data));

            f = DateFormat.getDateInstance(DateFormat.LONG);
            System.out.println("Data sem o dia descrito: " + f.format(data));

            f = DateFormat.getDateInstance(DateFormat.MEDIUM);
            System.out.println("Data resumida 1: " + f.format(data));

            f = DateFormat.getDateInstance(DateFormat.SHORT);
            System.out.println("Data resumida 2: " + f.format(data));

            // Conversões
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Data formatada: " + sdf.format(data));

            String dat = sdf.format(data);
            // Converte Objetos
            System.out.println("Data convertida: " + sdf.parse(dat));

            Date dados = sdf.parse(dat);
            System.out.println("Data convertida em: " + sdf.format(dados));

        } catch (ParseException e) {
            System.out.println("Error parsing " + e.getMessage());
        }

        Locale locale = new Locale("pt", "BR");
        String[] nomesMeses = new String[12];

        for (int i = 0; i < 12; i++) {
            nomesMeses[i] = Month.of(i + 1).getDisplayName(TextStyle.FULL, locale);
        }

        String meses = String.join(", ", nomesMeses);

        String[] mes = meses.split(",");
        // String mesStr = mes[11].toString();

        for (String anoMes : mes) {
            getMes(anoMes, mes);
            // System.out.println(anoMes);
        }
    }

    public static String getMes(String mes, String[] mes2) {

        for (int i = 0; i < mes2.length; i++) {

            if (mes.equals(mes2[11])) {
                System.out.println(mes);
                return mes;
            }
        }

        return null;
    }
}