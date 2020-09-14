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
			if (texto.charAt(i) != '\n') {
				resultado = criptografa(i+1, texto, textoCripto + ((char)((int)texto.charAt(i) + 3)));
			}
			else {
				resultado = criptografa(i+1, texto, textoCripto + texto.charAt(i));
			}
			
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
		String aux, texto = "", parada = "FIM";		
		
		aux = MyIO.readLine();
		while (!aux.equals(parada)) {		
			texto += aux + "\n";		
			aux = MyIO.readLine();
		} 
		
		MyIO.println(criptografa(texto));
		
		
	}
}
