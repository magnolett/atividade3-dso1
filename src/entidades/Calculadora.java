package entidades;

public class Calculadora {
	private double n1;
	private double n2;
	
	private double adicao(double n1, double n2) {
		return n1 + n2;	
	}
	
	private double subtracao (double n1, double n2) {
		return n1 - n2;
	}
	
	private double multiplicacao (double n1, double n2) {
		return n1 * n2;
	}
	
	private double divisao (double n1, double n2) {		
		return n1/n2;
	}
	
	private double fatorial (double n1) {
		int fatorial = 1; 
		for (int i = 2; i <= n1; i++) {
			fatorial *= i; 
		}
		return fatorial; 
	}
	
	private double exponencial (double n1) {		
		return Math.exp(n1);
	}
	
	private double raizquadrada (double n1) {
		return Math.sqrt(n1);
	}
	
	private double raizcubica (double n1) {
		return Math.pow(n1, (1/3));
	}
	
	private double porcentagem (double n1, double n2) { //primeiro número é a porcentagem do segundo número
		return (n1*n2)/100; 
	}
	
	private double quadrado (double n1) {
		return n1 * n1; 
	}
	
	private double cubo (double n1) {
		double aux = n1 * n1; 
		return aux * n1;
	}
	
	private double xy (double n1, double n2) {
		double resultado = n1; 
		for (int i = 0; i <= n2; i++) {
			resultado *= n1;
		}
		
		return resultado; 
	}
}
