import java.io.*;
import java.util.*;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
       
        starM(n);
        System.out.print(sb);
     }
     public static int starM (int temp){
        for(int i=0;i<temp;i++){
            sb.append("*"+" ");
        }
        sb.append("\n");
        if(temp==1) return starA(temp);
        else return starM(temp-1);
     }
     public static int starA (int temp){
        for(int i=0;i<temp;i++){
            sb.append("*"+" ");
        }
        sb.append("\n");
        if(temp==n) return 0;
        else return starA(temp+1);
        
        
     }
}