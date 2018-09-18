package entidades;

public class Helper {

	public static int doubleParaInt(Double numero) {

		return numero.intValue();
	}
	
	public static boolean isInteiro(Double numero) {
		
		if(numero.toString().split(".")[1].substring(0, 1).equals("0")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double intParaDouble(Integer numero) {
		return numero.doubleValue();
	}
	
	

}
