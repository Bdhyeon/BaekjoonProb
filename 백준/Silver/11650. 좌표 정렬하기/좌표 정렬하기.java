import java.io.*;
import java.util.*;

public class Main {
	public static Comparator<Integer[]> comp = new Comparator<Integer[]>() {
		public int compare(Integer[] o1, Integer[] o2) {
			if(o1[0].equals(o2[0])) {
				return o1[1].compareTo(o2[1]);
			}else {
				return o1[0].compareTo(o2[0]);
			}
		};
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer[]> spot = new ArrayList<Integer[]>();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			spot.add(new Integer[]{x,y});
		}
		
		spot.sort(comp);
		for(int i=0; i<spot.size(); i++) {
			bw.write(String.valueOf(spot.get(i)[0] + " " + spot.get(i)[1]) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}