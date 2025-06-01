package com.EmployeeProject;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEmployee extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEmployee frame = new ViewEmployee();
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
	public ViewEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewEmpl = new JLabel("Employee Details");
		lblViewEmpl.setBounds(152, 10, 119, 14);
		lblViewEmpl.setForeground(new Color(255, 0, 0));
		contentPane.add(lblViewEmpl);
		
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(113, 50, 286, 200);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
		/*JTextArea textArea = new JTextArea();
		textArea.setBounds(113, 53, 292, 173);
		contentPane.add(textArea);*/
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//codehere
				displayData();
			}
		});
		btnDisplay.setBounds(14, 71, 89, 23);
		contentPane.add(btnDisplay);
	}
	private void displayData() {
        String url = "jdbc:mysql://localhost:3306/julyjdbc";
        String user = "root";
        String password = "root";
        String query = "SELECT id,Name,Salary FROM employeemag"; // Update this query based on your table structure
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Salary");

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

      
            while (rs.next()) {
                int id = rs.getInt("id"); // Adjust column name
                String name = rs.getString("Name"); // Adjust column name
                String salary = rs.getString("Salary"); // Adjust column name
                
                model.addRow(new Object[]{id, name, salary});
            }
            table.setModel(model);

        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
}
