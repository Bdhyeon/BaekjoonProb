import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String x = br.readLine();
        int t = 0;
        
        for(int i=0; i<x.length(); i++) {
        	switch(x.charAt(i)) {
        	case 'A': case 'B': case 'C': t += 3; break;
        	case 'D': case 'E': case 'F': t += 4; break;
        	case 'G': case 'H': case 'I': t += 5; break;
        	case 'J': case 'K': case 'L': t += 6; break;
        	case 'M': case 'N': case 'O': t += 7; break;
        	case 'P': case 'Q': case 'R': case 'S': t += 8; break;
        	case 'T': case 'U': case 'V': t += 9; break;
        	default: t += 10;
        	}
        }
        
        bw.write(String.valueOf(t));
        bw.flush();
    }
}