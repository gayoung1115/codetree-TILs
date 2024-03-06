import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer =1;
        for(int i=2 ;i< = Math.min(n,m);i++){

            if(n%i==0 && m%i==0) answer = i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        System.out.print(sb);
    }
}