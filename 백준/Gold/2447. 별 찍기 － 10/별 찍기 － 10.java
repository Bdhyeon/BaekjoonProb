import java.io.*;

public class Main {
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pattern(n, i, j);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		br.close();
	}// end main()

	public static void pattern(int n, int x, int y) {
		n = n / 3;
		if (x / n % 3 == 1 && y / n % 3 == 1) {
			sb.append(' ');
		} else {
			if (n < 3) {
				sb.append('*');
			} else {
				pattern(n, x, y);
			}
		}
	}// end pattern()
}