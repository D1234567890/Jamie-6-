import java.util.Calendar;

public class TimeIndex {
	Calendar time;

	String getTime() {
		time = Calendar.getInstance();
		String whatTime = time.getTime().toString();
		return whatTime;
	}
}