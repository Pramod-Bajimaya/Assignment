package ClassAssignment;

public class Player {
	String name;
	int pj;

	Player(String name, int pj) {
		this.name = name;
		this.pj = pj;
	}

	public void display() {
		System.out.println("player name is: " + this.name);
		System.out.println("player pj no is: " + this.pj);
	}

	public static void main(String[] args) {
		Player p1 = new Player("Messi", 10);
		Player p2 = new Player("Neymar", 20);
		p1.display();
		p2.display();
	}
}