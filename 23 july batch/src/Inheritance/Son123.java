package Inheritance;

public class Son123 extends Son {
	
	public void game() {
		System.out.println("game");
	}
	protected void choclate () {
		System.out.println("choclate");
	}
	
	public static void main(String[] args) {
		
		
		Son123 z = new Son123();
		System.out.println(z.a);
		z.bike();
		z.car();
		z.choclate();
		z.dress();
		z.game();
		z.Home();
		z.money();
		z.pen();
		z.phone();
		
		
	}

}
