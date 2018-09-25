package listaSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		int quantidade;
		String nomeFuncionario;
		double salarioFuncionario;
		int idFuncionario;
		List<Funcionario> lista = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de funcionários:");
		quantidade = s.nextInt();
		System.out.println("Digite o id do funcionário:");
		idFuncionario = s.nextInt();
		System.out.println("Digite o nome:");
		nomeFuncionario = s.next();
		System.out.println("digite o salário:");
		salarioFuncionario = s.nextDouble();
		
		Funcionario f = new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario);
		
		lista.add(f);
		
	

	}

}
