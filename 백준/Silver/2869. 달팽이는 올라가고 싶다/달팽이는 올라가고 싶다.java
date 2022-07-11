import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int res = 1;
		
		if(a < v) {
			res = (v-a)%(a-b) == 0 ? res + (v-a)/(a-b) : res + (v-a)/(a-b) + 1;
		}
		
		bw.write(String.valueOf(res));
		bw.flush();
	}// end main()
}