package ex_poo1;

public class InfoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro c = new Cachorro("Belinha", 5, "auau", true);
		Cavalo cv = new Cavalo("Potoc�", 7, "irrinh�", true);
		Preguica p = new Preguica("Flecha", 4, "*bocejo*", true);
		
		c.imprimir();
		cv.imprimir();
		p.imprimir();
	}

}
