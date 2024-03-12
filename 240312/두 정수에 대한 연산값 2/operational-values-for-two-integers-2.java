import java.io.*;
import java.util.*;
public class Main {
      static int a,b;
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       a = Integer.parseInt(st.nextToken());
       b = Integer.parseInt(st.nextToken());
       year();
      System.out.print(a+" "+b);

    }
    public static void year() { 
      a +=10;
      b *=2;

    }

}