package com.EmployeeProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class UpdateEmployee extends JFrame {

    private JPanel contentPane;
    private JTextField textid;
    private JTextField textField;      // Name field
    private JTextField textField_1;    // Salary field
    private JTextField textField_2;    // Email field
    private JTextField textField_3;    // Phone field
    private JTextField textField_4;    // Address field

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateEmployee frame = new UpdateEmployee();
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
    public UpdateEmployee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(216, 191, 216));
        contentPane.setBackground(new Color(175, 238, 238));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEMPupDATE = new JLabel("Enter Employee Id to Update");
        lblEMPupDATE.setBounds(52, 52, 158, 37);
        lblEMPupDATE.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(lblEMPupDATE);

        JLabel lblUpdateEmp = new JLabel("UPDATE EMPLOYEE DETAILS");
        lblUpdateEmp.setBounds(134, 11, 200, 14);
        lblUpdateEmp.setForeground(new Color(199, 21, 133));
        contentPane.add(lblUpdateEmp);

        textid = new JTextField();
        textid.setBounds(248, 60, 86, 20);
        contentPane.add(textid);
        textid.setColumns(10);

        JCheckBox chckbxName = new JCheckBox("Name");
        chckbxName.setBackground(new Color(255, 255, 224));
        chckbxName.setBounds(49, 85, 97, 23);
        contentPane.add(chckbxName);

        JCheckBox chckbxSalary = new JCheckBox("Salary");
        chckbxSalary.setBackground(new Color(255, 255, 224));
        chckbxSalary.setBounds(49, 111, 97, 23);
        contentPane.add(chckbxSalary);

        JCheckBox chckbxEmail = new JCheckBox("Email");
        chckbxEmail.setBackground(new Color(255, 255, 224));
        chckbxEmail.setBounds(49, 140, 97, 23);
        contentPane.add(chckbxEmail);

        JCheckBox chckbxPhone = new JCheckBox("Phone");
        chckbxPhone.setBackground(new Color(255, 255, 224));
        chckbxPhone.setBounds(49, 164, 97, 23);
        contentPane.add(chckbxPhone);

        JCheckBox chckbxAddress = new JCheckBox("Address");
        chckbxAddress.setBackground(new Color(255, 255, 224));
        chckbxAddress.setBounds(52, 190, 97, 23);
        contentPane.add(chckbxAddress);

        textField = new JTextField();
        textField.setBounds(185, 86, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(185, 112, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(185, 141, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(185, 165, 86, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(185, 191, 86, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String empId = textid.getText().trim();
                String name = textField.getText().trim();
                String salary = textField_1.getText().trim();
                String email = textField_2.getText().trim();
                String phone = textField_3.getText().trim();
                String address = textField_4.getText().trim();

                if (empId.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StringBuilder query = new StringBuilder("UPDATE employeemag SET ");
                boolean hasUpdates = false;

                if (chckbxName.isSelected()) {
                    query.append("Name = ?, ");
                    hasUpdates = true;
                }
                if (chckbxSalary.isSelected()) {
                    query.append("Salary = ?, ");
                    hasUpdates = true;
                }
                if (chckbxEmail.isSelected()) {
                    query.append("Email = ?, ");
                    hasUpdates = true;
                }
                if (chckbxPhone.isSelected()) {
                    query.append("Phone = ?, ");
                    hasUpdates = true;
                }
                if (chckbxAddress.isSelected()) {
                    query.append("Address = ?, ");
                    hasUpdates = true;
                }

                if (!hasUpdates) {
                    JOptionPane.showMessageDialog(null, "No fields selected for update", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                query.setLength(query.length() - 2); // Remove last comma
                query.append(" WHERE id = ?");

                try (Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/julyjdbc", "root", "root");
                     PreparedStatement pstmt = connection.prepareStatement(query.toString())) {

                    int paramIndex = 1;
                    if (chckbxName.isSelected()) pstmt.setString(paramIndex++, name);
                    if (chckbxSalary.isSelected()) pstmt.setString(paramIndex++, salary);
                    if (chckbxEmail.isSelected()) pstmt.setString(paramIndex++, email);
                    if (chckbxPhone.isSelected()) pstmt.setString(paramIndex++, phone);
                    if (chckbxAddress.isSelected()) pstmt.setString(paramIndex++, address);
                    pstmt.setInt(paramIndex, Integer.parseInt(empId));

                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Employee details updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No employee found with the given ID.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error updating employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnUpdate.setForeground(new Color(199, 21, 133));
        btnUpdate.setBounds(118, 220, 89, 23);
        contentPane.add(btnUpdate);
    }
}
