/*
  Class assignment to determine amount of wins in a soccer game to make it
  to the playoffs using recursion.
*/

public class Playoffs {
	public static void main(String[] args) {
		int points = 0;
		String record = "";
		int game = 0;
		
		while (game < 5) {
			points +=3;
			record +="W";
			game ++;
		}
		//System.out.println(record + " " + points);
		
		games(0, " ", 0);
	}
	
	public static void games(int p, String r, int g) {
		if(g < 5) {
			games( p+3, r+"W", g+1 );
			games( p+1, r+"T", g+1 );
			games( p, r+"L", g+1 );
		} else if (p > 9 ) {
			System.out.println( r + " " + p);
		}
	}
}
