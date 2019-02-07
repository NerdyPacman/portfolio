/*
ID: jaxsonm1
LANG: JAVA
TASK: gift1
 */
//package gift1;
import java.io.*;
import java.util.*;

class gift1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new FileWriter("gift1.out"));
		
		int np = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i=0;i<np;i++) {
			map.put(br.readLine(), 0);
		}
		
		String person;
		String giftInfo;
		StringTokenizer st;
		int giftTotal;
		int peopleTotal;
		int amount;
		
		for(int i=0;i<np;i++) {
			person = br.readLine();
			giftInfo = br.readLine();
			st = new StringTokenizer(giftInfo);
			giftTotal = Integer.parseInt(st.nextToken());
			peopleTotal = Integer.parseInt(st.nextToken());
			if(peopleTotal != 0) {
				amount = giftTotal / peopleTotal;
			} else {
				amount = 0;
			}
			
			map.put(person, map.get(person) - amount * peopleTotal);
			for(int j=0;j<peopleTotal;j++) {
				String recipient = br.readLine();
				map.put(recipient, map.get(recipient) + amount);
			}
		}
		
		for(String key : map.keySet()) {
			out.println(key + " " + map.get(key));
		}
		
		out.close();
	}
}
