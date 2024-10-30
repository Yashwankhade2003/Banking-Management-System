package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

	long random;
	JTextField nameTextField, FnameTextField, emailTextField, addressTextField, cityTextField, stateTextField,
			pincodeTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;

	SignupOne() {

		setLayout(null);

		Random ran = new Random();
		random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

		JLabel formno = new JLabel("Application Form No.  " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);

		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);

		JLabel Name = new JLabel("Name:");
		Name.setFont(new Font("Raleway", Font.BOLD, 20));
		Name.setBounds(110, 140, 100, 30);
		add(Name);

		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);

		JLabel Fname = new JLabel(" Middle Name:");
		Fname.setFont(new Font("Raleway", Font.BOLD, 20));
		Fname.setBounds(100, 190, 200, 30);
		add(Fname);

		FnameTextField = new JTextField();
		FnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		FnameTextField.setBounds(300, 190, 400, 30);
		add(FnameTextField);

		JLabel DOB = new JLabel(" Date of Birth:");
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		DOB.setBounds(100, 240, 200, 30);
		add(DOB);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

//		JTextField DOBTextField = new JTextField();
//		DOBTextField.setFont(new Font("Raleway",Font.BOLD, 14));
//		DOBTextField.setBounds(300, 240, 400, 30);
//		add(DOBTextField);

		JLabel gender = new JLabel(" Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.white);
		add(female);

		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);

//		JTextField genderTextField = new JTextField();
//		genderTextField.setFont(new Font("Raleway",Font.BOLD, 14));
//		genderTextField.setBounds(300, 290, 400, 30);
//		add(genderTextField);

		JLabel email = new JLabel(" Email :");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);

		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);

		JLabel marital = new JLabel(" Marital Status:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);

		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.white);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 120, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);

		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.white);
		add(other);

		ButtonGroup marritalgroup = new ButtonGroup();
		marritalgroup.add(married);
		marritalgroup.add(unmarried);
		marritalgroup.add(other);

//		JTextField maritalTextField = new JTextField();
//		maritalTextField.setFont(new Font("Raleway",Font.BOLD, 14));
//		maritalTextField.setBounds(300, 390, 400, 30);
//		add(maritalTextField);

		JLabel address = new JLabel(" Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);

		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);

		JLabel city = new JLabel(" City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);

		JLabel state = new JLabel(" State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);

		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);

		JLabel pincode = new JLabel(" Pin Code:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);

		pincodeTextField = new JTextField();
		pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pincodeTextField.setBounds(300, 590, 400, 30);
		add(pincodeTextField);

		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(Color.white);

		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		String formno = "" + random;
		String Name = nameTextField.getText();
		String Fname = FnameTextField.getText();
		String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if (female.isSelected()) {
			gender = "Female";
		}

		String email = emailTextField.getText();

		String marital = null;
		if (married.isSelected()) {
			marital = "married";
		} else if (unmarried.isSelected()) {
			marital = "Unmarried";
		} else if (other.isSelected()) {
			marital = "other";
		}

		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pincode = pincodeTextField.getText();

		try {
			if (Name.equals("")) {

				JOptionPane.showMessageDialog(null, "Name is Required");

			} else {

				Conn c = new Conn();
				String query = "insert into signup values('" + formno + "', '" + Name + "', '" + Fname + "', '" + DOB
						+ "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city
						+ "', '" + state + "', '" + pincode + "')";
				c.s.executeUpdate(query);

				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		new SignupOne();
	}

}
