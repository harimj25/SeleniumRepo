package week3.day1;

public class Mypad extends Ipad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad call =new Ipad();
		call.watchmovie();
		call.watchmovie("Watching movie");
		call.watchmovie( "Watching movie timeouts",60);
	}

}
