package main;

import javax.swing.JFrame;

public class UNIPACMAN extends JFrame{

	public UNIPACMAN() {
		add(new MAINSCRIPT());
	}
        
	public static void main(String[] args) {
		UNIPACMAN pac = new UNIPACMAN();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
