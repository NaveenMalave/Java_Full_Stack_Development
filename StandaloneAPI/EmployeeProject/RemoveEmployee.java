package com.EmployeeProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class RemoveEmployee extends JFrame {

    private JPanel contentPane;
    private JTextField textEmpIdToRem;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RemoveEmployee frame = new RemoveEmployee();
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
    public RemoveEmployee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 250, 205));
        contentPane.setForeground(new Color(255, 250, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEntEmpID = new JLabel("Employee ID");
        lblEntEmpID.setHorizontalAlignment(SwingConstants.LEFT);
        lblEntEmpID.setBounds(53, 56, 102, 14);
        contentPane.add(lblEntEmpID);

        JLabel lblRemEmp = new JLabel("REMOVE EMPLOYEE DETAILS");
        lblRemEmp.setBounds(138, 11, 200, 14);
        lblRemEmp.setBackground(new Color(240, 240, 240));
        lblRemEmp.setForeground(new Color(199, 21, 133));
        contentPane.add(lblRemEmp);

        textEmpIdToRem = new JTextField();
        textEmpIdToRem.setBounds(247, 53, 86, 20);
        contentPane.add(textEmpIdToRem);
        textEmpIdToRem.setColumns(10);

        JButton btnRemEmployee = new JButton("REMOVE EMPLOYEE");
        btnRemEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String empId = textEmpIdToRem.getText().trim();

                // Validate input
                if (empId.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    // Establish database connection
                    Connection connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/julyjdbc", "root", "root");

                    // Prepare DELETE query
                    String query = "DELETE FROM employeemag WHERE id = ?";
                    PreparedStatement pstmt = connection.prepareStatement(query);
                    pstmt.setInt(1, Integer.parseInt(empId));

                    // Execute the query
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        textField.setText("Employee with ID " + empId + " has been removed successfully.");
                    } else {
                        textField.setText("No employee found with ID " + empId + ".");
                    }

                    // Close connection
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error removing employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnRemEmployee.setForeground(new Color(255, 20, 147));
        btnRemEmployee.setBounds(142, 94, 180, 23);
        contentPane.add(btnRemEmployee);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBackground(new Color(255, 255, 240));
        textField.setBounds(69, 147, 300, 92);
        contentPane.add(textField);
        textField.setColumns(10);
    }
}
