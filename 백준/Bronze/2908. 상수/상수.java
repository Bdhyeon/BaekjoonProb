import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] input = br.readLine().toCharArray();
        char[] clone = input.clone();
        for(int i=0; i<input.length; i++) {
        	input[i] = clone[input.length - i - 1];
        }
        
        StringTokenizer st = new StringTokenizer(String.valueOf(input));
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int res = a > b ? a : b;
        bw.write(String.valueOf(res));
        bw.flush();
    }
}