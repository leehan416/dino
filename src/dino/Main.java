package dino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

	public static DinoController dino = new DinoController();

	public static ObstacleController[] ob = new ObstacleController[4]; // 한번에 최대 4

	public static void main(String[] args) {
		System.out.println("test");
		Ui ui = new Ui();

		class key implements KeyListener {

			@Override
			public void keyTyped(KeyEvent e) {

				if (e.getKeyCode() == 38) {// 위
					System.out.println("!");
				} else if (e.getKeyCode() == 40) { // 아래

				}
			}

			@Override
			public void keyPressed(KeyEvent e) { }

			@Override
			public void keyReleased(KeyEvent e) { }
		}

		// gameControll
		while (true) {
			try { // 초당 3 프레임
				Thread.sleep(300);

				dino.Jump();
				for (int i = 0; i < 4; i++) {
					
					if (ob[i].exist) {
						ob[i].distance += DataBase.speed;
						if (ob[i].distance >= DataBase.distance) {
							ob[i] = new ObstacleController();
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}