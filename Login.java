package bank_management_system;

import javax.swing.*; // all swings function import in this code 
import java.awt.*; //for Image methods insert in code 
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

	JButton Login, Signup, Clear;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login() {

		setTitle("Automated teller machine");

		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));// insert the logo at this path
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // change the height and width of
																					// logo
		ImageIcon i3 = new ImageIcon(i2); // creating object for display changes in i2.
		JLabel label = new JLabel(i3); // we can IamageIcon insert in Jlable but we can not Image insert in Jlable
		label.setBounds(70, 10, 100, 100);// it is used for set the loaction of logo
		add(label);// if you want to icon insert in frame then it is used

		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osword", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel cardno = new JLabel("Card No.:");
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);

		cardTextField = new JTextField();
		cardTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cardTextField.setBounds(300, 150, 250, 30);
		add(cardTextField);

		JLabel pin = new JLabel("Pin:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);

		pinTextField = new JPasswordField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);

		Login = new JButton("Sign in");
		Login.setBounds(300, 300, 100, 30);
		Login.setBackground(Color.black);
		Login.setForeground(Color.white);
		Login.addActionListener(this);
		add(Login);

		Clear = new JButton("Clear");
		Clear.setBounds(430, 300, 100, 30);
		Clear.setBackground(Color.black);
		Clear.setForeground(Color.white);
		Clear.addActionListener(this);
		add(Clear);

		Signup = new JButton("Sign up");
		Signup.setBounds(300, 350, 230, 30);
		Signup.setBackground(Color.black);
		Signup.setForeground(Color.white);
		Signup.addActionListener(this);
		add(Signup);

		getContentPane().setBackground(Color.white); // change the background color of frame

		setSize(800, 480); // define the length and breath of frame
		setVisible(true); // for the visible frame
		setLocation(350, 200); // location of frame
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == Clear) {

			cardTextField.setText("");
			pinTextField.setText("");

		} else if (ae.getSource() == Login) {

			Conn conn = new Conn();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			String query = "select * from login where cardnumber='" + cardnumber + "' and pin= '" + pinnumber + "'";

			try {

				ResultSet rs = conn.s.executeQuery(query);

				if (rs.next()) {

					setVisible(false);
					new Transictions(pinnumber).setVisible(true);
				} else {

					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
				}

			} catch (Exception e) {

				System.out.println(e);
			}

		} else if (ae.getSource() == Signup) {

			setVisible(false);
			new SignupOne().setVisible(true);
		}

	}

	public static void main(String[] args) {

		new Login();
	}
}
