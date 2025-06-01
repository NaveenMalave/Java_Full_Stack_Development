package com.EmployeeProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class ViewEmployeeByID extends JFrame {

    private JPanel contentPane;
    private JTextField textEntID;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewEmployeeByID frame = new ViewEmployeeByID();
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
    public ViewEmployeeByID() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 228, 225));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbleEmpIDView = new JLabel("Employee ID");
        lbleEmpIDView.setHorizontalAlignment(SwingConstants.LEFT);
        lbleEmpIDView.setBounds(45, 61, 84, 14);
        contentPane.add(lbleEmpIDView);

        JLabel lblViewEmpDetail = new JLabel("VIEW EMPLOYEE DETAILS BY ID");
        lblViewEmpDetail.setBounds(140, 11, 250, 14);
        lblViewEmpDetail.setForeground(new Color(0, 0, 255));
        contentPane.add(lblViewEmpDetail);

        textEntID = new JTextField();
        textEntID.setBounds(199, 58, 86, 20);
        contentPane.add(textEntID);
        textEntID.setColumns(10);

        JCheckBox chckbxID = new JCheckBox("ID");
        chckbxID.setBackground(new Color(255, 255, 224));
        chckbxID.setBounds(32, 98, 60, 23);
        contentPane.add(chckbxID);

        JCheckBox chckbxName = new JCheckBox("Name");
        chckbxName.setBackground(new Color(255, 255, 224));
        chckbxName.setBounds(140, 98, 66, 23);
        contentPane.add(chckbxName);

        JCheckBox chckbxEmail = new JCheckBox("Email");
        chckbxEmail.setBackground(new Color(255, 255, 224));
        chckbxEmail.setBounds(32, 139, 60, 23);
        contentPane.add(chckbxEmail);

        JCheckBox chckbxSalary = new JCheckBox("Salary");
        chckbxSalary.setBackground(new Color(255, 255, 224));
        chckbxSalary.setBounds(270, 98, 66, 23);
        contentPane.add(chckbxSalary);

        JCheckBox chckbxPhone = new JCheckBox("Phone");
        chckbxPhone.setBackground(new Color(255, 255, 224));
        chckbxPhone.setBounds(140, 139, 66, 23);
        contentPane.add(chckbxPhone);

        JCheckBox chckbxAddress = new JCheckBox("Address");
        chckbxAddress.setBackground(new Color(255, 255, 224));
        chckbxAddress.setBounds(270, 139, 84, 23);
        contentPane.add(chckbxAddress);

        JTextArea textArea = new JTextArea();
        textArea.setBackground(new Color(255, 250, 250));
        textArea.setBounds(45, 200, 277, 150);
        contentPane.add(textArea);

        JButton btnRetrieve = new JButton("Retrieve");
        btnRetrieve.setBounds(150, 170, 100, 23);
        contentPane.add(btnRetrieve);

        btnRetrieve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String empId = textEntID.getText().trim();
                if (empId.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Build query dynamically based on selected checkboxes
                StringBuilder query = new StringBuilder("SELECT ");
                boolean first = true;

                if (chckbxID.isSelected()) {
                    query.append(first ? "id" : ", id");
                    first = false;
                }
                if (chckbxName.isSelected()) {
                    query.append(first ? "Name" : ", Name");
                    first = false;
                }
                if (chckbxEmail.isSelected()) {
                    query.append(first ? "Email" : ", Email");
                    first = false;
                }
                if (chckbxSalary.isSelected()) {
                    query.append(first ? "Salary" : ", Salary");
                    first = false;
                }
                if (chckbxPhone.isSelected()) {
                    query.append(first ? "Phone" : ", Phone");
                    first = false;
                }
                if (chckbxAddress.isSelected()) {
                    query.append(first ? "Address" : ", Address");
                    first = false;
                }

                if (first) {
                    JOptionPane.showMessageDialog(null, "Please select at least one checkbox", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                query.append(" FROM employeemag WHERE id = ?");

                // Retrieve data from database
                try (Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/julyjdbc", "root", "root");
                     PreparedStatement pstmt = connection.prepareStatement(query.toString())) {

                    pstmt.setInt(1, Integer.parseInt(empId));

                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        StringBuilder result = new StringBuilder();
                        if (chckbxID.isSelected()) result.append("ID: ").append(rs.getInt("id")).append("\n");
                        if (chckbxName.isSelected()) result.append("Name: ").append(rs.getString("Name")).append("\n");
                        if (chckbxEmail.isSelected()) result.append("Email: ").append(rs.getString("Email")).append("\n");
                        if (chckbxSalary.isSelected()) result.append("Salary: ").append(rs.getDouble("Salary")).append("\n");
                        if (chckbxPhone.isSelected()) result.append("Phone: ").append(rs.getString("Phone")).append("\n");
                        if (chckbxAddress.isSelected()) result.append("Address: ").append(rs.getString("Address")).append("\n");

                        textArea.setText(result.toString());
                    } else {
                        textArea.setText("No employee found with ID: " + empId);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error retrieving employee details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
