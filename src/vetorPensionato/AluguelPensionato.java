package vetorPensionato;

import java.util.Scanner;

public class AluguelPensionato {

	public static void main(String[] args) {
		String nome, email;
		int quarto;
		Quarto[] e = new Quarto[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Quantos estudantes irão alugar?");
		int quantidadeEstudantes = s.nextInt();
		
		for(int i = 0; i < quantidadeEstudantes; i++) {
			System.out.println("Estudante nº " +i);
			System.out.println("Nome: ");
			nome = s.next();
			System.out.println("Email: ");
			email = s.next();
			System.out.println("Quarto: ");
			quarto = s.nextInt();
			while(e[quarto]!= null) {
				System.out.println("Quarto ocupado, tente outro \nQuarto: ");
				quarto = s.nextInt();
			}
			e[quarto] = new Quarto(nome, email);
		}
		
		System.out.println("Quartos ocupados");
		for(int i = 0 ; i < e.length; i++) {
			if(e[i]!= null) {
				System.out.println(i+": "+ e[i].getNome() +", " +e[i].getEmail());
			}
		}
		
	}

}
