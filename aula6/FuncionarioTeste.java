package atividade6;

public class FuncionarioTeste {

	public static void main(String[] args) {
	
		Funcionario funcionario1 = new Funcionario("Gabriel", "Guarda", "Souto Soares", 32, 777);
		Funcionario funcionario2 = new Funcionario("Césio", "Quimico", "Goiânia", 66, 137);
		
		
		System.out.println("\nInformações do funcionario(1)");
		funcionario1.visualizar();
		
		System.out.println("\nInformações do funcionario(2)");
		funcionario2.visualizar();
		
	}

}
