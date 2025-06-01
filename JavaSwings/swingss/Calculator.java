package swingss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel Calculator;
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
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Calculator = new JPanel();
		Calculator.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Num1");
		lblNum1.setBounds(76, 35, 46, 14);
		Calculator.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setBounds(76, 80, 46, 14);
		Calculator.add(lblNum2);
		
		JLabel lblAns = new JLabel("Ans");
		lblAns.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAns.setBounds(76, 122, 46, 14);
		Calculator.add(lblAns);
		
		textNum1 = new JTextField();
		textNum1.setBounds(235, 32, 86, 20);
		Calculator.add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(235, 77, 86, 20);
		Calculator.add(textNum2);
		textNum2.setColumns(10);
		
		textAns = new JTextField();
		textAns.setBounds(235, 120, 86, 20);
		Calculator.add(textAns);
		textAns.setColumns(10);
		
		JButton btnSum = new JButton("Sum");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1= Integer.parseInt(textNum1.getText());
				num2= Integer.parseInt(textNum2.getText());
				ans=num1+num2;
				textAns.setText(Integer.toString(ans));
				
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSum.setBounds(33, 173, 67, 23);
		Calculator.add(btnSum);
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1= Integer.parseInt(textNum1.getText());
				num2= Integer.parseInt(textNum2.getText());
				ans=num1-num2;
				textAns.setText(Integer.toString(ans));
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSub.setBounds(120, 173, 60, 24);
		Calculator.add(btnSub);
		
		JButton btnMul = new JButton("Mul");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1= Integer.parseInt(textNum1.getText());
				num2= Integer.parseInt(textNum2.getText());
				ans=num1*num2;
				textAns.setText(Integer.toString(ans));
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMul.setBounds(217, 174, 60, 23);
		Calculator.add(btnMul);
		
		JButton btnDiv = new JButton("Div");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1= Integer.parseInt(textNum1.getText());
				num2= Integer.parseInt(textNum2.getText());
				ans=num1/num2;
				textAns.setText(Integer.toString(ans));
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDiv.setBounds(296, 174, 67, 23);
		Calculator.add(btnDiv);
	}

}
