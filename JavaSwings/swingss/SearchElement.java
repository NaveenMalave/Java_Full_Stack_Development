package swingss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class SearchElement extends JFrame {

	private JPanel contentPane;
	private JTextField textArray;
	private JTextField textKey;
	private JTextField textans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchElement frame = new SearchElement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	
	public SearchElement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayElem = new JLabel("Array Elements");
		lblArrayElem.setBounds(61, 34, 107, 14);
		contentPane.add(lblArrayElem);
		
		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(61, 74, 46, 14);
		contentPane.add(lblKey);
		
		textArray = new JTextField();
		textArray.setBounds(214, 31, 86, 20);
		contentPane.add(textArray);
		textArray.setColumns(10);
		
		textKey = new JTextField();
		textKey.setBounds(214, 71, 86, 20);
		contentPane.add(textKey);
		textKey.setColumns(10);
		
		JButton btnLinear = new JButton("Linear");
		btnLinear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] inputArray = textArray.getText().split(" ");
				int[] arr = new int[inputArray.length];
				int key = Integer.parseInt(textKey.getText());
				boolean found=false;
				for(int i =0;i<arr.length;i++) {
					arr[i]=Integer.parseInt(inputArray[i].trim());
				}
					for(int i=0;i<arr.length;i++) {
						if(arr[i]==key) {
							textans.setText("Key found at index: "+i);
							found=true;
							break;
						}
					}
					if(!found) {
						 textans.setText(Integer.toString(-1));
						}
				}
			
		});
		btnLinear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLinear.setBounds(56, 117, 89, 23);
		contentPane.add(btnLinear);
		
		JButton btnBinary = new JButton("Binary");
		btnBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] inputArray = textArray.getText().split(" ");
				int[] arr = new int[inputArray.length];
				for(int i =0;i<arr.length;i++) {
					arr[i]=Integer.parseInt(inputArray[i].trim());
				}
				Arrays.sort(arr);
				int key = Integer.parseInt(textKey.getText());
				int low = 0;
				int high = arr.length-1;
				boolean found=false;
				while(low<=high) {
					int mid = low+high/2;
					if(key==arr[mid]) {
						textans.setText("Key found at index: "+mid);
						found=true;
						break;
					}else if(key>arr[mid]) {
						low = mid+1;
					}else {
						high = mid-1;
					}
				}
				if(!found) {
				 textans.setText(Integer.toString(-1));
				}
			}
			
		});
		btnBinary.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBinary.setBounds(214, 118, 89, 23);
		contentPane.add(btnBinary);
		
		JLabel lblKeyFound = new JLabel("Key at");
		lblKeyFound.setBounds(61, 168, 46, 14);
		contentPane.add(lblKeyFound);
		
		textans = new JTextField();
		textans.setBounds(125, 165, 178, 20);
		contentPane.add(textans);
		textans.setColumns(10);
	}
}
