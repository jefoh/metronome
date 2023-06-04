import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI extends JFrame implements ChangeListener {
    
    ImageIcon image;
    JSlider slider;
    JLabel sliderLabel;
    JPanel panel;
	
	GUI() {
    	this.setTitle("Metronome");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setResizable(false);
    	this.setSize(320,420);
    	this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
    	
    	image = new ImageIcon("src/music.png");
    	this.setIconImage(image.getImage());    	
    	
    	slider = new JSlider(20,200);
    	sliderLabel = new JLabel();
    	sliderLabel.setText("BPM: " + slider.getValue());
    	
    	slider.setPreferredSize(new Dimension(300,100));
    	//slider.setPaintTicks(true);
    	slider.setMinorTickSpacing(1);
    	slider.setPaintTrack(true);
    	slider.setMajorTickSpacing(25);    	
    	slider.setPaintLabels(true);
    	slider.setSnapToTicks(true);    	
    	slider.addChangeListener(this);
    	
    	panel = new JPanel();
    	//panel.setLayout(new GridLayout(3,1));
    	panel.add(slider);
    	panel.add(sliderLabel);
    	
    	this.add(panel);
    	this.setVisible(true);
	}

    @Override
    public void stateChanged(ChangeEvent e) {
        
       sliderLabel.setText("BPM: " + slider.getValue());
        
    }
}
