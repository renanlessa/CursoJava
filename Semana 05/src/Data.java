import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		
		System.out.println(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data));
		
		Date exemplo = sdf.parse("20/01/1988");
		
		System.out.println(exemplo);
		
		Calendar cal = Calendar.getInstance();		
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE, 30);
		cal.add(Calendar.MINUTE, 30);
		
		System.out.println(cal.getTime());
	}
}