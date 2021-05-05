package dino;

public class Main {
	public static void main(String[] args) {
		System.out.println("test");
		Ui ui = new Ui();
		
		
		
		//gameControll
		while(true) {
			try { // 초당 2 프레임
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
