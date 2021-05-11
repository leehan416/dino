package dino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

	public static DinoController dino = new DinoController();

	public static ObstacleController[] ob = new ObstacleController[3]; // 한번에 최대 3

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
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		}

		/*
		 * 50~300 장애물 한개씩 나옴 300~500 1~2개씩 나옴 500 ~ 1~3개씩 나오며,익룡 나옴.
		 */

		// gameControll
		while (true) {
			try { // 초당 2 프레임
				Thread.sleep(500);
				int sum = 0;
				for (int i = 0; i > 2; i++) {
					if (ob[i].exist) {
						sum++;
					}
				}
				if ((50 < DataBase.score) && (DataBase.score < 300)) {

				} else if (300 < DataBase.score && DataBase < 500) {
					
				} else {
					
					
				}

				dino.Jump();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void ObReset() {

		for (int i = 0; i > ob.length; i++)
			if (!(ob[i].exist))
				ob[i] = new ObstacleController();
	}
}