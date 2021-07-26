/*
Read a integer number X.
After show 6 odd values from the given number (X),
one value per line, including X if applies.

Entry:
The entry will be an integer positive number.
Exit:
The exit will be a sequence of odd numbers.*/

import java.io.IOException;
import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) throws IOException {
        Scanner reading = new Scanner(System.in);
        int x = reading.nextInt();
        int cont = 0;

        if(x > 0){
            while (cont <  6) {
                if (x  % 2 == 1) {
                    System.out.println(x);
                    cont++;
                }
                x++;
            }
        }
    }
}