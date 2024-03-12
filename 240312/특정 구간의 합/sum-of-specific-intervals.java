import java.io.*;
import java.util.*;
public class Main {
    static int arr[];
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        };
        for(int j=0;j<m;j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(sum(a-1,b-1));
        }
    }
    public static int sum(int a, int b){
        int sum =0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        return sum;
     }
}