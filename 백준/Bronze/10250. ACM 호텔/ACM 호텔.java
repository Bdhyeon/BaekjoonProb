import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int yy = 0;
		int xx = 0;
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			yy = n % h == 0 ? h : n % h;
			xx = n % h == 0 ? n / h : n / h + 1;
			
			sb.append(yy);
			if(xx < 10)
				sb.append(0);
			sb.append(xx).append("\n");
			
			bw.write(sb.toString());
		}

		bw.flush();
	}// end main()
}