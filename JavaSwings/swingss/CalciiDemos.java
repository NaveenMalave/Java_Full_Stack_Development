package swingss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalciiDemos extends JFrame {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField textAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalciiDemos frame = new CalciiDemos();
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
	public CalciiDemos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Num1");
		lblNum1.setBackground(new Color(255, 0, 0));
		lblNum1.setBounds(69, 69, 46, 14);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setBounds(69, 112, 46, 14);
		contentPane.add(lblNum2);
		
		textNum1 = new JTextField();
		textNum1.setBounds(212, 66, 86, 20);
		contentPane.add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(212, 119, 86, 20);
		contentPane.add(textNum2);
		textNum2.setColumns(10);
		
		JButton btnSum = new JButton("SUM");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2,ans;
				num1 = Integer.parseInt(textNum1.getText());
				num2 = Integer.parseInt(textNum2.getText());
				ans =num1+ num2;
				textAns.setText(Integer.toString(ans));
			}
		});
		btnSum.setBackground(new Color(255, 255, 128));
		btnSum.setForeground(new Color(255, 128, 128));
		btnSum.setBounds(69, 168, 89, 23);
		contentPane.add(btnSum);
		
		textAns = new JTextField();
		textAns.setBounds(212, 169, 86, 20);
		contentPane.add(textAns);
		textAns.setColumns(10);
	}
}
