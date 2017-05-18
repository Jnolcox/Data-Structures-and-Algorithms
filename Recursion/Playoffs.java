/*
  Class assignment to determine amount of wins in a soccer game to make it
  to the playoffs using recursion.
*/

import java.util.Scanner;

public class Playoffs {
	public static void main(String[] args) {
//		int points = 0;
//		String record = "";
//		int game = 0;
//		
//		while (game < 5) {
//			points +=3;
//			record +="W";
//			game ++;
//		}
//		System.out.println(record + " " + points);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of games to be played: \r");
		int games = input.nextInt();
		
		System.out.println("Enter the points required to progress: \r");
		int cutoff = input.nextInt();
		
		
		games(0, 0, " ", games, cutoff);
	}
	
	
	
	public static void games(int p, int i, String r, int g, int entry) {
		
		if(i < g) {
			games( p+3, i+1, r+"W", g, entry);
			games( p+1, i+1, r+"T", g, entry);
			games( p, i+1, r+"L", g, entry);
		} else if (p > entry ) {
			System.out.println( r + " " + p);
		}
	}
}
