package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener {

	JTextField amount;
	JButton deposit, back;
	String pinnumber;

	Deposit(String pinnumber) {

		this.pinnumber = pinnumber;

		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		JLabel text = new JLabel("Enter the Amount you want to deposite");
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD, 16));
		text.setBounds(190, 300, 400, 20);
		image.add(text);

		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 22));
		amount.setBounds(170, 350, 120, 25);
		image.add(amount);

		// Button

		deposit = new JButton("Deposit");
		deposit.setBounds(355, 450, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);

		back = new JButton("Back");
		back.setBounds(355, 490, 150, 30);
		back.addActionListener(this);
		image.add(back);

		setSize(900, 900);
		setLocation(300, 0);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == deposit) {

			String number = amount.getText();
			java.util.Date utilDate = new java.util.Date(); // Get the current date
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());

			if (number.equals("")) {

				JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to deposite");
			} else {

				try {

					Conn conn = new Conn();
					String query = "insert into bank values('" + pinnumber + "', '" + sqlDate + "', '" + timestamp
							+ "',  'Deposit', '" + number + "')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs " + number + "Deposited Successfully");
					setVisible(false);
					new Transictions(pinnumber).setVisible(true);

				} catch (Exception e) {

					System.out.println(e);
				}
			}

		} else if (ae.getSource() == back) {

			setVisible(true);
			new Transictions(pinnumber).setVisible(true);
		}
	}

	public static void main(String[] args) {

		new Deposit("");
	}
}
