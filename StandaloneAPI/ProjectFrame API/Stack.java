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

public class Stack extends JFrame {

private JPanel contentPane;
private JTextField textField; // For stack size input
private JTextField textField_1; // For element input
private JTextField textField_2; // For displaying stack
private int[] stackArray; // Array to implement stack
private int size; // Size of the stack
private int top = -1; // Stack pointer (initially -1 when stack is empty)

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Stack frame = new Stack();
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
public Stack() {
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 255, 0));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel Stacklbl = new JLabel("Stack");
Stacklbl.setFont(new Font("Tahoma", Font.BOLD, 12));
Stacklbl.setBounds(176, 10, 77, 25);
contentPane.add(Stacklbl);

JLabel lblSize = new JLabel("Size");
lblSize.setFont(new Font("Tahoma", Font.BOLD, 12));
lblSize.setBounds(61, 61, 77, 25);
contentPane.add(lblSize);

JLabel lblEnterElement = new JLabel("Enter Element");
lblEnterElement.setFont(new Font("Tahoma", Font.BOLD, 12));
lblEnterElement.setBounds(41, 110, 95, 25);
contentPane.add(lblEnterElement);

JLabel lblDisplay = new JLabel("Display");
lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
lblDisplay.setBounds(57, 158, 95, 25);
contentPane.add(lblDisplay);

textField = new JTextField();
textField.setBackground(new Color(255, 255, 0));
textField.setBounds(211, 64, 124, 20);
contentPane.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBackground(Color.YELLOW);
textField_1.setBounds(211, 113, 124, 20);
contentPane.add(textField_1);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBackground(Color.YELLOW);
textField_2.setBounds(197, 161, 138, 20);
contentPane.add(textField_2);

// Push Button Logic
JButton btnNewButton = new JButton("Push");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
// Initialize stack size if not already set
if (stackArray == null) {
size = Integer.parseInt(textField.getText());
stackArray = new int[size];
}

// Get the element to push
int element = Integer.parseInt(textField_1.getText());

// Check for stack overflow
if (top == size - 1) {
textField_2.setText("Stack Overflow");
} else {
// Push the element to the stack
stackArray[++top] = element;
textField_2.setText("Pushed " + element);
}
} catch (NumberFormatException ex) {
textField_2.setText("Invalid input!");
}
}
});
btnNewButton.setBackground(new Color(0, 255, 255));
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton.setBounds(41, 214, 89, 23);
contentPane.add(btnNewButton);

// Pop Button Logic
JButton btnPop = new JButton("Pop");
btnPop.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (top == -1) {
// Stack underflow
textField_2.setText("Stack Underflow");
} else {
// Pop the top element from the stack
int poppedElement = stackArray[top--];
textField_2.setText("Popped " + poppedElement);
}
}
});
btnPop.setFont(new Font("Tahoma", Font.BOLD, 11));
btnPop.setBackground(Color.CYAN);
btnPop.setBounds(178, 214, 89, 23);
contentPane.add(btnPop);

// Display Button Logic
JButton btnNewButton_1_1 = new JButton("Display");
btnNewButton_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (top == -1) {
textField_2.setText("Stack is empty");
} else {
StringBuilder stackContents = new StringBuilder();
for (int i = 0; i <= top; i++) {
stackContents.append(stackArray[i]).append(" ");
}
textField_2.setText(stackContents.toString());
}
}
});
btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton_1_1.setBackground(Color.CYAN);
btnNewButton_1_1.setBounds(314, 214, 89, 23);
contentPane.add(btnNewButton_1_1);
}
}