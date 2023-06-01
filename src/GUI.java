import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	
	GUI() {
    	this.setTitle("Metronome");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setResizable(false);
    	this.setSize(320,420);
    	this.setVisible(true);
    	this.setLocationRelativeTo(null);
    	
    	ImageIcon image = new ImageIcon("src/music.png");
    	this.setIconImage(image.getImage());
    	
    	this.getContentPane().setBackground(Color.darkGray);
	}
}
