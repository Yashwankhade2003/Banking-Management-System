package bank_management_system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {

	JPasswordField pin, repin;
	JButton change, back;
	String pinnumber;

	PinChange(String pinnumber) {

		this.pinnumber = pinnumber;
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		JLabel text = new JLabel("Change Your Pin");
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD, 16));
		text.setBounds(250, 280, 500, 20);
		image.add(text);

		JLabel pintext = new JLabel("New Pin");
		pintext.setForeground(Color.white);
		pintext.setFont(new Font("System", Font.BOLD, 16));
		pintext.setBounds(165, 320, 180, 20);
		image.add(pintext);

		pin = new JPasswordField();
		pin.setFont(new Font("Raleway", Font.BOLD, 25));
		pin.setBounds(330, 320, 180, 25);
		image.add(pin);

		JLabel repintext = new JLabel("Re-enter New Pin");
		repintext.setForeground(Color.white);
		repintext.setFont(new Font("System", Font.BOLD, 16));
		repintext.setBounds(165, 360, 180, 20);
		image.add(repintext);

		repin = new JPasswordField();
		repin.setFont(new Font("Raleway", Font.BOLD, 25));
		repin.setBounds(330, 360, 180, 25);
		image.add(repin);

		change = new JButton("Change");
		change.setBounds(355, 485, 150, 30);
		change.addActionListener(this);
		image.add(change);

		back = new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);

		setSize(900, 900);
		setLocation(300, 0);
//		setUndecorated(true);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == change) {

			try {

				String npin = pin.getText();
				String rpin = repin.getText();

				if (!npin.equals(rpin)) {

					JOptionPane.showMessageDialog(null, "Entered Pin does not matched !!!");
					return;
				}

				if (npin.equals("")) {

					JOptionPane.showMessageDialog(null, "Please Enter New Pin");
					return;
				}

				if (rpin.equals("")) {

					JOptionPane.showMessageDialog(null, "Please Re-enter New Pin");
					return;
				}

				Conn conn = new Conn();
				String query1 = "update bank set pin = '" + rpin + "' where pin='" + pinnumber + "'";
				String query2 = "update login set pin = '" + rpin + "' where pin='" + pinnumber + "'";
				String query3 = "update signupthree set pin = '" + rpin + "' where pin='" + pinnumber + "'";

				conn.s.executeUpdate(query1);
				conn.s.executeUpdate(query2);
				conn.s.executeUpdate(query3);

				JOptionPane.showMessageDialog(null, "Pin Chnaged Successfully!!");

				setVisible(false);
				new Transictions(rpin).setVisible(true);

			} catch (Exception e) {

				System.out.println(e);
			}

		} else {

			setVisible(false);
			new Transictions(pinnumber).setVisible(true);
		}

	}

	public static void main(String[] args) {

		new PinChange("").setVisible(true);
	}
}
