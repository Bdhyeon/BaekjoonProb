import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			list.add(x);
		}
		
		list.sort(Comparator.naturalOrder());
		for(int i=0; i<n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		sb.deleteCharAt(sb.length()-1);
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}