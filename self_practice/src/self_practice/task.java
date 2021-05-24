package self_practice;

public class task {

	public static void main(String[] args) {
		int inputSeconds, hours, minutes, seconds;
        inputSeconds = 100000;
        hours = inputSeconds / (60 * 60);
        minutes = hours % 60;
        seconds = inputSeconds % 60;
        System.out.println("inputSecond is " + inputSeconds);
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	}

}
