/*
Show a message saying how many positive values were written, following the example bellow.
System.out.println(cont + " positive values"); */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumbers {
    public static void main(String[] args) throws IOException {
        String numbers;
        Double x;
        int  cont = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<6;i++){
            numbers = br.readLine();
            x = Double.parseDouble(numbers);
            if(x > 0){
                cont++;
            }
        }
        System.out.println(cont + " positive values");
    }
}
