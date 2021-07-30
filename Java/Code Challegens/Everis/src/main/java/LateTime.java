/*Bino and his friend Cino go to the market together every day.
They always agree to meet up at the bus station at 8:00 a.m.
Bino can take 30 to 60 minutes from his home to the bus
station. Given his time o departure, show how late he can be
in minutes.

Entry:
The entry is done in multiple test.
In each case the test has only one line
with the time H(5:00 ≤ H ≤ 9:00) that Bino woke up.
The entry ends with EOF.
Exit:
For each test print "Maximun delay: X", X represents the
time in minutes of Bino's delay.

Olimpíada Cearense de Informática - 2015*/

import java.io.IOException;
import java.util.Scanner;

public class LateTime {public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    while (leitor.hasNext()) {
        String[] relogio = leitor.nextLine().split(":");
        int hora = Integer.parseInt(relogio[0]);
        int min = Integer.parseInt(relogio[1]);
        switch (hora) {
            case (7):
                System.out.println("Atraso maximo: " + min);
                break;
            case (8):
                System.out.println("Atraso maximo: " + (60 + min));
                break;
            case (9):
                System.out.println("Atraso maximo: " + (120 + min));
                break;
            default:
                System.out.println("Atraso maximo: 0");
                break;
        }
    }
}
}
