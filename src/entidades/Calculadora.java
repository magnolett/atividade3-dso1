package entidades;

public class Calculadora {
	private double n1;
	private double n2;
	
	public double adicao(double n1, double n2) {
		return n1 + n2;	
	}
	
	public double subtracao (double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplicacao (double n1, double n2) {
		return n1 * n2;
	}
	
	public double divisao (double n1, double n2) {		
		return n1/n2;
	}
	
	public double fatorial (double n1) {
		int fatorial = 1; 
		for (int i = 2; i <= n1; i++) {
			fatorial *= i; 
		}
		return fatorial; 
	}
	
	public double exponencial (double n1) {		
		return Math.exp(n1);
	}
	
	public double raizquadrada (double n1) {
		return Math.sqrt(n1);
	}
	
	public double raizcubica (double n1) {
		return Math.pow(n1, (1/3));
	}
	
	public double porcentagem (double n1, double n2) { //primeiro n�mero � a porcentagem do segundo n�mero
		return (n1*n2)/100; 
	}
	
	public double quadrado (double n1) {
		return n1 * n1; 
	}
	
	public double cubo (double n1) {
		double aux = n1 * n1; 
		return aux * n1;
	}
	
	public double xy (double n1, double n2) {
		double resultado = n1; 
		for (int i = 1; i < n2; i++) {
			resultado *= n1;
		}
		
		return resultado; 
	}
}
