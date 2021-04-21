package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label=new JLabel();
    char currentLetter;
public void setup() {
	
       
        currentLetter = generateRandomLetter();
        label.setText(currentLetter+"");
        frame.setVisible(true);
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.addKeyListener(this);
        panel.add(label);
        frame.add(panel);
        frame.pack();
        
        }


	// TODO Auto-generated method stub
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

