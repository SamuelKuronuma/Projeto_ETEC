
public class ClassePessoa {
	
	String nomeAt;
	int idadeAt;
	ClasseEndereco endereco;
	
	//Construtores
	public ClassePessoa() {
		
	}
	public ClassePessoa (String nomePar, int idadePar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	}
	
	//Getters
	public String getNome(){
		return nomeAt;
	}
	public int getIdade(){
		return idadeAt;
	}
	//Setters
	public void setNome(String nomePar){
		this.nomeAt = nomePar;
	}
	public void setIdade(int idadePar){
		this.idadeAt = idadePar;
	}
}
