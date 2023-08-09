package atividade6;

public class ClienteTeste {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Guilherme", "Martins", "Diadema", 22, 3392045);
        Cliente cliente2 = new Cliente("Ronaldinho", "Gaucho", "Porto Alegre", 43, 3385445);

        System.out.println("\nInformações do Cliente 1:");
        cliente1.visualizar();

        System.out.println("\nInformações do Cliente 2:");
        cliente2.visualizar();
    }
}
