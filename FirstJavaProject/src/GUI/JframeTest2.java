package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JframeTest2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.setSize(new Dimension(500,350));
		frame.setLocation(new Point(200,100));
		frame.setTitle("Window Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setIconImage(new ImageIcon("src/icon.jpg").getImage());
		
		frame.setLayout(new BorderLayout());
		
		JButton btnLogin = new JButton();
		btnLogin.setText("Login Button");
		btnLogin.setBackground(Color.pink);
		
		frame.add(btnLogin,BorderLayout.EAST);
		
		JButton btncancel = new JButton();
		btncancel.setText("Cancel");
		btncancel.setBackground(Color.red);
		
		frame.add(btncancel,BorderLayout.NORTH);
		
		JTextField txtname = new JTextField();
		txtname.setText("      Admin User");
		txtname.setColumns(10);
		txtname.setBackground(Color.yellow);
		frame.add(txtname, BorderLayout.WEST);
		

		JButton btnok = new JButton();
		btnok.setText("OK");
		btnok.setBackground(Color.green);
		
		frame.add(btnok,BorderLayout.SOUTH);
		
		JButton btnclick = new JButton();
		btnclick.setText("Click Me");
		btnclick.setBackground(Color.CYAN);
		
		frame.add(btnclick,BorderLayout.CENTER);
		
		

	}

}
