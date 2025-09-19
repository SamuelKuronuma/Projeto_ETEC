
public class ClasseEndereco {

	String ruaAt;
	String cidadeAt;
	String estadoAt;
	
	public ClasseEndereco(String ruaPar, String cidadePar, String estadoPar) {
		this.ruaAt = ruaPar;
		this.cidadeAt = cidadePar;
		this.estadoAt = estadoPar;
		
	}
	
	public void setRua(String ruaPar) {
		this.ruaAt = ruaPar;
	}
	public void setCidade(String cidadePar) {
		this.cidadeAt = cidadePar;
	}
	public void setEstado(String estadoPar) {
		this.estadoAt = estadoPar;
	}
	public String getRua(){
		return ruaAt;
	}
	public String getCidade(){
		return cidadeAt;
	}
	public String getEstado(){
		return estadoAt;
	}
	
}