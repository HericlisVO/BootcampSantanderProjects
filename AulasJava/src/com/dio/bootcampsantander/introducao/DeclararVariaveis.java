package com.dio.bootcampsantander.introducao;

public class DeclararVariaveis {

	public static void main(String[] args) {
		
		int i ;
		// int i; 
		//nao pode ser repitida
		// é case sensitive
		
		int I;
		
		// int 1a; não pode começar com numero
		//nao é uma boa pratica começar com _
		int _1a;
		// _1a;
		
		//não é boa pratica coloca caracter especial no começo
		int $aq;
		
		
		// atribuindo valores para variaveis
		i = 5;
		
		I= 3;
		
		_1a = 40;
		
		$aq = 13;
		
		
		//não pode ser alterada
		final int j = 10;
		
		
		// j = 15;
		
		int asrm24435md;
		
		// não pode ter espaço
		//int asrm24 435md;
		
		//não é uma boa pratica usar _
		int asrm244_35md;
		
		//não pode conter caracteres especiais reservados
		
		//int asrm24435%md;
		
		//atribuindo valor a variaveis
		
		asrm244_35md = 40;
		
		asrm24435md = 20;
		
		
		//int QuantidadeProduto; ma pratica de declaração  de variaveia
		
		
		//boa pratica para declaração de variaveis
		int quantidadeProduto;
		
		quantidadeProduto = 50;
		
		// boa pratica para declaração de constantes
		final int NUMERO_TENTATIVAS= 3;
		
		// final int numeros_Tentativas; má pratica para declarar contantes
	
		//má pratica para declarar variaveis
		int QUANTIDADE_OPCOES = 2000;
		
		
		//mostrando o valor das variaveis
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		
		
		System.out.println(j);
		System.out.println(asrm24435md);
		System.out.println(asrm244_35md);

		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);
		
	}
}
