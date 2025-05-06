package br.dev.leonardo.calculadora_ip.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCalculadora {

	// ==========ATRIBUTOS==========
	private JLabel labelIp;
	private JTextField textPrimeiroOcteto;
	private JLabel labelSeparadorPrimeiroOcteto;
	private JTextField textSegundoOcteto;
	private JLabel labelSeparadorSegundoOcteto;
	private JTextField textTerceiroOcteto;
	private JLabel labelSeparadorTerceiroOcteto;
	private JTextField textQuartoOcteto;
	private JLabel labelSeparadorMascara;
	private JTextField textMascara;

	// ==========FONTES==========

	// ==========MÉTODO PARA CRIAR TELA GRÁFICA==========
	public void criarTelaCalculadora() {
		// ==========CRIANDO TELA GRÁFICA==========
		// Criando objeto JFrame
		JFrame tela = new JFrame();

		// Definindo o tamanho da tela através
		// de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(505, 700);

		// "Setando" tamanho da tela através de um objeto Dimension
		tela.setSize(tamanho);

		// Definindo "configurações" da tela
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora de Sub-rede");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// Label IP
		labelIp = new JLabel();
		labelIp.setText("Digite aqui o IP:");
		labelIp.setBounds(30, 30, 90, 30);
		tela.getContentPane().add(labelIp);

		// Text Primeiro Octeto
		textPrimeiroOcteto = new JTextField();
		textPrimeiroOcteto.setBounds(125, 30, 30, 25);
		tela.getContentPane().add(textPrimeiroOcteto);

		// label Separador Primeiro Octeto
		labelSeparadorPrimeiroOcteto = new JLabel();
		labelSeparadorPrimeiroOcteto.setText(".");
		labelSeparadorPrimeiroOcteto.setBounds(156, 30, 7, 30);
		tela.getContentPane().add(labelSeparadorPrimeiroOcteto);

		// Text Segundo Octeto
		textSegundoOcteto = new JTextField();
		textSegundoOcteto.setBounds(163, 30, 30, 25);
		tela.getContentPane().add(textSegundoOcteto);

		// label Separador Segundo Octeto
		labelSeparadorSegundoOcteto = new JLabel();
		labelSeparadorSegundoOcteto .setText(".");
		labelSeparadorSegundoOcteto.setBounds(194, 30, 7, 30);
		tela.getContentPane().add(labelSeparadorSegundoOcteto);

		// Text Terceiro Octeto
		textTerceiroOcteto = new JTextField();
		textTerceiroOcteto.setBounds(202, 30, 30, 25);
		tela.getContentPane().add(textTerceiroOcteto);

		// label Separador Segundo Octeto
		labelSeparadorTerceiroOcteto = new JLabel();
		labelSeparadorTerceiroOcteto.setText(".");
		labelSeparadorTerceiroOcteto.setBounds(233, 30, 7, 30);
		tela.getContentPane().add(labelSeparadorTerceiroOcteto);

		tela.setVisible(true);
	}
}
