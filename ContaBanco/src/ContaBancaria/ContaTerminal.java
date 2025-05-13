package ContaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- CRIAR UMA CONTA NO (DIOBANCK) ---");
		System.out.println();
		
		System.out.println("Primeiro passo -> informe seu nome completo !");
		System.out.print("Nome completo: ");
		String nomeDoCliente = sc.nextLine();
		System.out.println();

		System.out.println("Segundo passo -> informe o numero que deseja para sua conta !");
		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		System.out.println();

		System.out.println("Terceiro passo -> informe o valor que você deseja depositar na sua conta !");
		System.out.print("Valor do deposito: R$");
		double saldo = sc.nextDouble();
		System.out.println();


		System.out.println("Quarto passo -> informe o número da agência que você deseja!");
		System.out.print("Número da agência: ");
		String agencia = sc.next();
		int conversao = Integer.parseInt(agencia);		
		System.out.println();

		
		System.out.println("--- CONTA CRIADA NO (DIOBANCK), COM SUCESSO! ---");
		System.out.println();

		System.out.println("ACESSE A SUA CONTA AGORA MESMO: ");
		System.out.println();
		
		System.out.println("Por favor, digite o numero da sua agência !");
		System.out.print("Número da agência: ");
		String verificarAgencia = sc.next();
		int conversao02 = Integer.parseInt(verificarAgencia);
		System.out.println();

		while(conversao02 != conversao) {
			
		System.out.println("Número da agência INCORRETO, informe o numero da sua agência corretamente:");
		 verificarAgencia = sc.next();
		 conversao02 = Integer.parseInt(verificarAgencia);

		}
		System.out.println();
		
		System.out.println("Usuário: " + numero );
		
		System.out.println();

			
		System.out.println("Olá: " + nomeDoCliente 
			+ ", obrigado por criar uma conta em nosso banco, sua agência é [" + agencia
			+ "], conta [" + numero
			+ "] e o seu saldo R$" + saldo
			+ " já disponivel para saque!");

		sc.close();
	}
}