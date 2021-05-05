package dino;

public class Main {
	public static void main(String[] args) {
		System.out.println("test");
		Ui ui = new Ui();
		DinoController dino = new DinoController();
		
		
		//gameControll
		while(true) {
			try { // 초당 2 프레임
				Thread.sleep(500);
				
				dino.Jump();
				
				dino.Move();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
