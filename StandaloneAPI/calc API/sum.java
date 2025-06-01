package calc;

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

public class sum extends JFrame {

	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField result;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btndiv;
	private JButton btnResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sum frame = new sum();
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
	public sum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnum1 = new JLabel("Num1");
		lblnum1.setBounds(44, 65, 58, 25);
		contentPane.add(lblnum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setBounds(44, 126, 46, 14);
		contentPane.add(lblNum2);
		
		Num1 = new JTextField();
		Num1.setBounds(166, 67, 109, 20);
		Num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Num1.setBackground(new Color(255, 128, 192));
		contentPane.add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(166, 123, 109, 20);
		Num2.setBackground(new Color(255, 128, 192));
		contentPane.add(Num2);
		Num2.setColumns(10);
		
		JButton btnSum = new JButton("Sum");
		btnSum.setBounds(23, 169, 89, 23);
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 ,ans;
				num1 =Integer.parseInt(Num1.getText());
				num2 = Integer.parseInt(Num2.getText());
				ans = num1 + num2;
				result.setText(Integer.toString(ans));
			}
		});
		btnSum.setBackground(new Color(0, 255, 128));
		contentPane.add(btnSum);
		
		result = new JTextField();
		result.setBounds(209, 230, 86, 20);
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		result.setBackground(new Color(0, 255, 128));
		contentPane.add(result);
		result.setColumns(10);
		
		btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 ,ans;
				num1 =Integer.parseInt(Num1.getText());
				num2 = Integer.parseInt(Num2.getText());
				ans = num1 - num2;
				result.setText(Integer.toString(ans));
			}
		});
		btnSub.setBackground(new Color(0, 255, 128));
		btnSub.setBounds(129, 169, 89, 23);
		contentPane.add(btnSub);
		
		btnMult = new JButton("Mult");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 ,ans;
				num1 =Integer.parseInt(Num1.getText());
				num2 = Integer.parseInt(Num2.getText());
				ans = num1 * num2;
				result.setText(Integer.toString(ans));
			}
		});
		btnMult.setBackground(new Color(0, 255, 128));
		btnMult.setBounds(239, 169, 89, 23);
		contentPane.add(btnMult);
		
		btndiv = new JButton("Div");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 ,ans;
				num1 =Integer.parseInt(Num1.getText());
				num2 = Integer.parseInt(Num2.getText());
				ans = num1 / num2;
				result.setText(Integer.toString(ans));
			}
		});
		btndiv.setBackground(new Color(0, 255, 128));
		btndiv.setBounds(338, 169, 89, 23);
		contentPane.add(btndiv);
		
		btnResult = new JButton("Result");
		btnResult.setBackground(new Color(0, 255, 128));
		btnResult.setBounds(55, 229, 89, 23);
		contentPane.add(btnResult);
	}
}
