import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;
        
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            
            int r = Integer.parseInt(st.nextToken());
            char[] s = st.nextToken().toCharArray();
            
            for(int j=0; j<s.length; j++){
                for(int k=0; k<r; k++){
                    sb.append(s[j]);
                }
            }
            
            sb.append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
    }
}