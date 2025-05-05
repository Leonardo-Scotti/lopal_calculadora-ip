package br.dev.leonardo.calculadora_ip.model;

public class Ipv4 {
	private int primeiroOcteto;    // Primeiro octeto do IP;
	private int segundoOcteto;     // Segundo octeto do IP;
	private int terceiroOcteto;    // Terceiro octeto do IP;
	private int quartoOcteto;      // Quarto e último octeto do IP;
	private int cidr;              // Máscara de sub-rede em formato CIDR. Ex: /24;
	private double mascaraDecimal; // Máscara de sub-rede em Decimal.      Ex: 255.255.255.0;
	private double mascaraBinario; // Máscara de sub-rede em Binário;
	private String classe;         // Classe do IP.                        Ex: A || B || C || D || E.

	// ==========Métodos Get==========
	public int getOcteto1() {
		return primeiroOcteto;
	}

	public int getOcteto2() {
		return segundoOcteto;
	}

	public int getOcteto3() {
		return terceiroOcteto;
	}

	public int getOcteto4() {
		return quartoOcteto;
	}

	public int getCidr() {
		return cidr;
	}

	public double getMascaraDecimal() {
		return mascaraDecimal;
	}

	public double getMascaraBinario() {
		return mascaraBinario;
	}

	public String getClasse() {
		String binario8bits = String.format("%8s", Integer.toBinaryString(primeiroOcteto)).replace(' ', '0');
		System.out.println(binario8bits);
		return binario8bits;
	}
	
	// ==========Métodos Set==========
	public void setOcteto1(int octeto1) {
		this.primeiroOcteto = octeto1;
	}

	public void setOcteto2(int octeto2) {
		this.segundoOcteto = octeto2;
	}

	public void setOcteto3(int octeto3) {
		this.terceiroOcteto = octeto3;
	}

	public void setOcteto4(int octeto4) {
		this.quartoOcteto = octeto4;
	}

	public void setCidr(int cidr) {
		this.cidr = cidr;
	}

}
