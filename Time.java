public class Time {
	private int hour = 10, minute = 54, second = 36;

	public void secAftMid() {
		System.out.println("The number of seconds since midnight equals " + ((hour*3600) + ((minute)*60) + second + "."));
	}

	public void secRmngDay() {
		System.out.println("The number of seconds remaining in the day equals " + (((24 - hour)*3600) + ((60 - minute)*60) + (60 - second) + "."));
	}

	public void prctDay() {
		System.out.println("The percentage of the day that has passed equals " + (((hour*3600) + ((minute)*60) + second)/864 + "%."));
	}

	public static void main(String[] args) {
		Time myTime = new Time();
		myTime.secAftMid();
		myTime.secRmngDay();
		myTime.prctDay();
	}
}