import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Perguntas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perguntas frame = new Perguntas();
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
	public Perguntas() {
		setBackground(Color.WHITE);
		setTitle("Tela Perguntas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qual a porcentagem de emissões de dióxido");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.EAST);
		lblNewLabel.setFont(new Font("Pagul", Font.BOLD, 16));
		lblNewLabel.setBounds(233, 209, 337, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("de carbono que são absorvidas pelos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(247, 239, 312, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Geografia");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Pagul", Font.BOLD, 57));
		lblNewLabel_1_1.setBounds(247, 127, 312, 84);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("oceanos todos os anos?");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Pagul", Font.BOLD, 16));
		lblNewLabel_3.setBounds(307, 261, 200, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("A. 10% - 20%");
		btnNewButton.setFont(new Font("Pagul", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(211, 214, 216));
		btnNewButton.setForeground(new Color(5, 61, 87));
		btnNewButton.setBounds(155, 309, 169, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B. 20% - 30%");
		btnNewButton_1.setFont(new Font("Pagul", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(211, 214, 216));
		btnNewButton_1.setForeground(new Color(5, 61, 87));
		btnNewButton_1.setBounds(485, 309, 169, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C. 40% - 50%");
		btnNewButton_2.setFont(new Font("Pagul", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(211, 214, 216));
		btnNewButton_2.setForeground(new Color(5, 61, 87));
		btnNewButton_2.setBounds(155, 442, 169, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D. 50%");
		btnNewButton_3.setFont(new Font("Pagul", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(211, 214, 216));
		btnNewButton_3.setForeground(new Color(5, 61, 87));
		btnNewButton_3.setBounds(485, 442, 169, 52);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Background");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\alepa\\OneDrive\\Documentos\\marprofundo-main\\back2.jpeg"));
		lblNewLabel_2.setBounds(-16, 11, 800, 600);
		contentPane.add(lblNewLabel_2);
		
		
		

	}
}
