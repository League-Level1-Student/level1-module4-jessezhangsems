package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class whacking {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
JButton molebutton;
public void drawButton(int yesbutton){
for (int i = 0; i < 9; i++) {
	JButton button=new JButton();
	panel.add(button);
	if (i==yesbutton) {
		molebutton=button;
		
	}
}	
}

public void setup() {
	frame.setVisible(true);
	frame.setSize(100,100);
	label.setText("lol whack moles and stuff");
	
	frame.add(panel);
	panel.add(label);
	
}
}
