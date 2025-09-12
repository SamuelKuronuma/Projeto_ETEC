
public class ClassePrincipal {

	public static void main(String[] args) {
		
		//Objeto = Instância da Classe
		ClassePessoa victor = new ClassePessoa();
		ClassePessoa luiz = new ClassePessoa("Luis", 15);
		ClassePessoa rafael = new ClassePessoa();
		
		luiz.setNome("Luiz");
		victor.setNome("Victor");
		rafael.setIdade(16);
		
		System.out.println(victor.getNome());
		System.out.println(luiz.getNome());
		System.out.println(rafael.getNome());
		System.out.println(victor.getIdade());
		System.out.println(luiz.getIdade());
		System.out.println(rafael.getIdade());
		

	}

}
