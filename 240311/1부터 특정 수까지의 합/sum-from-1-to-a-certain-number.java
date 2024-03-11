import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
        System.out.print(add(n));
    }
    public static int add(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum/10;
    }
}