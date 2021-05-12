package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatin implements ActionListener {
JFrame frame=new JFrame(); 
JPanel panel=new JPanel();
JLabel label=new JLabel();
JTextField textfield=new JTextField(10);
JTextField exitfield=new JTextField(10); 
JButton translate=new JButton();


public void setup() {
	frame.setVisible(true);
	label.setText("Pig Latin Translator");
	panel.add(label);
	panel.add(textfield);
	panel.add(exitfield);
	panel.add(translate);
	translate.addActionListener(this);
	frame.pack();
	
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

}