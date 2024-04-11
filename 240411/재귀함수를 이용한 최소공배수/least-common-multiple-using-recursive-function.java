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


    public static int result(int []a){
        if(a.length == 1) return a[0];
        int m = gcd(a[0],a[1]);
        int first = a[0]*a[1]/m ;
        if(a.length>3){
          for(int i=2 ;i<a.length;i++){
            m = gcd(first, a[i]);
            first = first*a[i] / m ;
        }  
        }
        return first;
    }
}