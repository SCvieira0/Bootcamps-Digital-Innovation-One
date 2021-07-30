/*Ramsay:"(..)you win if you can guess who I am and why I'm
torturing you."

Theon must think fast and guess who is his torturer! But
Ramsey has already decided what he will do after Theon gives
his answer.Theon can say that is torturer is someone
between N persons. Consider that these persons
are numbered from 1 to N.If Theon answer that is torturer
is the person i, Ramsey will strike him Ti times.
Your job is to help Theon to determined which must be his answer
to minimize the number of times he is struck.

Entry:
The first line have one integer N(1 ≤ N ≤ 100).
The second line has N integers T1, T2, ..., TN(0 ≤ Ti ≤ 20)
Exit:
Print the line with the number of the person Theon
must say is his torturer. If exists more the one
possible answer, print the lower one.*/

import java.io.IOException;
import java.util.Scanner;

public class TheonAnswer {public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int posMenor = 1, menor = 20, T;
    int N = leitor.nextInt();
    for (int i=1;i<=N;i++) {
        T = leitor.nextInt();
        if (T < menor) {
            posMenor = i;
            menor = T;
        }
    }
    System.out.println(posMenor);
}
}
