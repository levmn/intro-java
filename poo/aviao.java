/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto avião, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package poo;

public class aviao {
	private String corAviao;
	private String porteAviao;
	private String nomeProprietario;
	
	public void imprimir(){
		// TODO Auto-generated method stub
		System.out.println("\nA cor do avião é "+corAviao+". \nO porte do avião é "+porteAviao+". \nO proprietário da aeronave é "+nomeProprietario+".");
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
