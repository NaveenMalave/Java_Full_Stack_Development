package com.EmployeeProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class EmployeeAPP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeAPP frame = new EmployeeAPP();
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
	public EmployeeAPP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewEmp = new JButton("View Employee");
		btnViewEmp.setForeground(new Color(128, 0, 0));
		btnViewEmp.setBackground(new Color(240, 240, 240));
		btnViewEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewEmployee viEmp = new ViewEmployee();
				viEmp.setVisible(true);
			}
		});
		btnViewEmp.setBounds(37, 81, 121, 28);
		contentPane.add(btnViewEmp);
		
		JLabel lblEmphead = new JLabel("Welcome To Employee Management System");
		lblEmphead.setBounds(111, 11, 270, 20);
		lblEmphead.setForeground(Color.RED);
		contentPane.add(lblEmphead);
		
		JButton btnViewEmpID = new JButton("VIew Employee By ID");
		btnViewEmpID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewEmployeeByID vempid = new ViewEmployeeByID();
				vempid.setVisible(true);
			}
		});
		btnViewEmpID.setForeground(new Color(128, 0, 0));
		btnViewEmpID.setBounds(246, 81, 149, 28);
		contentPane.add(btnViewEmpID);
		
		JButton btnAddEmp = new JButton("Add Employee");
		btnAddEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee AddEmp = new AddEmployee();
				AddEmp.setVisible(true);
			}
		});
		btnAddEmp.setForeground(new Color(128, 0, 0));
		btnAddEmp.setBounds(37, 151, 121, 23);
		contentPane.add(btnAddEmp);
		
		JButton btnRemEmp = new JButton("Remove Employee");
		btnRemEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveEmployee RemEmp = new  RemoveEmployee();
			    RemEmp.setVisible(true);	
			}
		});
		btnRemEmp.setForeground(new Color(128, 0, 0));
		btnRemEmp.setBounds(246, 151, 149, 23);
		contentPane.add(btnRemEmp);
		
		JButton btnUpdateEmp = new JButton("Update Employee");
		btnUpdateEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateEmployee UpEmp = new UpdateEmployee();
				UpEmp.setVisible(true);
			}
		});
		btnUpdateEmp.setForeground(new Color(128, 0, 0));
		btnUpdateEmp.setBounds(142, 206, 139, 23);
		contentPane.add(btnUpdateEmp);
	}
}
