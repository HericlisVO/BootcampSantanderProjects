package com.dio.bootcampsantander.operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// pós-fixados, prefixados, aritmetico e atribuição
		
		System.out.println("PresPos");
		prePos();
		System.out.println("Aritmético");
		aritmetico();
		
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedencia");
		precedencia();
		
	}
	
	private static void prePos() {
		int k = 10;
		int i = ++k;
		int j = k--;
		int h = k++; 
		int x = k;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("h = " + h);
		System.out.println("x = " + x);
		System.out.println("k = " + k);
		
		
	}
	public static void aritmetico() {
	
		int a = 10;
		
		int b = 10;
		int c = 20;
		int d = 30;
		int e = 40;
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d*b;
		int r4 = e/a;
		int r5 = c%b;
		
		
		System.out.println("a+b "+ r1);
		System.out.println("c-a " +r2);
		System.out.println("d*b " + r3);
		System.out.println("e/a "+ r4);
		System.out.println("c%b " + r5);
		
	}
	
	public static void atribuicao() {
		
	}
	
	public static void precedencia() {
		
	}
}
