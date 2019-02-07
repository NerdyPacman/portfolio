/*
ID: jaxsonm1
LANG: JAVA
TASK: test
 */
import java.io.*;
import java.util.*;

public class test {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numberOfInts = 2;
		
		int sum = 0;
		for(int i=0;i<numberOfInts;i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		out.println(sum);
		
		out.close();
		br.close();
	}
}
