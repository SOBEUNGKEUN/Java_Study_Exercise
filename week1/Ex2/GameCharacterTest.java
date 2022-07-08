public class GameCharacterTest {
	public static void main(String []args) {
		GameCharacter ch = new GameCharacter();
		ch.add("sword", 1, 100);
		ch.add("gun", 2, 50);
		ch.print();
	}
}
