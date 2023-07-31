package Animais;

public class Cachorro {
	
	//Atributos

	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private int tamanhoDoRabo;
	private String estadoDeEspirito;
	
	//Construtores
	
	public Cachorro() {}

	public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.tamanhoDoRabo = tamanhoDoRabo;
		this.estadoDeEspirito = estadoDeEspirito;
	}
	
	//Metodos
	
	public String getNome(String string) {
		return this.nome;
	
	}

	public void setNome(String nome) {
		if (nome.equals("Lily")) {
			this.nome = null;
		}
		this.nome = nome;
	}
	
	
	
	public String getCor(String string) {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura(int i) {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso(double d) {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoDoRabo() {
		return tamanhoDoRabo;
	}

	public void setTamanhoDoRabo(int tamanhoDoRabo) {
		this.tamanhoDoRabo = tamanhoDoRabo;
	}

	public String getEstadoDeEspirito(int i) {
		return estadoDeEspirito;
	}

	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}

	public void comer(){}
	
	public void latir(){
		System.out.println("AU AU");
	}
	
	public String pegar() {
		return "Bolinha";
	}
	
	public String interagir(String acao) {
		
		switch (acao) {
			case "carinho": this.estadoDeEspirito = "feliz"; break;
			case "vai dormir": this.estadoDeEspirito = "bravo"; break;
			case "pisar ba patinha": this.estadoDeEspirito = "triste"; break;
			default: this.estadoDeEspirito = "neutro"; break;
		}
		
		return estadoDeEspirito;
		
		//if (acao.equals("carinho")) {
		//	this.estadoDeEspirito = "feliz";
		//} else if (acao.equals("vai dormir")){
		//	this.estadoDeEspirito = "bravo";
		//} else {
		//	this.estadoDeEspirito = "neutro";
		//}
		//return estadoDeEspirito;
	
		
	}
}
