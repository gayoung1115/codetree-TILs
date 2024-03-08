import  java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        boolean same =false;
        if(x2>y2){
            if(y1>=x1) same = true;
        }else{
            if(x2>=y1) same =true;
        }
        

        if(same) System.out.println("intersecting");
    }
}