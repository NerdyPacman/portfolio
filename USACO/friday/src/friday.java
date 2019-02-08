/*
ID: jaxsonm1
LANG: JAVA
TASK: friday
 */
import java.io.*;
import java.util.*;

class Date {
	public int day;
	public int month;
	public int year;
	public int weekday;
	
	public Date(int startDay, int startMonth, int startYear, int startWeekday) {
		day = startDay;
		month = startMonth;
	    year = startYear;
		weekday = startWeekday;
	}
	
	public void iterateDay() {
		day += 1;
		iterateWeekday();
		if(day > daysInMonth(month, year)) {
			iterateMonth();
		}
	}
	
	public void iterateMonth() {
		month += 1;
		day = 1;
		if(month > 12) {
			iterateYear();
		}
	}
	
	public void iterateYear() {
		year += 1;
		month = 1;
	}
	
	public void iterateWeekday() {//1 is monday. 7 is sunday.
		weekday += 1;
		if(weekday > 7) {
			weekday = 1;
		}
	}
	
	public int daysInMonth(int month, int year) {
		switch (month) {
			case 1:	return 31;
			case 2: return daysInFebruary(year);
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
			default: return 31;
		}
	}
	
	public int daysInFebruary (int year) {
		if(year % 4 == 0 && year % 100 != 0) {
			return 29;
		} else if (year % 4 == 0 && year % 400 == 0) {
			return 29;
		} else {
			return 28;
		}
	}
}

public class friday {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new FileWriter("friday.out"));
		
		Map<Integer, Integer> results = new LinkedHashMap<Integer, Integer>();
		for(int i=1;i<8;i++) {
			results.put(i, 0);
		}
		
		int numberOfYears = Integer.parseInt(br.readLine());
		Date date = new Date(1, 1, 1900, 1);
		while (date.day != 31 || date.month != 12 || date.year != 1899 + numberOfYears) {
			if(date.day == 13) {
				results.put(date.weekday, results.get(date.weekday) + 1);
			}
			date.iterateDay();
		}
		
		for(int i=1;i<7;i++) {
			out.print(results.get((i+4) % 7 + 1) + " ");
		}
		out.print(results.get(5) + "\n");
		
		out.close();
	}
}
