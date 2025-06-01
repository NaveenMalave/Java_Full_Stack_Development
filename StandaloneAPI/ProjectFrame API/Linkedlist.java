package ProjectFrame;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Linkedlist extends JFrame {

    private JPanel contentPane;
    private JTextField f1;  // Field for entering elements
    private JTextField f2;  // Field for searching elements
    private JTextField f3;  // Field for displaying list contents and size
   
    // LinkedList instance
    private LinkedList<Integer> list = new LinkedList<>();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Linkedlist frame = new Linkedlist();
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
    public Linkedlist() {
        setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.YELLOW);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel linklistlbl = new JLabel("LinkedList");
        linklistlbl.setFont(new Font("Tahoma", Font.BOLD, 13));
        linklistlbl.setBounds(159, 11, 89, 24);
        contentPane.add(linklistlbl);

        JLabel lblEnterElement = new JLabel("Enter Element");
        lblEnterElement.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEnterElement.setBounds(55, 58, 94, 24);
        contentPane.add(lblEnterElement);

        JLabel lblSearchElement = new JLabel("Element To Search");
        lblSearchElement.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblSearchElement.setBounds(42, 99, 120, 24);
        contentPane.add(lblSearchElement);

        JLabel lblDisplay = new JLabel("Display");
        lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblDisplay.setBounds(68, 149, 94, 24);
        contentPane.add(lblDisplay);

        f1 = new JTextField();
        f1.setColumns(10);
        f1.setBackground(Color.CYAN);
        f1.setBounds(213, 61, 111, 20);
        contentPane.add(f1);

        f2 = new JTextField(); // Text field for searching
        f2.setColumns(10);
        f2.setBackground(Color.CYAN);
        f2.setBounds(213, 102, 111, 20);
        contentPane.add(f2);

        f3 = new JTextField();
        f3.setColumns(10);
        f3.setBackground(Color.CYAN);
        f3.setBounds(213, 152, 111, 20);
        contentPane.add(f3);

        JButton btnInsert = new JButton("Insert");
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int element = Integer.parseInt(f1.getText());
                    list.add(element);
                    f3.setText(list.toString());
                    f1.setText(""); // Clear input field after insert
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });
        btnInsert.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnInsert.setBackground(new Color(0, 255, 0));
        btnInsert.setBounds(10, 228, 89, 23);
        contentPane.add(btnInsert);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    f3.setText(list.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "List is empty.");
                }
            }
        });
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnDelete.setBackground(Color.GREEN);
        btnDelete.setBounds(118, 228, 89, 23);
        contentPane.add(btnDelete);

        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int element = Integer.parseInt(f2.getText());
                    int index = list.indexOf(element);
                    if (index != -1) {
                        JOptionPane.showMessageDialog(null, "Element found at position: " + index);
                    } else {
                        JOptionPane.showMessageDialog(null, "Element not found.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });
        btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSearch.setBackground(Color.GREEN);
        btnSearch.setBounds(218, 228, 89, 23);
        contentPane.add(btnSearch);

        JButton btnSort = new JButton("Sort");
        btnSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list.sort(null); // Sort in natural order
                f3.setText(list.toString());
            }
        });
        btnSort.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSort.setBackground(Color.GREEN);
        btnSort.setBounds(335, 228, 89, 23);
        contentPane.add(btnSort);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list.clear();
                f3.setText("");
                f1.setText(""); // Clear input field
                f2.setText(""); // Clear search field
            }
        });
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnReset.setBackground(Color.GREEN);
        btnReset.setBounds(335, 26, 76, 23);
        contentPane.add(btnReset);
    }
}

