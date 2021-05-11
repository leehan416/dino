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
	
	public void Jump() {
		
		dinoX = (float) (jump * Math.sin(jumpX));
		jumpX += .6f;
		
		if (isjumping) {
			
		} else {
			
		}
	}

}
