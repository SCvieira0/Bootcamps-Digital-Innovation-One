/*Entry:
The entry has a integer number
Exit:
Write all the positive divisors of N, one per line.*/

import java.io.IOException;
import java.util.Scanner;

public class Divider {  public static void main(String[] args) throws IOException {
    Scanner rd = new Scanner(System.in);
    int N = rd.nextInt();
    for(int i=1;i<=N;i++){
        if(N % i == 0){
            System.out.println(i);
        }
    }
}
}
