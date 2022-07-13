import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(fac(n)));
		bw.flush();
		br.close();
		bw.close();
	}// end main()

	public static int fac(int n) {
		int x = 1;
		if(n>0) {
			x = n * fac(n-1);
		}
		return x;
	}//end fac()
}