import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int x = 0;
		
		while(n - 1 > 3 * x * (x + 1)) {
			x++;
		}

		bw.write(String.valueOf(x+1));
		bw.flush();
    }
}