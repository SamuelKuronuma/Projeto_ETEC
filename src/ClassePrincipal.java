
public class ClassePrincipal {

	public static void main(String[] args) {
		
		//Objeto = Instância da Classe
		ClassePessoa victor = new ClassePessoa();
		ClassePessoa luiz = new ClassePessoa("Luis", 15);
		ClassePessoa rafael = new ClassePessoa();
		
		luiz.setNome("Luiz");
		
		System.out.println(victor.getNome());
		System.out.println(luiz.getNome());
		

	}

}
