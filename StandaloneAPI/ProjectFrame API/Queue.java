package ProjectFrame;

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

public class Queue extends JFrame {

private JPanel contentPane;
private JTextField f1; // Input for queue size
private JTextField f2; // Input for element to push
private JTextField f3; // Output for displaying queue
private int[] queueArray; // Array to implement queue
private int size; // Size of the queue
private int front = -1; // Front pointer of the queue
private int rear = -1; // Rear pointer of the queue

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Queue frame = new Queue();
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
public Queue() {
setBackground(new Color(127, 255, 212));
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.GREEN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel Queuelbl = new JLabel("Queue");
Queuelbl.setBackground(new Color(153, 50, 204));
Queuelbl.setFont(new Font("Tahoma", Font.BOLD, 13));
Queuelbl.setBounds(159, 10, 81, 28);
contentPane.add(Queuelbl);

JLabel lblSize = new JLabel("Enter Size");
lblSize.setFont(new Font("Tahoma", Font.BOLD, 13));
lblSize.setBackground(new Color(153, 50, 204));
lblSize.setBounds(50, 58, 81, 28);
contentPane.add(lblSize);

JLabel lblEnterElement = new JLabel("Enter Element");
lblEnterElement.setFont(new Font("Tahoma", Font.BOLD, 13));
lblEnterElement.setBackground(new Color(153, 50, 204));
lblEnterElement.setBounds(36, 104, 101, 28);
contentPane.add(lblEnterElement);

JLabel lblDisplay = new JLabel("Display");
lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 13));
lblDisplay.setBackground(new Color(153, 50, 204));
lblDisplay.setBounds(64, 153, 101, 28);
contentPane.add(lblDisplay);

f1 = new JTextField();
f1.setBackground(new Color(0, 255, 255));
f1.setBounds(229, 63, 131, 20);
contentPane.add(f1);
f1.setColumns(10);

f2 = new JTextField();
f2.setColumns(10);
f2.setBackground(Color.CYAN);
f2.setBounds(229, 109, 131, 20);
contentPane.add(f2);

f3 = new JTextField();
f3.setColumns(10);
f3.setBackground(Color.CYAN);
f3.setBounds(229, 158, 131, 20);
contentPane.add(f3);

JButton btnNewButton = new JButton("EnQueue");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
// Initialize queue size if not already set
if (queueArray == null) {
size = Integer.parseInt(f1.getText());
queueArray = new int[size];
}

// Get the element to push
int element = Integer.parseInt(f2.getText());

// Check for queue overflow
if ((rear + 1) % size == front) {
f3.setText("Queue is Full");
} else {
if (front == -1) front = 0; // Initialize front if first element
rear = (rear + 1) % size;
queueArray[rear] = element;
f3.setText("Inserted " + element);
}
} catch (NumberFormatException ex) {
f3.setText("Invalid input!");
}
}
});
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton.setBackground(new Color(211, 211, 211));
btnNewButton.setBounds(42, 208, 89, 28);
contentPane.add(btnNewButton);

JButton btnPop = new JButton("DeQueue");
btnPop.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (front == -1) {
// Queue underflow
f3.setText("Queue is Empty");
} else {
// Pop the front element from the queue
int poppedElement = queueArray[front];
if (front == rear) {
// If the queue has only one element
front = rear = -1;
} else {
front = (front + 1) % size;
}
f3.setText("Removed " + poppedElement);
}
}
});
btnPop.setFont(new Font("Tahoma", Font.BOLD, 12));
btnPop.setBackground(new Color(211, 211, 211));
btnPop.setBounds(159, 208, 89, 28);
contentPane.add(btnPop);

JButton btnNewButton_1_1 = new JButton("Display");
btnNewButton_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (front == -1) {
f3.setText("Queue is empty");
} else {
StringBuilder queueContents = new StringBuilder();
int i = front;
while (i != rear) {
queueContents.append(queueArray[i]).append(" ");
i = (i + 1) % size;
}
queueContents.append(queueArray[rear]); // Add the last element
f3.setText(queueContents.toString());
}
}
});
btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton_1_1.setBackground(new Color(211, 211, 211));
btnNewButton_1_1.setBounds(318, 208, 89, 28);
contentPane.add(btnNewButton_1_1);
}
}
