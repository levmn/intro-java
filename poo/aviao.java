/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta
classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package poo;

public class aviao {
	private String corAviao;
	private String porteAviao;
	private String nomeProprietario;
	
	public void imprimir(){
		// TODO Auto-generated method stub
		System.out.println("\nA cor do avi�o � "+corAviao+". \nO porte do avi�o � "+porteAviao+". \nO propriet�rio da aeronave � "+nomeProprietario+".");
	}	

	public aviao (String corAviao, String porteAviao, String nomeProprietario){
		this.corAviao=corAviao;
		this.porteAviao=porteAviao;
		this.nomeProprietario=nomeProprietario;
	}

	public String getCorAviao() {
		return corAviao;
	}

	public void setCorAviao(String corAviao) {
		this.corAviao = corAviao;
	}

	public String getPorteAviao() {
		return porteAviao;
	}

	public void setPorteAviao(String porteAviao) {
		this.porteAviao = porteAviao;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}	
}
