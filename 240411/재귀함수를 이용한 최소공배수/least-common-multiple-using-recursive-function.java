import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(result(arr));

    }

    public static int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        else return gcd(b, r);
    }
    public static int lcm(int a, int b){
        int g = gcd(a,b);
        return a*b/g;
    }


    public static int result(int []a){
        int lcmResult = a[0];
        for(int i = 1; i < a.length; i++){
            lcmResult = lcm(lcmResult, a[i]);
        }
        return lcmResult;
    }
}