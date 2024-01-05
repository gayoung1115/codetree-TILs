import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int a =  (int)Math.pow(n,2);
        System.out.println(a);
        if(n<5) System.out.println("tiny");
		
    }
}