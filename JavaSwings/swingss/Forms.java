package swingss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Forms extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewName;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forms frame = new Forms();
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
	public Forms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewName = new JLabel("Name");
		lblNewName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewName.setBounds(58, 44, 46, 14);
		contentPane.add(lblNewName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(231, 41, 86, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton btnNewSubmit = new JButton("Submit");
		btnNewSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewSubmit.setBounds(73, 138, 89, 23);
		contentPane.add(btnNewSubmit);
	}
}
