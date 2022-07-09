import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		selfNumber(10000);
	}// end main

	public static void selfNumber(int num) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] cnt = new int[num];
		int n = 0;

		for (int i = 1; i <= num; i++) {
			n = i;
			int sum = n;
			while (n > 0) {
				sum += n % 10;
				n = n / 10;
			}

			if (sum <= num) {
				cnt[sum - 1]++;
			}
		}

		for (int i = 0; i < num; i++) {
			if (cnt[i] == 0) {
				bw.write((i + 1) + "\n");
			}
		}

		bw.flush();
	}
}// end class