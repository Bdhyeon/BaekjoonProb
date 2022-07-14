import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(fi(n)));
		bw.flush();
		br.close();
		bw.close();
	}// end main()

	public static int fi(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fi(n-1)+fi(n-2);
	}//end fi()
}