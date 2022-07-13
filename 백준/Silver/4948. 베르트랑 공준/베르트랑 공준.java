import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			boolean chk = true;
			int cnt = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						chk = false;
						break;
					}
					chk = true;
				}
				cnt = chk ? cnt + 1 : cnt;
			}
			sb.append(cnt).append("\n");
		}
		
		bw.write(sb.toString());

		bw.flush();
		br.close();
		bw.close();
	}// end main()
}