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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddEmployee extends JFrame {

    private JPanel contentPane;
    private JTextField textEmpId;
    private JTextField textEmpName;
    private JTextField textEmpSalary;
    private JTextField textEmpEmail;
    private JTextField textEmpphone;
    private JTextField textEmpAdd;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddEmployee frame = new AddEmployee();
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
    public AddEmployee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(255, 69, 0));
        contentPane.setBackground(new Color(255, 228, 225));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEmpID = new JLabel("Employee ID");
        lblEmpID.setBounds(38, 50, 100, 14);
        lblEmpID.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(lblEmpID);

        JLabel lblAddEmployee = new JLabel("ADD EMPLOYEE DETAILS");
        lblAddEmployee.setBounds(150, 10, 200, 14);
        lblAddEmployee.setForeground(new Color(255, 0, 0));
        contentPane.add(lblAddEmployee);

        JLabel lblEmpName = new JLabel("Employee Name");
        lblEmpName.setBounds(38, 85, 100, 14);
        lblEmpName.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(lblEmpName);

        JLabel lblEmpSalary = new JLabel("Employee Salary");
        lblEmpSalary.setHorizontalAlignment(SwingConstants.LEFT);
        lblEmpSalary.setBounds(38, 120, 100, 14);
        contentPane.add(lblEmpSalary);

        JLabel lblEmpEmail = new JLabel("Employee Email");
        lblEmpEmail.setHorizontalAlignment(SwingConstants.LEFT);
        lblEmpEmail.setBounds(38, 155, 100, 14);
        contentPane.add(lblEmpEmail);

        JLabel lblEmpPhone = new JLabel("Employee Phone");
        lblEmpPhone.setHorizontalAlignment(SwingConstants.LEFT);
        lblEmpPhone.setBounds(38, 190, 100, 14);
        contentPane.add(lblEmpPhone);

        JLabel lblEmpAddress = new JLabel("Employee Address");
        lblEmpAddress.setHorizontalAlignment(SwingConstants.LEFT);
        lblEmpAddress.setBounds(38, 225, 120, 14);
        contentPane.add(lblEmpAddress);

        textEmpId = new JTextField();
        textEmpId.setBounds(180, 47, 200, 20);
        contentPane.add(textEmpId);
        textEmpId.setColumns(10);

        textEmpName = new JTextField();
        textEmpName.setBounds(180, 82, 200, 20);
        contentPane.add(textEmpName);
        textEmpName.setColumns(10);

        textEmpSalary = new JTextField();
        textEmpSalary.setBounds(180, 117, 200, 20);
        contentPane.add(textEmpSalary);
        textEmpSalary.setColumns(10);

        textEmpEmail = new JTextField();
        textEmpEmail.setBounds(180, 152, 200, 20);
        contentPane.add(textEmpEmail);
        textEmpEmail.setColumns(10);

        textEmpphone = new JTextField();
        textEmpphone.setBounds(180, 187, 200, 20);
        contentPane.add(textEmpphone);
        textEmpphone.setColumns(10);

        textEmpAdd = new JTextField();
        textEmpAdd.setBounds(180, 222, 200, 20);
        contentPane.add(textEmpAdd);
        textEmpAdd.setColumns(10);

        JButton btnInsertEmployee = new JButton("INSERT EMPLOYEE");
        btnInsertEmployee.setForeground(new Color(165, 42, 42));
        btnInsertEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get input data
                String empId = textEmpId.getText().trim();
                String empName = textEmpName.getText().trim();
                String empSalary = textEmpSalary.getText().trim();
                String empEmail = textEmpEmail.getText().trim();
                String empPhone = textEmpphone.getText().trim();
                String empAddress = textEmpAdd.getText().trim();

                // Validate inputs
                if (empId.isEmpty() || empName.isEmpty() || empSalary.isEmpty() || empEmail.isEmpty() || empPhone.isEmpty() || empAddress.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    Double.parseDouble(empSalary); // Validate salary is a number
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Salary must be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Database insertion
                try {
                    Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/julyjdbc", "root", "root"); // Update with your credentials
                    String query = "INSERT INTO employeemag (id, Name, Salary, Email, Phone, Address) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = connection.prepareStatement(query);

                    pstmt.setInt(1, Integer.parseInt(empId));
                    pstmt.setString(2, empName);
                    pstmt.setDouble(3, Double.parseDouble(empSalary));
                    pstmt.setString(4, empEmail);
                    pstmt.setString(5, empPhone);
                    pstmt.setString(6, empAddress);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Employee added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }

                    // Close connection
                    pstmt.close();
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error adding employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnInsertEmployee.setBackground(new Color(255, 99, 71));
        btnInsertEmployee.setBounds(150, 270, 150, 30);
        contentPane.add(btnInsertEmployee);
    }
}
