import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	
	static int tal1 = 25;
	static int tal2 = 5;
	

	private GUI() {

		JFrame frame = new JFrame();
		ImageIcon img = new ImageIcon("src/schweiz.jpg");

		JLabel label = new JLabel(tal1 + " / " + tal2 + " = ? ");
		//JLabel label2 = new JLabel(intSvar);
		label.setFont(new Font("Verdana", Font.PLAIN, 24));
		JButton button = new JButton("Calculate");
		button.addActionListener(this);

		JPanel panel = new JPanel();
		math();

		panel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
		panel.setLayout(new GridLayout(0, 1));
		frame.setIconImage(img.getImage());

		panel.add(label);
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Math & Stuff");
		frame.pack();
		frame.setVisible(true);

	}

	static int math() {
		
		int svar = tal1 / tal2;
		System.out.println(svar);
		return svar;

	}

	public static void main(String[] args) {

		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		math();
	}

}
