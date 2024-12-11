import java.util.Scanner;
// Zaiah Nance
public class Zaiah_ZodiacSign {
	public static void main(String[] args) {
		System.out.println("What is your Zodiac sign? Enter your birthday -- Month followed by Day as numbers");
		Scanner keyboard = new Scanner(System.in);
		// This will be used to scan keyboard inputs for day and month ints
		int Month = keyboard.nextInt();
		// This represents month of the year and should be a positive integer between 1 and 12
		int Day = keyboard.nextInt();
		// This represents day of the year and should be a positive integer between 1 and 28,29,30,31 depending on month
		if(Month == 1) {
			if(Day >= 1 && Day <= 19)
				System.out.println("You are a Capricorn!");
			else if(Day >= 20 && Day <= 31)
				System.out.println("You are an Aquarius!");
			// This checks the input to see if it's between the days of 1 and 19/20 and 31, then prints out the respective sign
			else
				System.out.println("Invalid day");
			// If the input is any other day, it prints Invalid day
		}
		else if(Month == 2) {
			if(Day >= 1 && Day <= 18)
				System.out.println("You are an Aquarius!");
			else if(Day >= 19 && Day <= 29)
				System.out.println("You are a Pisces!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 3) {
			if(Day >= 1 && Day <= 20)
				System.out.println("You are a Pisces!");
			else if(Day >= 21 && Day <= 31)
				System.out.println("You are an Aries!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 4) {
			if(Day >= 1 && Day <= 19)
				System.out.println("You are an Aries!");
			else if(Day >= 20 && Day <= 30)
				System.out.println("You are a Taurus!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 5) {
			if(Day >= 1 && Day <= 20)
				System.out.println("You are a Taurus!");
			else if(Day >= 21 && Day <= 31)
				System.out.println("You are a Gemini!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 6) {
			if(Day >= 1 && Day <= 20)
				System.out.println("You are a Gemini!");
			else if(Day >= 21 && Day <= 30)
				System.out.println("You are a Cancer!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 7) {
			if(Day >= 1 && Day <= 22)
				System.out.println("You are a Cancer!");
			else if(Day >= 23 && Day <= 31)
				System.out.println("You are a Leo!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 8) {
			if(Day >= 1 && Day <= 22)
				System.out.println("You are a Leo!");
			else if(Day >= 23 && Day <= 31)
				System.out.println("You are a Virgo!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 9) {
			if(Day >= 1 && Day <= 22)
				System.out.println("You are a Virgo!");
			else if(Day >= 23 && Day <= 30)
				System.out.println("You are a Libra!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 10) {
			if(Day >= 1 && Day <= 22)
				System.out.println("You are a Libra!");
			else if(Day >= 23 && Day <= 31)
				System.out.println("You are a Scorpio!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 11) {
			if(Day >= 1 && Day <= 21)
				System.out.println("You are a Scorpio!");
			else if(Day >= 22 && Day <= 30)
				System.out.println("You are a Sagittarius!");
			else
				System.out.println("Invalid day");
		}
		else if(Month == 12) {
			if(Day >= 1 && Day <= 21)
				System.out.println("You are a Sagittarius!");
			else if(Day >= 22 && Day <= 31)
				System.out.println("You are a Capricorn!");
			else
				System.out.println("Invalid day");
		}
		else
			System.out.println("Invalid month");
		// If integer is not between 1 and 12, print Invalid month
		keyboard.close();
		
	}

}
