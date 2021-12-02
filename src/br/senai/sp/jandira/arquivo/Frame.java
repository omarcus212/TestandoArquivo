package br.senai.sp.jandira.arquivo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextPane;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.WHITE);
		textPane.setBackground(Color.GRAY);
		textPane.setBounds(27, 40, 168, 188);
		contentPane.add(textPane);
		
		JButton btngravar = new JButton("Gravar");
		btngravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btngravar.setBounds(280, 40, 89, 23);
		contentPane.add(btngravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(280, 84, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton bbtnsair = new JButton("sair");
		bbtnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bbtnsair.setBounds(280, 129, 89, 23);
		contentPane.add(bbtnsair);
		
		btngravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String caminho = "C:\\Users\\21276377\\eclipse-workspace\\AQV\\dados";
				
				Arquivo arquivo = new Arquivo();
				arquivo.gravar(caminho, textPane.getText());
			    String quabrarlinha = arquivo.ler(caminho)+textPane.getText();	
				
				
				
			}
		});
		
		bbtnsair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Frame frame = new Frame();
				System.exit(frame.EXIT_ON_CLOSE);
			}
		});
				
		int a = 0;
		
		btnLimpar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
       String caminho = "C:\\Users\\21276377\\eclipse-workspace\\AQV\\dados";//tirar
				
				Arquivo arquivo = new Arquivo();
				arquivo.gravar(caminho, textPane.getText());
			    String quabrarlinha = arquivo.ler(caminho)+textPane.getText();
			    
			    textPane.setText(null);
			    textPane.requestFocus();
			
				 
				
			}
		});
		
	
			
		
		
	}
}
