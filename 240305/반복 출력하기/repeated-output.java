import java.io.*;
import java.util.*;
public class Main {
    public static void temp(int n){
     for(int i=0 ;i<n;i++){
            System.out.print("12345^&*()_");
            System.out.println();
        }

    }
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        temp(n);
        StringBuilder sb = new StringBuilder();
        // 여기에 코드를 작성해주세요.
    }
}