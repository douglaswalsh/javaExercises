package codingBatPractice;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.lang.Math;
import java.time.Month;
import java.util.Date;

public class CodingBat {

	public static void main(String[] args) {
		Yacht yacht = new Yacht(new int[]{ 5, 5, 5, 5, 5 }, YachtCategory.YACHT);
		System.out.println(yacht.score());
		
		
		//System.out.println(d.computeSumOfSquaresTo(10));
		//System.out.println(d.computeDifferenceOfSquares(5));
		
		/*dates stuff 
		 * long Gigasecond = (long) Math.pow(10, 9);
		 
		LocalDate myDate = LocalDate.of(2011, Month.APRIL, 25);
		System.out.println("my Date="+myDate);
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		//c.set(myDate.getYear(),myDate.getMonthValue(), myDate.getDayOfMonth());
		//c.add(Calendar.SECOND, (int) Gigasecond);
		c.set(1977, 6 ,13);
		c2.set(2009,2,19);
		System.out.println(" Date="+c.getTime());
		System.out.printf("now:, %s%n", LocalDateTime.now());
		//LocalDateTime t = LocalDateTime.of(2011, Month.APRIL,25);
		//LocalDateTime a = t.plusSeconds(Gigasecond);
		//System.out.println(a);
		
		
		Long seconds =  (c2.getTimeInMillis() - c.getTimeInMillis())/1000;
		System.out.println(seconds);
		System.out.println(Gigasecond);
		Long difference = Gigasecond - seconds;
		System.out.println((difference/60)/60);*/
		
	}
}

