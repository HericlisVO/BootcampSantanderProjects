package com.dio.bootcampsantander.controledefluxo;

public class ControleDeFluxo {

	public static void main(String[] args) {
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
		
		switchSemana();
		switchNumero();
		switchFerias();
		
	}


	
	// Má pratica de programação evitar sempre 
	private static void ifFlecha() {
		// TODO Auto-generated method stub
		
		int mes = 11;
		
		if(mes == 1) {
			System.out.println("Janeiro");
		}else {
			if(mes == 2) {
				System.out.println("Fevereiro");
			}else {
				if(mes == 3) {
					System.out.println("Março");
				}else {
					if(mes == 4) {
						System.out.println("Abril");
					}else {
						if(mes == 5) {
							System.out.println("Maio");
						}
						else {
							if(mes == 6) {
								System.out.println("Junho");
							}else {
								if(mes == 7) {
									System.out.println("Julho");
								}else {
									if(mes == 8) {
										System.out.println("Agosto");
									}else {
										if(mes == 9) {
											System.out.println("Setembro");
										}else {
											if(mes == 10) {
												System.out.println("Outubro");
											}else {
												if(mes == 11) {
													System.out.println("Novembro");
													
												}else {
													if(mes == 12) {
														System.out.println("Dezembro");
													}else {
														System.out.println("Mês indefinido!");
													}
												}
											}
										}
										
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void ifSemFlecha() {
		// TODO Auto-generated method stub
		int mes = 11;
		
		if (mes == 1) {
			System.out.println("Janeiro");
			
		}else if(mes == 2) {
			System.out.println("Fevereiro");
		}else if(mes == 3) {
			System.out.println("Março");
		}else if(mes == 4) {
			System.out.println("Abril");
		}else if(mes == 5) {
			System.out.println("Maio");
		}else if(mes == 6) {
			System.out.println("Junho");
		}else if(mes == 7) {
			System.out.println("Julho");
		}else if(mes == 8) {
			System.out.println("Agosto");
		}else if(mes == 9) {
			System.out.println("Setembro");
		}else if(mes == 10) {
			System.out.println("Outubro");
		}else if(mes == 11) {
			System.out.println("Novembro");
		}else if(mes == 12) {
			System.out.println("Dezembro");
		}else {
			System.out.println("Mes indefinido");
		}
	}

	
	private static void ifFerias() {
		// TODO Auto-generated method stub
		
		String mes = "Dezembro";
		
		if(mes =="Dezembro" || mes == "Junlho" || mes == "Janeiro") {
			System.out.println("Férias");
		}
	
	}
	
	
	private  static void ifMenor() {
		// TODO Auto-generated method stub
		double salarioMensal = 12233.434d;
		double mediaSalario = 1234.543d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		if((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionario deve receber Auxilio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionário deve receber Auxilio.");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if(recebeAuxilio) {
			System.out.println("Funcionário deve receber Auxilio. ");
		
		}else {
			System.out.println("Funcionário não deve receber Auxilio.");
		}
	}
	
	
	private static void switchSemana() {
		// TODO Auto-generated method stub
			String dia = "Terça";
			
			switch(dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Terça":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
			case "Sexta":
				System.out.println(6);
				break;
			case "Sabado":
				System.out.println(7);
				break;
			case "Domingo:":
				System.out.println(1);
				break;
			default:
				System.out.println("Dia Invalido");
				break;
			
			}
	}
	
	
	private static void switchNumero() {
		// TODO Auto-generated method stub
		int numero = 4;
		switch(numero){
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talvez");
			break;
		default:
			System.out.println("Valor indefinido");
			break;
			
		}
	}
	
	private static void switchFerias() {
		// TODO Auto-generated method stub
		String mes = "Novembro";
		switch (mes) {
		case "dezembro":
		case "julho":
		case "Novembro":
			System.out.println("Férias");
			break;
		default:
			System.out.println("Mês Indefinido");
			break;
		}
	}
	
	

}
