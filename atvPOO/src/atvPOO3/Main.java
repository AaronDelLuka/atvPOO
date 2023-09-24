package atvPOO3;

import java.util.Scanner;

/**
 * A classe Funcionario representa um funcionário com nome, idade, cargo,
 * salário, telefone e endereço.
 */
class Funcionario {
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;

	/**
	 * Cria um funcionário com os dados fornecidos.
	 *
	 * @param nome     Nome do funcionário.
	 * @param idade    Idade do funcionário.
	 * @param cargo    Cargo do funcionário.
	 * @param salario  Salário do funcionário.
	 * @param telefone Telefone do funcionário.
	 * @param endereco Endereço do funcionário.
	 */
	public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	/**
	 * Retorna os dados do funcionário no formato: Nome: [nome] Idade: [idade]
	 * Cargo: [cargo] Salário: [salario] Telefone: [telefone] Endereço: [endereco]
	 *
	 * @return Os dados do funcionário formatados.
	 */
	public String exibe() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalário: " + salario + "\nTelefone: "
				+ telefone + "\nEndereço: " + endereco;
	}
}

/**
 * A classe Cadastro é responsável por manter um vetor de funcionários e
 * realizar operações de cadastro e exibição.
 */
class Cadastro {
	private Funcionario[] funcionarios;
	private int numFuncionarios;

	/**
	 * Cria um cadastro com um tamanho máximo para o vetor de funcionários.
	 *
	 * @param tamanhoMaximo Tamanho máximo do vetor de funcionários.
	 */
	public Cadastro(int tamanhoMaximo) {
		funcionarios = new Funcionario[tamanhoMaximo];
		numFuncionarios = 0;
	}

	/**
	 * Adiciona um funcionário ao vetor de cadastro.
	 *
	 * @param funcionario Funcionário a ser cadastrado.
	 */
	public void cadastrar(Funcionario funcionario) {
		if (numFuncionarios < funcionarios.length) {
			funcionarios[numFuncionarios] = funcionario;
			numFuncionarios++;
		} else {
			System.out.println("Erro: Não é possível cadastrar mais funcionários. Limite atingido.");
		}
	}

	/**
	 * Imprime os dados de todos os funcionários cadastrados.
	 */
	public void imprimirCadastro() {
		System.out.println("=== Cadastro de Funcionários ===");
		for (int i = 0; i < numFuncionarios; i++) {
			System.out.println("Funcionário #" + (i + 1) + ":\n" + funcionarios[i].exibe() + "\n");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10); // Define o tamanho máximo do cadastro como 10.

		// Solicita ao usuário informações para cadastrar funcionários.
		for (int i = 0; i < 2; i++) { // Neste exemplo, cadastraremos 2 funcionários.
			System.out.println("Cadastro do Funcionário #" + (i + 1));
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer de entrada.
			System.out.print("Cargo: ");
			String cargo = scanner.nextLine();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Telefone: ");
			String telefone = scanner.nextLine();
			System.out.print("Endereço: ");
			String endereco = scanner.nextLine();

			Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
			cadastro.cadastrar(funcionario);
		}

		// Imprime o cadastro de funcionários.
		cadastro.imprimirCadastro();

		scanner.close();
	}
}
