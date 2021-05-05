package dino;

import javax.swing.JFrame;

public class Ui  {
	public static JFrame frame = new JFrame("Dino");
	
	
	Ui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720); // canvas 크기 조정
		frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		// frame.setVisible(true);
	}

}
