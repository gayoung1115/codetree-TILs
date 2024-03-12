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
        if(temp==0){
            return starM(temp+1);
        }
        for(int i=0;i<temp;i++){
            sb.append("*");
            if(i==temp-1) sb.append("\n");
        }
        
    
        return starA(temp-1);
        
        
     }
     public static int starA (int temp){
        if(temp>n) return 0;
        for(int i=0;i<temp;i++){
            sb.append("*");
            if(i==temp-1) sb.append("\n");
        }

        return starA(temp+1);
        
        
     }
}