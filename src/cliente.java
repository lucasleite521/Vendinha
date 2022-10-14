import java.util.Scanner;


public class cliente{

	public static void main(String[] args ){
	
	System.out.println("      \n || seja bem-vindo a nossa vendinha, faça seus pedidos || \n            ");
	
	
	int login = 1409994147;
	int senha = 6666;

	
	Scanner entrada = new Scanner(System.in);
	String str;
	System.out.println(" entre com seu nome: ");
	str = entrada.nextLine();
	System.out.println(str + ", " + "você já possui cadastro na vendinha?");
	
	System.out.println("[1] SIM");
	System.out.println("[2] NÃO");
	int escolha = entrada.nextInt();
	 
	if ( escolha == 1){
		System.out.println("digite seu CPF: ");
		
		int cadastro1 = entrada.nextInt();
		
		System.out.println("digite sua senha: ");
		
		int senha1 = entrada.nextInt();
		
		if(cadastro1 == login && senha1== senha){
			System.out.println("acesso autorizado!");
		}
		else{
			System.out.println(" CPF ou senha inválidos");
		}
	if(escolha == 2){
			System.out.println("Digite seu CPF: ");

			int cadastro2 = entrada.nextInt();

			System.out.println("digite uma senha numérica de 4 á 6 caractéres");

			int senha2 = entrada.nextInt();





		}

	 };



	

}







}