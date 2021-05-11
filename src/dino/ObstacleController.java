package dino;

import java.util.Random;

public class ObstacleController {

	Random random = new Random();
	
	public boolean exist = false;
	public int x;
	public int y;
	boolean type; // false = tree, true = flys.

	ObstacleController() {
		if (DataBase.score > 500) { // 500점 이상에서만 익룡 생성
			if (random.nextInt(2) == 1) { // fly
				type = false;
			} else { // tree
				type = true;
			}
		} else {
			type = true;
		}
		
		exist= true;
	}
}