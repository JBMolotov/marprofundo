

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Placar");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Pagul", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(333, 51, 157, 96);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbl1Lugar = new JLabel("1. Vazio");
		lbl1Lugar.setForeground(Color.WHITE);
		lbl1Lugar.setFont(new Font("Pagul", Font.BOLD, 25));
		lbl1Lugar.setBounds(257, 145, 309, 30);
		contentPane.add(lbl1Lugar);
		
		JLabel lbl2Lugar = new JLabel("2. Vazio");
		lbl2Lugar.setFont(new Font("Pagul", Font.BOLD, 22));
		lbl2Lugar.setForeground(Color.WHITE);
		lbl2Lugar.setBounds(284, 187, 243, 23);
		contentPane.add(lbl2Lugar);
		
		JLabel lbl3Lugar = new JLabel("3. Vazio");
		lbl3Lugar.setForeground(Color.WHITE);
		lbl3Lugar.setFont(new Font("Pagul", Font.BOLD, 20));
		lbl3Lugar.setBounds(305, 222, 205, 16);
		contentPane.add(lbl3Lugar);
		
		JLabel lbl4Lugar = new JLabel("4. Vazio");
		lbl4Lugar.setForeground(Color.WHITE);
		lbl4Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl4Lugar.setBounds(310, 250, 205, 16);
		contentPane.add(lbl4Lugar);
		
		JLabel lbl5Lugar = new JLabel("5. Vazio");
		lbl5Lugar.setForeground(Color.WHITE);
		lbl5Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl5Lugar.setBounds(310, 280, 205, 16);
		contentPane.add(lbl5Lugar);
		
		JLabel lbl6Lugar = new JLabel("6. Vazio");
		lbl6Lugar.setForeground(Color.WHITE);
		lbl6Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl6Lugar.setBounds(310, 310, 205, 16);
		contentPane.add(lbl6Lugar);
		
		JLabel lbl7Lugar = new JLabel("7. Vazio");
		lbl7Lugar.setForeground(Color.WHITE);
		lbl7Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl7Lugar.setBounds(310, 340, 205, 16);
		contentPane.add(lbl7Lugar);
		
		JLabel lbl8Lugar;
		lbl8Lugar = new JLabel("8. Vazio");
		lbl8Lugar.setForeground(Color.WHITE);
		lbl8Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl8Lugar.setBounds(310, 370, 205, 16);
		contentPane.add(lbl8Lugar);
		
		JLabel lbl9Lugar = new JLabel("9. Vazio");
		lbl9Lugar.setForeground(Color.WHITE);
		lbl9Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl9Lugar.setBounds(310, 400, 205, 16);
		contentPane.add(lbl9Lugar);
		
		JLabel lbl10Lugar = new JLabel("10. Vazio");
		lbl10Lugar.setForeground(Color.WHITE);
		lbl10Lugar.setFont(new Font("Pagul", Font.BOLD, 18));
		lbl10Lugar.setBounds(310, 430, 205, 16);
		contentPane.add(lbl10Lugar);
		

		
		
		
		JPanel pnlBack = new JPanel();
		pnlBack.setBackground(new Color(5, 61, 87));
		pnlBack.setBounds(200, 0, 400, 600);
		contentPane.add(pnlBack);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicial frame = new Inicial();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(new Color(5, 61, 87));
		btnSair.setFont(new Font("Pagul", Font.BOLD, 20));
		btnSair.setBackground(new Color(211, 214, 216));
		btnSair.setBounds(674, 12, 91, 43);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Placar.class.getResource("/view/back2.jpeg")));
		lblNewLabel.setBounds(0, 0, 800, 600);
		contentPane.add(lblNewLabel);
	}
}
