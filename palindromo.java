

public class palindromo {
	/**
	 * Após receber uma String como argumento, e inverte a mesma em outra String, se as duas forem iguais, retorna true, se não, false. 
	 * @param texto
	 * @param palindromo
	 * @param i
	 * @return
	 */
	private static boolean verificaPalindromo(String texto, String palindromo, int i) {
		boolean resultado;
		if (i >= 0 ) {
			resultado = verificaPalindromo(texto, palindromo + texto.charAt(i), i-1);
		}
		else {
			if (palindromo.equals(texto)) {
				resultado = true;
			}
			else {
				resultado = false;
			}
		}
		return resultado;
	}
	public static boolean verificaPalindromo(String texto)
	{
		return verificaPalindromo(texto, "", texto.length()-1);
	}
	public static void main(String[] args){
		String texto, parada = "FIM";
		boolean palindromo;
		
		texto = MyIO.readLine();
		while(!texto.equals(parada)){			
			palindromo = verificaPalindromo(texto);
			if (palindromo) {
				MyIO.println("SIM");
			}
			else {
				MyIO.println("NAO");
			}
			texto = MyIO.readLine();			
			
		} 
		
	}

}
