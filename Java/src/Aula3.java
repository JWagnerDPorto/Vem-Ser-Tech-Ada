import Animais.Cachorro;

public class Aula3 {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro("Puppy","Marrow", 25, 5.5,5, "nada");
		
		System.out.println(cachorro2.getNome(null));
		System.out.println(cachorro2.getPeso(0));
		
//		cachorro1.getNome("Puppy");
//		cachorro1.getCor("Marron");
//		cachorro1.getAltura(25);
//		cachorro1.getPeso(5.5);
//		cachorro1.getEstadoDeEspirito(5);
		
//		cachorro1.nome = "Puppy";
//		cachorro1.cor = "Marron";
//		cachorro1.altura = 25;
//		cachorro1.peso = 5.5;
//		cachorro1.tamanhoDoRabo = 5;
		
		//cachorro1.latir();
		//System.out.println("O cachorro pegou uma " + cachorro1.pegar());

		System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
		System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
		System.out.println("O cachorro está " + cachorro1.interagir("nada"));
	}

}
