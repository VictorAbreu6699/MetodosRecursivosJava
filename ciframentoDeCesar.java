public class ciframentoDeCesar {
	/**
	 * Após receber uma String como argumento, desloca cada caractere 3 casas(de acordo com a tabela ASCII) e retorna uma String Criptografada  
	 * @param i
	 * @param texto
	 * @param textoCripto
	 * @return
	 */
	private static String criptografa(int i, String texto, String textoCripto)
	{
		String resultado;
		if (i < texto.length()) {			
			resultado = criptografa(i+1, texto, textoCripto + ((char)((int)texto.charAt(i) + 3)));						
		}
		else {
			resultado = textoCripto; 
		}
		return resultado;
	}
	public static String criptografa(String texto)
	{
		return criptografa(0, texto, "");
	}
	public static void main(String[] args){
		String texto = "", parada = "FIM";		
		
		texto = MyIO.readLine();
		while (!texto.equals(parada)) {		
			MyIo.println(criptografa(texto));
			texto = MyIO.readLine();
		} 
		
		
		
		
	}
}
