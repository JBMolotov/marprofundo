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
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
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
					DeckDePerguntas p = null;
					TelaPergunta frame = new TelaPergunta('a', p);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static void shuffleArray(int[] ar)
	  {
	    // vamos usar essa função para tornar as alternativas aleatorias
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	
	
	//Cria a aplicação
	public TelaPergunta(char dificuldade, DeckDePerguntas deck) {
		
		int randPerg = ThreadLocalRandom.current().nextInt(0, 5);
		
		int ordem[] = {0,1,2,3};
		shuffleArray(ordem);
		
		if (dificuldade == 'f') {
			initialize(deck.arrayPerguntas[deck.faceis[randPerg]], deck.categoria, ordem);
		} else if (dificuldade == 'm') {
			initialize(deck.arrayPerguntas[deck.medias[randPerg]], deck.categoria, ordem);
		} else if (dificuldade == 'd') {
			initialize(deck.arrayPerguntas[deck.dificeis[randPerg]], deck.categoria, ordem);
		}
		
	}

	
	/**
	 * Create the frame.
	 */
	public void initialize(Pergunta pergunta, String categoria, int[] ordem ) {
		
		setBackground(Color.WHITE);
		setTitle("Tela Perguntas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrecho_inicial = new JLabel(pergunta.pergunta);
		lblTrecho_inicial.setForeground(Color.WHITE);
		lblTrecho_inicial.setFont(new Font("Pagul", Font.BOLD, 16));
		lblTrecho_inicial.setBounds(35, 162, 740, 39);
		contentPane.add(lblTrecho_inicial);
		
		JLabel lblCategoria = new JLabel(categoria);
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Pagul", Font.BOLD, 57));
		lblCategoria.setBounds(252, 42, 312, 84);
		contentPane.add(lblCategoria);
		
		JButton btnLetraA = new JButton(pergunta.alternativa[ordem[0]]);
		btnLetraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ordem[0] == 0) {
					//correto
					System.out.print("correto!");
				}
				else {
					//errado
					System.out.print("errado!");
				}
			}
		});
		btnLetraA.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraA.setBackground(new Color(211, 214, 216));
		btnLetraA.setForeground(new Color(5, 61, 87));
		btnLetraA.setBounds(35, 306, 350, 50);
		contentPane.add(btnLetraA);
		
		JButton btnLetraB = new JButton(pergunta.alternativa[ordem[1]]);
		btnLetraB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ordem[1] == 0) {
					//correto
					System.out.print("correto!");
				}
				else {
					//errado
					System.out.print("errado!");
				}
			}
		});
		btnLetraB.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraB.setBackground(new Color(211, 214, 216));
		btnLetraB.setForeground(new Color(5, 61, 87));
		btnLetraB.setBounds(411, 305, 350, 52);
		contentPane.add(btnLetraB);
		
		JButton btnLetraC = new JButton(pergunta.alternativa[ordem[2]]);
		btnLetraC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ordem[2] == 0) {
					//correto
					System.out.print("correto!");
				}
				else {
					//errado
					System.out.print("errado!");
				}
			}
		});
		btnLetraC.setFont(new Font("Pagul", Font.BOLD, 20));
		btnLetraC.setBackground(new Color(211, 214, 216));
		btnLetraC.setForeground(new Color(5, 61, 87));
		btnLetraC.setBounds(35, 427, 350, 52);
		contentPane.add(btnLetraC);
		
		JButton btnLetraD = new JButton(pergunta.alternativa[ordem[3]]);
		btnLetraD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ordem[3] == 0) {
					//correto
					System.out.print("correto!");
					
				}
				else {
					//errado
					System.out.print("errado!");
				}
			
			}
		});
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
