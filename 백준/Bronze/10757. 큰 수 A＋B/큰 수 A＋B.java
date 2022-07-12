import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        
        bw.write(a.add(b).toString());
        bw.flush();
        
        br.close();
        bw.close();
    }
}