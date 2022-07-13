import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		boolean[] prime = prime(10000);
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int big = n / 2;
			int small = n / 2;

			for (int j = 0; j < n / 2; j++) {
				if (!prime[big - 1] && !prime[small - 1]) {
					sb.append(small).append(" ").append(big).append("\n");
					break;
				} else {
					big++;
					small--;
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}// end main()

	public static boolean[] prime(int n) {
		boolean[] prime = new boolean[n];
		prime[0] = true;

		for (int j = 2; j < prime.length; j++) {
			for (int k = j * j; k <= n; k += j) {
				prime[k - 1] = true;
			}
		}
		return prime;
	}//end prime
}