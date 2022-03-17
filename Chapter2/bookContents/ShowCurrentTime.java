package bookContents;
// This program displays the current time in GMT, eastern, central, mountain and pacific time zones. It uses as reference the Unix time (Unix epoch) and calculates the time from that origin.
public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		long easternHours = currentHours - 5;
		long centralHours = currentHours - 6;
		long mountainHours = currentHours - 7;
		long pacificHours = currentHours - 8;
		
		System.out.println("GMT " + currentHours + ":" + currentMinutes + ":" + currentSeconds );
		System.out.println();
		System.out.println("Eastern " + easternHours + ":" + currentMinutes + ":" + currentSeconds);
		System.out.println();
		System.out.println("Central " + centralHours + ":" + currentMinutes + ":" + currentSeconds);
		System.out.println();
		System.out.println("Mountain " + mountainHours + ":" + currentMinutes + ":" + currentSeconds);
		System.out.println();
		System.out.println("Pacific " + pacificHours + ":" + currentMinutes + ":" + currentSeconds);
	}
}
