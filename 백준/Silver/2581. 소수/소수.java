import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		List<Integer> li = PrimeNumber(m, n);

		if (li.size() == 0) {
			bw.write("-1");
		} else {
			int sum = 0;
			int min = li.get(0);
			for (Integer x : li) {
				sum += x;
			}
			bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
		}

		bw.flush();
		br.close();
		bw.close();
	}// end main()

	public static List<Integer> PrimeNumber(int m, int n) {
		List<Integer> primeNumber = new ArrayList<Integer>();

		for (int i = m; i <= n; i++) {
			if (i == 2)
				primeNumber.add(i);

			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					break;
				if (j == i - 1)
					primeNumber.add(i);
			}
		}
		return primeNumber;
	}//end PrimeNumber()
}