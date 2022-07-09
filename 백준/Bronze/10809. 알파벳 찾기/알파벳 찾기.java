import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int[] alphabet = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

		char[] s = br.readLine().toCharArray();

		for (int i = 0; i < s.length; i++) {
			if (alphabet[s[i] - 97] == -1)
				alphabet[s[i] - 97] = i;
		}

		for (int i : alphabet) {
			sb.append(i).append(' ');
		}

		sb.deleteCharAt(sb.length() - 1);
		bw.write(sb.toString());
		bw.flush();
	}// end main
}// end class