/*
ID: jaxsonm1
LANG: JAVA
TASK: ride
 */
//package ride;
import java.io.*;
import java.util.*;

public class ride {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new FileWriter("ride.out"));
		
		String comet = br.readLine();
		String group = br.readLine();
		char[] cometArray = comet.toCharArray();
		char[] groupArray = group.toCharArray();
		
		int cometProduct = 1;
		for(int i=0;i<cometArray.length;i++) {
			cometProduct *= (int) cometArray[i] - (int) 'A' + 1;
		}
		
		int groupProduct = 1;
		for(int i=0;i<groupArray.length;i++) {
			groupProduct *= (int) groupArray[i] - (int) 'A' + 1;
		}
		
		if(groupProduct % 47 == cometProduct % 47) {
			out.println("GO");
		} else {
			out.println("STAY");
		}
		
		out.close();
	}
}
