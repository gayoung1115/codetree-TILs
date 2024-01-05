import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        String arr[] = new String[3];
        for(int i=0;i<3;i++){
            arr[i] = st.nextToken();
        }
        System.out.println(arr[0]+"-"+arr[2]+"-"+arr[1]);

    }}