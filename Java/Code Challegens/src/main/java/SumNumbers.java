/*
You are in a market with your bag and stop at a stand.
The shopkeeper has given you red and yellow peppers.
Now we will sum the red and yellow peppers to discover the total of peppers in the bag.
You will receive two numbers witch must be read e stored in variables A (red pepper) and B (yellow pepper).
Do the sum of A and B storing the result in a variable X.
Show X as demonstrated in the message bellow. Don't show the message in any other way.

Entry:
The entry will receive two integer values, separated by an empty space.
Exit:
Print the message: "X = " + the variable with the total of peppers.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class SumNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = a + b;

        System.out.println("X = " + x);
    }
}
