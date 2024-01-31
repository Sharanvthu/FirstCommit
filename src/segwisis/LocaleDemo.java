package segwisis;

import java.util.Calendar;
import java.util.Locale;

public class LocaleDemo {
//	public static String getDay(int month,int day,int year)
//	{	
//		Locale locale=Locale.getDefault();
//		Calendar calendar=Calendar.getInstance();
//		calendar.set(year, month-1, day);
//		return (calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale).toUpperCase());
//
//	}
	public static void main(String[] args)  {

//		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//	        int month = Integer.parseInt(firstMultipleInput[0]);
//
//	        int day = Integer.parseInt(firstMultipleInput[1]);
//
//	        int year = Integer.parseInt(firstMultipleInput[2]);
		Locale locale=Locale.getDefault();
		System.out.println(locale.getLanguage());
		Calendar calendar=Calendar.getInstance();
		
//		calendar.set(1997, 8-1, 21);
		System.out.println(calendar.getWeekYear());
		System.out.println(calendar.getTime());
		String res = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
//
//	        System.out.println(calendar.);
//
//	        bufferedWriter.write(res);
//	        bufferedWriter.newLine();
//
//	        bufferedReader.close();
//	        bufferedWriter.close();
System.out.println(res);
	}

}
