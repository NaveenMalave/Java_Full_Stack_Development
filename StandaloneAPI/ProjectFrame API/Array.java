package ProjectFrame;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Array extends JFrame {
    private JTextField f1; // Field to input array size
    private JTextField f4; // Field to display array elements
    private JTextField f2; // Field to input the element to insert
    private JTextField f3; // Field to input the index for insertion or deletion
    private int[] arr; // Array to store elements
    private int size; // Size of the array

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
        setBackground(new Color(255, 153, 255));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel ArrayLabel = new JLabel("Array");
        ArrayLabel.setBounds(176, 10, 71, 32);
        ArrayLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        contentPane.add(ArrayLabel);

        JLabel lblSize = new JLabel("Size");
        lblSize.setBounds(99, 65, 71, 32);
        lblSize.setFont(new Font("Tahoma", Font.BOLD, 13));
        contentPane.add(lblSize);

        f1 = new JTextField();
        f1.setBackground(Color.PINK);
        f1.setBounds(192, 70, 155, 25);
        contentPane.add(f1);
        f1.setColumns(10);

        JLabel lblElement = new JLabel("Element");
        lblElement.setBackground(new Color(204, 204, 255));
        lblElement.setBounds(20, 103, 71, 32);
        lblElement.setFont(new Font("Tahoma", Font.BOLD, 13));
        contentPane.add(lblElement);

        JLabel lblIndex = new JLabel("Index");
        lblIndex.setBounds(221, 103, 71, 32);
        lblIndex.setFont(new Font("Tahoma", Font.BOLD, 13));
        contentPane.add(lblIndex);

        f4 = new JTextField();
        f4.setBackground(Color.PINK);
        f4.setBounds(176, 149, 171, 25);
        f4.setColumns(10);
        contentPane.add(f4);

        JLabel lblDisplay = new JLabel("Display");
        lblDisplay.setBounds(99, 144, 71, 32);
        lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 13));
        contentPane.add(lblDisplay);

        f2 = new JTextField();
        f2.setBackground(Color.PINK);
        f2.setBounds(84, 108, 117, 25);
        f2.setColumns(10);
        contentPane.add(f2);

        f3 = new JTextField();
        f3.setBackground(Color.PINK);
        f3.setBounds(277, 108, 117, 25);
        f3.setColumns(10);
        contentPane.add(f3);

        JButton btnNewButton = new JButton("Insert");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the size of the array from input if not initialized
                    if (arr == null) {
                        size = Integer.parseInt(f1.getText());
                        arr = new int[size];
                    }

                    // Get element and index from text fields
                    int element = Integer.parseInt(f2.getText());
                    int index = Integer.parseInt(f3.getText());

                    // Insert the element if index is within bounds
                    if (index >= 0 && index < size) {
                        arr[index] = element;
                        f4.setText("Inserted " + element + " at index " + index);
                    } else {
                        f4.setText("Index out of bounds!");
                    }
                } catch (NumberFormatException ex) {
                    f4.setText("Invalid input!");
                }
            }
        });
        btnNewButton.setBackground(new Color(50, 205, 50));
        btnNewButton.setBounds(20, 211, 89, 23);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(btnNewButton);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
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
        });
        btnDelete.setBackground(new Color(51, 204, 102));
        btnDelete.setBounds(170, 212, 89, 23);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(btnDelete);

        JButton btnDisplay = new JButton("Display");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (arr != null) {
                    StringBuilder displayText = new StringBuilder();
                    for (int i = 0; i < size; i++) {
                        displayText.append(arr[i]).append(" ");
                    }
                    f4.setText(displayText.toString());
                } else {
                    f4.setText("Array is empty!");
                }
            }
        });
        btnDisplay.setBackground(new Color(102, 255, 0));
        btnDisplay.setBounds(305, 212, 89, 23);
        btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(btnDisplay);
    }
}
