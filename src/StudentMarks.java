import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class StudentMarks {

	private JFrame frame;
	private JTextField Sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1131, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(
				new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(192, 192, 192), null, null));
		panel.setBounds(23, 50, 990, 644);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Marks Calculation System ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(360, 30, 327, 33);
		panel.add(lblNewLabel);

		JLabel lblSubject = new JLabel("Subject 1");
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject.setBounds(170, 111, 154, 33);
		panel.add(lblSubject);

		JLabel lblSubject_2 = new JLabel("Subject 2");
		lblSubject_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject_2.setBounds(170, 186, 154, 33);
		panel.add(lblSubject_2);

		JLabel lblSubject_2_1 = new JLabel("Subject 3");
		lblSubject_2_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject_2_1.setBounds(170, 259, 154, 33);
		panel.add(lblSubject_2_1);

		JLabel lblSubject_2_1_1 = new JLabel("Total Marks");
		lblSubject_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject_2_1_1.setBounds(170, 344, 154, 33);
		panel.add(lblSubject_2_1_1);

		JLabel lblSubject_2_1_1_1 = new JLabel("Average");
		lblSubject_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject_2_1_1_1.setBounds(170, 434, 154, 33);
		panel.add(lblSubject_2_1_1_1);

		JLabel lblSubject_2_1_1_1_1 = new JLabel("Grade");
		lblSubject_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSubject_2_1_1_1_1.setBounds(170, 522, 154, 33);
		panel.add(lblSubject_2_1_1_1_1);

		Sub1 = new JTextField();
		Sub1.setBounds(462, 118, 120, 25);
		panel.add(Sub1);
		Sub1.setColumns(10);

		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(462, 193, 120, 25);
		panel.add(sub2);

		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(462, 266, 120, 25);
		panel.add(sub3);

		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(462, 351, 120, 25);
		panel.add(totalmarks);

		average = new JTextField();
		average.setColumns(10);
		average.setBounds(462, 441, 120, 25);
		panel.add(average);

		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(462, 529, 120, 25);
		panel.add(grade);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int s1 = Integer.parseInt(Sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				int total = s1 + s2 + s3;
				float avg = total / 3;

				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));

				if (avg > 45) {
					grade.setText("Passed");
				} else {
					grade.setText("Failed");
				}

			}
		});
		btnAdd.setBackground(new Color(215, 255, 255));
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBounds(763, 186, 112, 62);
		panel.add(btnAdd);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				totalmarks.setText("");
				average.setText("");
				grade.setText("");
				Sub1.requestFocus();
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnClear.setBackground(new Color(215, 255, 255));
		btnClear.setBounds(763, 304, 112, 62);
		panel.add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBackground(new Color(215, 255, 255));
		btnExit.setBounds(763, 420, 112, 62);
		panel.add(btnExit);
	}
}
