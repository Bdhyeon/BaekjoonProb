import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int x = i;
			int y = (x % 10) - (x / 10 % 10);
			int z = y;

			while (x >= 10) {
				x = x / 10;
				y = (x % 10) - (x / 10 % 10);
				if (y != z)
					break;
			}
			
			if (x < 10)
				cnt++;
				
		}

		bw.write(String.valueOf(cnt));
		bw.flush();

	}// end main
}//end class