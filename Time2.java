public class Time2 {
	
	public static void secAftMid(int h, int m, int s) {
		System.out.println("The number of seconds since midnight equals " + ((h*3600) + ((m)*60) + s + "."));
	}

	public static void secRmngDay(int h, int m, int s) {
		System.out.println("The number of seconds remaining in the day equals " + (((24 - h)*3600) + ((60 - m)*60) + (60 - s) + "."));
	}

	public static void prctDay(int h, int m, int s) {
		System.out.println("The percentage of the day that has passed equals " + (((h*3600) + ((m)*60) + s)/864 + "%."));
	}

	public static void main(String[] args) {
		secAftMid(22, 26, 36);
		secRmngDay(22, 26, 36);
		prctDay(22, 26, 36);
	}
}