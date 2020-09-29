package assignment3_arithmeticOperators;

public class Question5 {

	public static void main(String[] args) {
		
		int inputSeconds,hours,minutes,seconds;
		inputSeconds = 3695;
		
		seconds = inputSeconds % 60;
		minutes = ((inputSeconds - seconds) / 60) %60;
		hours = (((inputSeconds - seconds) / 60) - minutes) / 60;
		
		System.out.println(hours+" hours, "+minutes+" minutes and "+seconds+" seconds");

	}

}
