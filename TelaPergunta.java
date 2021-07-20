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
import java.awt.TextArea;

public class TelaPergunta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPergunta frame = new TelaPergunta('a');
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Cria a aplicação
	public TelaPergunta(char dificuldade) {
		
		if (dificuldade == 'f') {
			JOptionPane.showMessageDialog(null, "Você selecionou a fácil");
		} else if (dificuldade == 'm') {
			JOptionPane.showMessageDialog(null, "Você selecionou a média");
		} else if (dificuldade == 'd') {
			JOptionPane.showMessageDialog(null, "Você selecionou a díficil");
		}
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
		
		JLabel lblTrecho_inicial = new JLabel("Qual a porcentagem de emissões de dióxido de carbono que s�o absorvidas pelo oceanos todos os anos?");
		lblTrecho_inicial.setForeground(Color.WHITE);
		//lblTrecho_inicial.setHorizontalAlignment(SwingConstants.EAST);
		lblTrecho_inicial.setFont(new Font("Pagul", Font.BOLD, 16));
		lblTrecho_inicial.setBounds(35, 162, 740, 39);
		contentPane.add(lblTrecho_inicial);
		
		JLabel lblCategoria = new JLabel("Geografia");
		//lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Pagul", Font.BOLD, 57));
		lblCategoria.setBounds(252, 42, 312, 84);
		contentPane.add(lblCategoria);
		
		JButton btnLetraA = new JButton("A. 10% - 20%");
		btnLetraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLetraA.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraA.setBackground(new Color(211, 214, 216));
		btnLetraA.setForeground(new Color(5, 61, 87));
		btnLetraA.setBounds(35, 306, 350, 50);
		contentPane.add(btnLetraA);
		
		JButton btnLetraB = new JButton("B. 20% - 30%");
		btnLetraB.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraB.setBackground(new Color(211, 214, 216));
		btnLetraB.setForeground(new Color(5, 61, 87));
		btnLetraB.setBounds(411, 305, 350, 52);
		contentPane.add(btnLetraB);
		
		JButton btnLetraC = new JButton("C. 40% - 50%");
		btnLetraC.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraC.setBackground(new Color(211, 214, 216));
		btnLetraC.setForeground(new Color(5, 61, 87));
		btnLetraC.setBounds(35, 427, 350, 52);
		contentPane.add(btnLetraC);
		
		JButton btnLetraD = new JButton("D. 50%");
		btnLetraD.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraD.setBackground(new Color(211, 214, 216));
		btnLetraD.setForeground(new Color(5, 61, 87));
		btnLetraD.setBounds(411, 427, 350, 52);
		contentPane.add(btnLetraD);
		
		JPanel pnlBack = new JPanel();
		pnlBack.setBackground(new Color(5, 61, 87));
		pnlBack.setBounds(0, 32, 800, 215);
		contentPane.add(pnlBack);
		
		JLabel lblNewLabel_2 = new JLabel("Background");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon(TelaPergunta.class.getResource("/view/back2.jpeg")));
		lblNewLabel_2.setBounds(0, 0, 800, 600);
		contentPane.add(lblNewLabel_2);
	}
}
