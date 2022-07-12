import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int three = 0;
		int five = 0;
		
		do {
			if(n % 5 == 0) {
				five = n / 5;
				break;
			}
			three++;
			n = n - 3;
		}while(n >= 3);
		
		int res = (five == 0) && (n % 3 != 0) ? -1 : three + five;
		
		bw.write(String.valueOf(res));
		bw.flush();

	}// end main()
}