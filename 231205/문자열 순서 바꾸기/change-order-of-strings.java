import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String a  =br.readLine();
        // String temp[] = a.split("");
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.nextToken());
        System.out.println(a);
    }
}