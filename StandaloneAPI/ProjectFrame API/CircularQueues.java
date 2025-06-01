package ProjectFrame;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class CircularQueues extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSize;
	private JTextField textFieldElement;
	private JTextField textFieldDisplay;
	
	private int[] queue;
	private int front = -1;
	private int rear = -1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueues() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircular = new JLabel("CircularQueue");
		lblCircular.setBounds(136, 14, 98, 14);
		contentPane.add(lblCircular);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(128, 255, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetQueue();
			}
		});
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setBounds(263, 26, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(39, 69, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblNewLabel = new JLabel("Enter Elements");
		lblNewLabel.setBounds(39, 106, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDisplay = new JLabel("Display");
		lblDisplay.setBounds(39, 146, 46, 14);
		contentPane.add(lblDisplay);
		
		textFieldSize = new JTextField();
		textFieldSize.setBackground(new Color(128, 255, 255));
		textFieldSize.setBounds(227, 66, 125, 20);
		contentPane.add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldElement = new JTextField();
		textFieldElement.setBackground(new Color(128, 255, 255));
		textFieldElement.setBounds(227, 103, 125, 20);
		contentPane.add(textFieldElement);
		textFieldElement.setColumns(10);
		
		textFieldDisplay = new JTextField();
		textFieldDisplay.setBackground(new Color(128, 255, 255));
		textFieldDisplay.setBounds(227, 143, 125, 20);
		contentPane.add(textFieldDisplay);
		textFieldDisplay.setColumns(10);
		
		JButton btnEnQueue = new JButton("EnQueue");
		btnEnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enqueue();
			}
		});
		btnEnQueue.setBackground(new Color(128, 255, 0));
		btnEnQueue.setBounds(10, 201, 89, 23);
		contentPane.add(btnEnQueue);
		
		JButton btnDeQueue = new JButton("DeQueue");
		btnDeQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dequeue();
			}
		});
		btnDeQueue.setBackground(new Color(128, 255, 0));
		btnDeQueue.setBounds(136, 201, 89, 23);
		contentPane.add(btnDeQueue);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayQueue();
			}
		});
		btnDisplay.setBackground(new Color(128, 255, 0));
		btnDisplay.setBounds(263, 201, 89, 23);
		contentPane.add(btnDisplay);
	}

	private void initializeQueue() {
		try {
			size = Integer.parseInt(textFieldSize.getText());
			queue = new int[size];
			front = -1;
			rear = -1;
			JOptionPane.showMessageDialog(this, "Queue initialized with size " + size);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Please enter a valid size");
		}
	}

	private void enqueue() {
		if (queue == null) {
			initializeQueue();
		}
		try {
			int element = Integer.parseInt(textFieldElement.getText());
			if ((rear + 1) % size == front) {
				JOptionPane.showMessageDialog(this, "Queue is full!");
			} else {
				if (front == -1) front = 0;
				rear = (rear + 1) % size;
				queue[rear] = element;
				JOptionPane.showMessageDialog(this, "Enqueued " + element);
			}
			textFieldElement.setText("");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Please enter a valid element");
		}
	}

	private void dequeue() {
		if (front == -1) {
			JOptionPane.showMessageDialog(this, "Queue is empty!");
		} else {
			JOptionPane.showMessageDialog(this, "Dequeued " + queue[front]);
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
		}
	}

	private void displayQueue() {
		if (front == -1) {
			textFieldDisplay.setText("Queue is empty");
		} else {
			StringBuilder displayText = new StringBuilder();
			int i = front;
			while (true) {
				displayText.append(queue[i]).append(" ");
				if (i == rear) break;
				i = (i + 1) % size;
			}
			textFieldDisplay.setText(displayText.toString());
		}
	}

	private void resetQueue() {
		queue = null;
		front = -1;
		rear = -1;
		size = 0;
		textFieldSize.setText("");
		textFieldElement.setText("");
		textFieldDisplay.setText("");
		JOptionPane.showMessageDialog(this, "Queue reset!");
	}
}

