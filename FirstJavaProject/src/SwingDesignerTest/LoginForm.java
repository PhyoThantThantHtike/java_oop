package SwingDesignerTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HNC\\Programming\\HNC JavaProject\\FirstJavaProjectHNC\\FirstJavaProject\\src\\icon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 342);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(178, 76, 121, 21);
		contentPane.add(lblUsername);
		
		txtusername = new JTextField();
		txtusername.setBounds(260, 77, 96, 19);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(178, 138, 72, 16);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Login successsful");
				
			}
		});
		btnLogin.setBackground(new Color(255, 218, 185));
		btnLogin.setBounds(151, 211, 85, 21);
		contentPane.add(btnLogin);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncancel.setBackground(new Color(255, 218, 185));
		btncancel.setBounds(293, 211, 85, 21);
		contentPane.add(btncancel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(260, 137, 96, 19);
		contentPane.add(passwordField);
	}
}
