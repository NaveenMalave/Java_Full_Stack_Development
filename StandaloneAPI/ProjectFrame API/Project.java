package ProjectFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;

public class Project extends JFrame {

	private JPanel contentPane;
	private final JLayeredPane layeredPane = new JLayeredPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBounds(new Rectangle(10, 6, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		layeredPane.setBackground(SystemColor.textHighlight);
		layeredPane.setBounds(new Rectangle(10, 20, 400, 500));
		layeredPane.setBorder(new LineBorder(SystemColor.activeCaption));
		contentPane.add(layeredPane, "name_104481055619100");
	}

}
