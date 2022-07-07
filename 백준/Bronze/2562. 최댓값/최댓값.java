import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = 0;
        int cnt = 0;
        for(int i=0; i<9; i++){
            if(max<arr[i]){
                cnt = i+1;
                max = arr[i];
            }
        }
        
        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(cnt) + "\n");
        bw.flush();
        
        br.close();
        bw.close();
    }
}