package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class programFuncionarios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		List<Funcionario> funcionarios = new ArrayList<>();
		
		do {
			System.out.print("Quantos funcionarios vão ser registrados? ");
			int quantidade = sc.nextInt();

			for (int i = 0; i < quantidade; i++) {
				System.out.printf("\nFuncionario #%d\n", i + 1);
				System.out.print("Id: ");
				int id = sc.nextInt();
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Salario: ");
				double salario = sc.nextDouble();
				funcionarios.add(new Funcionario(id, nome, salario));
			}

			System.out.print("\nDigite o id do funcionario que terá o salario aumentado: ");
			int id = sc.nextInt();
			boolean funcionarioInexistente = true;

			for (Funcionario funcionario : funcionarios) {
				if (funcionario.getId() == id) {
					System.out.print("Digite a porcentagem: ");
					float porcentagem = sc.nextFloat();
					funcionario.aumentarSalario(porcentagem);
					funcionarioInexistente = false;
				}
			}

			if (funcionarioInexistente)
				System.out.println("Esse id nao existe!");

			System.out.println("\nLista dos funcionarios:");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}

			System.out.print("\nDeseja continuar (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();

	}
}
