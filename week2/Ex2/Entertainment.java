public class Entertainment {

	public static void main(String[] args) {
		Film film = new Film("Titanic", "James Cameron", "James Cameron", 2234);
		Play play = new Play("Bus Stop", "Harnold Clurman", "William Inge", 478);
		
		film.display();
		System.out.println();
		play.display();
	}

}
