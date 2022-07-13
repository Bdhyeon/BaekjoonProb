import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int big = 0;
			int small = 0;

			boolean[] prime = new boolean[n];
			prime[0] = true;

			// 소수 판별(false: 소수)
			for (int j = 2; j < prime.length; j++) {
				for (int k = j * j; k <= n; k += j) {
					prime[k - 1] = true;
				}
			}

			// n 빼기 소수
			for (int j = 0; j < prime.length / 2; j++) {
				if (!prime[j]) {
					if (!prime[n - j - 2]) {
						big = n - j - 1;
						small = j + 1;
					}
				}
			}
			sb.append(small).append(" ").append(big).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}