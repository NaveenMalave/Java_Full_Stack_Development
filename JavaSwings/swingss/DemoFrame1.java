package swingss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoFrame1 extends JFrame {
	private JTextField textAge;
	private JTextField textName;
	JLabel lblinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame1 frame = new DemoFrame1();
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
	public DemoFrame1() {
		setTitle("Demo Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAge = new JLabel("Enter Age");
		lblAge.setBounds(60, 100, 89, 14);
		contentPane.add(lblAge);
		
		JLabel lblName = new JLabel("Enter Name");
		lblName.setBounds(60, 33, 89, 14);
		contentPane.add(lblName);
		
		textAge = new JTextField();
		textAge.setBounds(243, 94, 97, 20);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textName.getText();
				int age = Integer.parseInt(textAge.getText());
				if(age>=18)
					lblinfo.setText(n+" You are eligible to Vote!");
				else
					lblinfo.setText(n+" You are not eligible to Vote!");
			}	
		});
		btnOK.setBounds(60, 211, 89, 23);
		contentPane.add(btnOK);
		
		textName = new JTextField();
		textName.setBounds(243, 30, 97, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				lblinfo.setText("");
			}
		});
		btnReset.setBounds(240, 211, 89, 23);
		contentPane.add(btnReset);
		
		 lblinfo = new JLabel("");
		 lblinfo.setBounds(44, 162, 296, 14);
		 contentPane.add(lblinfo);
	}
}
