import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] score = new int[n];
			double sum = 0;
			double cnt = 0;
			
			for(int j=0; j<n; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			
			for(int k : score) {
				if(k > sum / n)
					cnt ++;
			}
			
			double per = cnt / n * 100;
			System.out.printf("%.3f%%\n", per);
			
		}

		br.close();
	}
}