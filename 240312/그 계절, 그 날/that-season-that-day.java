import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int Y = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int D = Integer.parseInt(st.nextToken());
        if(isDay(M,D,year(Y))){
        if(M==3 || M==4 || M==5){
            System.out.println("Spring");
        }else if(M==6 || M==7 || M==8){
            System.out.println("Summer");
        }
        else if(M==9 || M==10 || M==11){
            System.out.println("Fall");
        }
        else if(M==12 || M==1 || M==2){
            System.out.println("Winter");
        }
       }else{
        System.out.println("-1");
       }
    }
    public static boolean year(int y) { 
      if(y%4==0 && y%100!=0){
        return true;
      }else if(y%400==0){
        return true;
      }else{
        return false;
      }

    }
    public static boolean isDay(int m, int d, boolean yoon) { 
      if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(d<=31) return true;
            else return false;
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d<=30) return true;
            else return false;
        }else if(m == 2 && yoon){
            if(d<=29) return true;
            else return false;
        }else{
            if(d<=28) return true;
            else return false;
        }

    }
}