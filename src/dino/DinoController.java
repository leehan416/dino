package dino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DinoController {

	public static float speed = 100f; 
	public static float jump = 100f; 
	
	
	
	
	class key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

			if (e.getKeyCode() == 38) {//위 
				System.out.println("!");
			} else if (e.getKeyCode() == 40) { // 아래 

			} 
		}

		@Override
		public void keyPressed(KeyEvent e) { }

		@Override
		public void keyReleased(KeyEvent e) { }

	}
}
