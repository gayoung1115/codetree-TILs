import java.io.*;
import java.util.*;

public class Main {
    public static void square(int n){
        int number = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(number>9){
                    number = 1;
                }
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        square(n);
    }
}