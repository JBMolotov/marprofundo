import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta frame = new Pergunta('a');
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Cria a aplicação
	public Pergunta(char dificuldade) {
		
		if (dificuldade == 'f') {
			JOptionPane.showMessageDialog(null, "Você selecionou a fácil");
		} else if (dificuldade == 'm') {
			JOptionPane.showMessageDialog(null, "Você selecionou a média");
		} else if (dificuldade == 'd') {
			JOptionPane.showMessageDialog(null, "Você selecionou a díficil");
		} else
			initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		setBackground(Color.WHITE);
		setTitle("Tela Perguntas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrecho_inicial = new JLabel("Qual a porcentagem de emiss�es de di�xido");
		lblTrecho_inicial.setForeground(Color.WHITE);
		lblTrecho_inicial.setHorizontalAlignment(SwingConstants.EAST);
		lblTrecho_inicial.setFont(new Font("Pagul", Font.BOLD, 16));
		lblTrecho_inicial.setBounds(233, 209, 337, 31);
		contentPane.add(lblTrecho_inicial);
		
		JLabel lblTrecho_meio = new JLabel("de carbono que s�o absorvidas pelos");
		lblTrecho_meio.setForeground(new Color(255, 255, 255));
		lblTrecho_meio.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrecho_meio.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTrecho_meio.setBounds(247, 239, 312, 15);
		contentPane.add(lblTrecho_meio);
		
		JLabel lblCategoria = new JLabel("Geografia");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Pagul", Font.BOLD, 57));
		lblCategoria.setBounds(247, 127, 312, 84);
		contentPane.add(lblCategoria);
		
		JLabel lblTrecho_final = new JLabel("oceanos todos os anos?");
		lblTrecho_final.setForeground(Color.WHITE);
		lblTrecho_final.setFont(new Font("Pagul", Font.BOLD, 16));
		lblTrecho_final.setBounds(307, 261, 200, 15);
		contentPane.add(lblTrecho_final);
		
		JButton btnLetraA = new JButton("A. 10% - 20%");
		btnLetraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLetraA.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraA.setBackground(new Color(211, 214, 216));
		btnLetraA.setForeground(new Color(5, 61, 87));
		btnLetraA.setBounds(155, 309, 169, 52);
		contentPane.add(btnLetraA);
		
		JButton btnLetraB = new JButton("B. 20% - 30%");
		btnLetraB.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraB.setBackground(new Color(211, 214, 216));
		btnLetraB.setForeground(new Color(5, 61, 87));
		btnLetraB.setBounds(485, 309, 169, 52);
		contentPane.add(btnLetraB);
		
		JButton btnLetraC = new JButton("C. 40% - 50%");
		btnLetraC.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraC.setBackground(new Color(211, 214, 216));
		btnLetraC.setForeground(new Color(5, 61, 87));
		btnLetraC.setBounds(155, 442, 169, 52);
		contentPane.add(btnLetraC);
		
		JButton btnLetraD = new JButton("D. 50%");
		btnLetraD.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraD.setBackground(new Color(211, 214, 216));
		btnLetraD.setForeground(new Color(5, 61, 87));
		btnLetraD.setBounds(485, 442, 169, 52);
		contentPane.add(btnLetraD);
		
		JLabel lblNewLabel_2 = new JLabel("Background");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon(Pergunta.class.getResource("/view/back2.jpeg")));
		lblNewLabel_2.setBounds(0, 0, 800, 600);
		contentPane.add(lblNewLabel_2);
	}

}
