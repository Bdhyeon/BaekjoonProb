import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = br.readLine().charAt(0) + 0;
		bw.write(String.valueOf(x));
		bw.flush();
	}// end main
}// end class