package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {

	JTextField pan, aadhar;
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	JComboBox religion, category, occupation, education, income;
	String formno;

	SignupTwo(String formno) {

		this.formno = formno;
		setLayout(null);

		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);

		JLabel Name = new JLabel("Religion:");
		Name.setFont(new Font("Raleway", Font.BOLD, 20));
		Name.setBounds(110, 140, 100, 30);
		add(Name);

		String valReligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
		religion = new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.white);
		add(religion);

		JLabel Fname = new JLabel(" Category:");
		Fname.setFont(new Font("Raleway", Font.BOLD, 20));
		Fname.setBounds(100, 190, 200, 30);
		add(Fname);

		String valCategory[] = { "General", "OBC", "SC", "ST", "Open", "Other" };
		category = new JComboBox(valCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.white);
		add(category);

		JLabel DOB = new JLabel(" Income:");
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		DOB.setBounds(100, 240, 200, 30);
		add(DOB);

		String valIncome[] = { "Null", "< 1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000" };
		income = new JComboBox(valIncome);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.white);
		add(income);

//		JTextField DOBTextField = new JTextField();
//		DOBTextField.setFont(new Font("Raleway",Font.BOLD, 14));
//		DOBTextField.setBounds(300, 240, 400, 30);
//		add(DOBTextField);

		JLabel gender = new JLabel(" Educational");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		JLabel email = new JLabel(" Qualification :");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 315, 200, 30);
		add(email);

		String valEducational[] = { "Non-Graduate", "Graduate", "Post Graduation", "Doctarate", "Other" };
		education = new JComboBox(valEducational);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.white);
		add(education);

		JLabel marital = new JLabel(" Occupation:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);

		String valOccupation[] = { "Salaried", "Self Employed", "Business", "Student", "Retired", "Others" };
		occupation = new JComboBox(valOccupation);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.white);
		add(occupation);

//		married= new JRadioButton("Married");
//		 married.setBounds(300, 390, 100, 30);
//		 married.setBackground(Color.white);
//		add( married);
//		
//		unmarried= new JRadioButton("Unmarried");
//		unmarried.setBounds(450, 390, 120, 30);
//		unmarried.setBackground(Color.white);
//		add(unmarried);
//		
//		other= new JRadioButton("Other");
//		other.setBounds(630, 390, 100, 30);
//		other.setBackground(Color.white);
//		add(other);
//		
//		ButtonGroup marritalgroup = new ButtonGroup();
//		marritalgroup.add(married);
//		marritalgroup.add(unmarried);
//		marritalgroup.add(other);

//		JTextField maritalTextField = new JTextField();
//		maritalTextField.setFont(new Font("Raleway",Font.BOLD, 14));
//		maritalTextField.setBounds(300, 390, 400, 30);
//		add(maritalTextField);

		JLabel address = new JLabel(" Pan Number:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);

		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);

		JLabel city = new JLabel(" Adhar Number:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);

		JLabel state = new JLabel(" Senior citizen:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);

		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.white);
		add(syes);

		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 120, 30);
		sno.setBackground(Color.white);
		add(sno);

		ButtonGroup smarritalgroup = new ButtonGroup();
		smarritalgroup.add(syes);
		smarritalgroup.add(sno);

		JLabel pincode = new JLabel(" Existing Account:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);

		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.white);
		add(eyes);

		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 120, 30);
		eno.setBackground(Color.white);
		add(eno);

		ButtonGroup emarritalgroup = new ButtonGroup();
		emarritalgroup.add(eyes);
		emarritalgroup.add(eno);

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

		String sreligion = (String) religion.getSelectedItem();
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();

		String seniorcitizen = null;
		if (syes.isSelected()) {
			seniorcitizen = "Yes";
		} else if (sno.isSelected()) {
			seniorcitizen = "No";
		}

		String existingaccount = null;
		if (eyes.isSelected()) {
			existingaccount = "Yes";
		} else if (eno.isSelected()) {
			existingaccount = "No";
		}

		String span = pan.getText();
		String saadhar = aadhar.getText();

		try {

			Conn c = new Conn();
			String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '"
					+ sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '"
					+ seniorcitizen + "', '" + existingaccount + "')";
			c.s.executeUpdate(query);

			// Signup object

			setVisible(false);
			new SignupThree(formno).setVisible(true);

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		new SignupTwo("");
	}

}
