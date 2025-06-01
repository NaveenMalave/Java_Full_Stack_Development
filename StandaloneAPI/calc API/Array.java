package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArray = new JLabel("Array");
		lblArray.setForeground(new Color(128, 0, 0));
		lblArray.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblArray.setBounds(154, 11, 79, 27);
		contentPane.add(lblArray);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBackground(new Color(128, 128, 255));
		lblSize.setBounds(38, 58, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblindex = new JLabel("Index");
		lblindex.setBackground(new Color(240, 240, 240));
		lblindex.setForeground(new Color(0, 0, 0));
		lblindex.setBounds(38, 98, 46, 14);
		contentPane.add(lblindex);
		
		JLabel lblElement = new JLabel("Element");
		lblElement.setBackground(new Color(240, 240, 240));
		lblElement.setBounds(38, 142, 46, 14);
		contentPane.add(lblElement);
		
		textField = new JTextField();
		textField.setBounds(164, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 95, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 126, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnADD = new JButton("ADD");
		btnADD.setBackground(new Color(0, 255, 128));
		btnADD.setBounds(82, 174, 89, 23);
		contentPane.add(btnADD);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  try {
	                    int index = Integer.parseInt(f3.getText());

	                    // Delete (set to 0) if index is within bounds
	                    if (index >= 0 && index < size) {
	                        arr[index] = 0; // setting to 0 to simulate deletion
	                        f4.setText("Deleted element at index " + index);
	                    } else {
	                        f4.setText("Index out of bounds!");
	                    }
	                } catch (NumberFormatException ex) {
	                    f4.setText("Invalid input!");
	                }
	            }
			}
		});
		btnRemove.setBackground(new Color(0, 255, 128));
		btnRemove.setBounds(226, 174, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBackground(new Color(240, 240, 240));
		btnDisplay.setBounds(82, 227, 89, 23);
		contentPane.add(btnDisplay);
		
		textField_3 = new JTextField();
		textField_3.setBounds(229, 228, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
