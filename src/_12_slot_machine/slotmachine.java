package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
JButton button=new JButton();
public void setup(){
	label.add(button);
	label.setText("Slot Machine");
	panel.add(label);
	frame.setSize(100,100);
	frame.add(frame);
	button.setText("Spin");
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
private void showPictureFromTheInternet (String imageUrl) {
	try {
		URL url=new URL(imageUrl);
		Icon icon=new ImageIcon(url);
		JLabel imageLabel=new JLabel(icon);
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
		
	}
	catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}
