package ex_poo2;

public class InfoAnimal {

	public static void main(String[] args) {
				
		Cachorro c = new Cachorro("Arcanine", 10);
		Cavalo cv = new Cavalo("Ponyta", 7);
		Preguica p = new Preguica("Slakoth", 4);
		
		//c.cadastro();
		//c.locomover();
		c.emitirSom();
		
		//cv.cadastro();
		//cv.locomover();
		cv.emitirSom();
		
		//p.cadastro();	
		//p.locomover();
		//p.subir();
		p.emitirSom();	
		
	}

}
