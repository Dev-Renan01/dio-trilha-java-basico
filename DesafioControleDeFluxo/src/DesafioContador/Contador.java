package DesafioContador;

import java.util.Scanner;

import ExcecaoCriada.ParametroIlegalException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeito Pârametro");
		int parametro1 = sc.nextInt();
		
		System.out.println("Informe o segundo Pârametro");
		int  parametro2 = sc.nextInt();
				
		try {
			contar(parametro1, parametro2);	
		}
		
		catch(ParametroIlegalException e){
			
			System.out.println("Erro, Algo de inesperado aconteceu...\n" + e.getMessage());
			
		}	
		
		sc.close();
	}
	
	
	public static void contar(int parametro1, int parametro2)throws ParametroIlegalException {
			
		if(parametro1 > parametro2) { throw new ParametroIlegalException("O segundo parâmetro deve ser maior que o primeiro");}
		
		int Contagem = parametro2 - parametro1;
		
		for(int i = 1; i <= Contagem; i++) {
			System.out.println("número imprimido = " + i);
		}
	}
}




















