package ProjectFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Font;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class DataStructures extends JFrame {

private JPanel contentPane;

public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

DataStructures frame = new DataStructures();

frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

}

});

}

public DataStructures() {

setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

setBounds(100, 100, 450, 300);

contentPane = new JPanel();

contentPane.setBackground(new Color(0, 255, 255));

contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);

contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("Data Structures");

lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

lblNewLabel.setBounds(145, 11, 117, 33);

contentPane.add(lblNewLabel);

JButton btnNewButton = new JButton("Array");

btnNewButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

Array arr=new Array(); // Open ArrayFrame

arr.setVisible(true);

}

});

btnNewButton.setBackground(new Color(0, 255, 0));

btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));

btnNewButton.setBounds(30, 75, 108, 23);

contentPane.add(btnNewButton);

JButton btnStack = new JButton("Stack");

btnStack.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

Stack stk=new Stack(); // Open StackFrame

stk.setVisible(true);

}

});

btnStack.setFont(new Font("Tahoma", Font.BOLD, 11));

btnStack.setBackground(Color.GREEN);

btnStack.setBounds(253, 75, 117, 23);

contentPane.add(btnStack);

JButton btnQueue = new JButton("Queue");

btnQueue.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

Queue Que=new Queue(); // Open QueueFrame

Que.setVisible(true);

}

});

btnQueue.setFont(new Font("Tahoma", Font.BOLD, 11));

btnQueue.setBackground(Color.GREEN);

btnQueue.setBounds(30, 138, 108, 23);

contentPane.add(btnQueue);

JButton btnCircularqueue = new JButton("CircularQueue");

btnCircularqueue.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

CircularQueues CQ=new CircularQueues(); // Open CircularQueueFrame

CQ.setVisible(true);

}

});

btnCircularqueue.setFont(new Font("Tahoma", Font.BOLD, 11));

btnCircularqueue.setBackground(Color.GREEN);

btnCircularqueue.setBounds(253, 138, 117, 23);

contentPane.add(btnCircularqueue);

JButton btnLinkedlist = new JButton("LinkedList");

btnLinkedlist.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

Linkedlist ll=new Linkedlist(); // Open LinkedListFrame

ll.setVisible(true);

}

});

btnLinkedlist.setFont(new Font("Tahoma", Font.BOLD, 11));

btnLinkedlist.setBackground(Color.GREEN);

btnLinkedlist.setBounds(145, 197, 108, 23);

contentPane.add(btnLinkedlist);

}

}

