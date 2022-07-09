import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}

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