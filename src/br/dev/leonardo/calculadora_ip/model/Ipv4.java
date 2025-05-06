package br.dev.leonardo.calculadora_ip.model;

public class Ipv4 {
	private String primeiroOcteto; // Primeiro octeto do IP;
	private String segundoOcteto; // Segundo octeto do IP;
	private String terceiroOcteto; // Terceiro octeto do IP;
	private String quartoOcteto; // Quarto e último octeto do IP;
	private String cidr; // Máscara de sub-rede em formato CIDR. Ex: /24;
	private double mascaraDecimal; // Máscara de sub-rede em Decimal. Ex: 255.255.255.0;
	private double mascaraBinario; // Máscara de sub-rede em Binário;
	private String classe; // Classe do IP. Ex: A || B || C || D || E.

	// ==========MÉTODOS GET==========
	public String getPrimeiroOcteto() {
		return primeiroOcteto;
	}

	public String getSegundoOcteto() {
		return segundoOcteto;
	}

	public String getTerceiroOcteto() {
		return terceiroOcteto;
	}

	public String getQuartoOcteto() {
		return quartoOcteto;
	}

	public String getCidr() {
		return cidr;
	}

	public double getMascaraDecimal() {
		return mascaraDecimal;
	}

	public double getMascaraBinario() {
		return mascaraBinario;
	}

	public String getClasse() {
		String erro = "* Por favor, digite apenas números de IP válido (1-255)!";
		try {
			int numeroPrimeiroOcteto = Integer.parseInt(primeiroOcteto);
			if(numeroPrimeiroOcteto >= 1 && numeroPrimeiroOcteto <= 127) {
				this.classe = "A";
				System.out.println(classe);
				return classe;
			} else if (numeroPrimeiroOcteto >= 128 && numeroPrimeiroOcteto <= 191) {
				this.classe = "B";
				System.out.println(classe);
				return classe;
			} else if (numeroPrimeiroOcteto >= 192 && numeroPrimeiroOcteto <= 223) {
				this.classe = "C";
				System.out.println(classe);
				return classe;
			} else if (numeroPrimeiroOcteto >= 224 && numeroPrimeiroOcteto <= 239) {
				this.classe = "D";
				System.out.println(classe);
				return classe;
			} else if (numeroPrimeiroOcteto >= 240 && numeroPrimeiroOcteto <= 255) {
				this.classe = "E";
				System.out.println(classe);
				return classe;
			} else {
				System.out.println(erro);
				return erro;
			}
		} catch (Exception e) {
			System.out.println(erro);
			return erro;
		}
	}

	// ==========MÉTODOS SET==========

	public void setPrimeiroOcteto(String primeiroOcteto) {
		this.primeiroOcteto = primeiroOcteto;
	}

	public void setSegundoOcteto(String segundoOcteto) {
		this.segundoOcteto = segundoOcteto;
	}

	public void setTerceiroOcteto(String terceiroOcteto) {
		this.terceiroOcteto = terceiroOcteto;
	}

	public void setQuartoOcteto(String quartoOcteto) {
		this.quartoOcteto = quartoOcteto;
	}

	public void setCidr(String cidr) {
		this.cidr = cidr;
	}

}
