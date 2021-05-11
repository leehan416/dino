package dino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DinoController {
	boolean isjumping = false;
	//float speed = 100f;
	
	float jumpX = 0; //점프 컨트롤 할때 필요한x
	float jump = 100f;

	float dinoX;
	float dinoY;
	
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
	public void Jump() {
		
		dinoX = (float) (jump * Math.sin(jumpX));
		jumpX += .6f;
		
		if (isjumping) {
			
		} else {
			
		}
	}

}
