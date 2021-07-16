import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JEditorPane;

public class Placar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placar frame = new Placar();
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
	public Placar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setForeground(Color.WHITE);
		editorPane.setBounds(50, 132, 205, 9);
		contentPane.add(editorPane);
		
		JLabel lblNewLabel_1 = new JLabel("Melhor Jogador:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(518, 41, 276, 96);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Delamaro");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblNewLabel_1_2.setBounds(519, 114, 221, 48);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Placar");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		lblNewLabel_1_1.setBounds(50, 42, 157, 96);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("1. Delamaro - 1000pts");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(50, 158, 205, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Matheus - 1000pts");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(50, 194, 205, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("3. João - 1000pts");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(50, 227, 205, 16);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("4. Maria - 1000pts");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(50, 265, 205, 16);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("8. Delamaro - 1000pts");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(50, 399, 205, 16);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("7. Matheus - 1000pts");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_4.setBounds(50, 366, 205, 16);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("6. João - 1000pts");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(50, 332, 205, 16);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("5. Maria - 1000pts");
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2_3_1.setBounds(50, 298, 205, 16);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/matheuscunha/USP/object-oriented/MarProfundo/back4.png"));
		lblNewLabel.setBounds(0, 0, 800, 572);
		contentPane.add(lblNewLabel);
	}
}
