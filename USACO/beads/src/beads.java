/*
ID: jaxsonm1
LANG: JAVA
TASK: beads
 */
import java.io.*;
import java.util.*;

public class beads {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new FileWriter("beads.out"));
		
		br.readLine();
		String bead = br.readLine();
		String beadsCombined = bead + bead;
		char[] beads = beadsCombined.toCharArray();
		int highScore = 0;
		
		for(int i=0;i<beads.length;i++) {
			int score = beadLength(beads, i);
			if(score > highScore) {
				highScore = score;
			}
		}
		
		out.println(highScore);
		out.close();
	}

	static int beadLength(char[] beads, int startIndex) {
		int lives = 2;
		int length = 0;
		char template = beads[startIndex];
		for(int i=startIndex;i<beads.length-startIndex;i++) {
			if(template == 'w') {
				template = beads[i];
			} else if(beads[i] != template && beads[i] != 'w') {
				lives -= 1;
				template = beads[i];
			}
			if(lives == 0) {
				break;
			}
			length++;
		}
		if(length>beads.length/2) {
			length *= 0.5;
		}
		return length;
	}
}
