package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
		
	
	
	Scanner scanner = new Scanner(System.in);
	int num, exp, resultado =1 , contador=0;
	
	System.out.print("Digite o numero: ");
    num = scanner.nextInt();
     
    System.out.print("Digite outro numero: ");
    exp = scanner.nextInt();
    
    while (contador < exp) {
    	resultado *= num;
    	contador ++;
    }
    System.out.println("O resultadoe é " + resultado);
   }
}
