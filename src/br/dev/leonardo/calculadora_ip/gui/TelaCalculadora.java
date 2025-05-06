package br.dev.leonardo.calculadora_ip.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCalculadora {
	
	//==========ATRIBUTOS==========
	private JLabel labelIp;
	private JLabel labelSeparadorPrimeiroOcteto;
	private JTextField textPrimeiroOcteto;
	private JLabel labelSeparadorSegundoOcteto;
	private JTextField textSegundoOcteto;
	private JLabel labelSeparadorTerceiroOcteto;
	private JTextField textQuartoOcteto;
	private JLabel labelSeparadorMascara;
	
	//==========FONTES==========
	
	
	//==========MÉTODO PARA CRIAR TELA GRÁFICA==========
	public void criarTelaCalculadora() {
		//==========CRIANDO TELA GRÁFICA==========
		//Criando objeto JFrame
		JFrame tela = new JFrame();
		
		
		//Definindo o tamanho da tela através
		//de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(505, 700);
		
		//"Setando" tamanho da tela através de um objeto Dimension
		tela.setSize(tamanho);
		
		//Definindo "configurações" da tela
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora de Sub-rede");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		tela.setVisible(true);
	}
}
