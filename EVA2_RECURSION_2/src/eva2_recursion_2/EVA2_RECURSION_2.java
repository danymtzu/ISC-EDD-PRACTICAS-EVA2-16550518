/*
PROGRAMA QUE ELIMINA LETRAS DE UNA CADENA DE TEXTO
 */
package eva2_recursion_2;

/**
 *
 * @author 16550518
 */
public class EVA2_RECURSION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sCadena = " helote " +" hoso "+" hojoh ";
                System.out.print(sCadena);
                System.out.println("");
		System.out.println(quitarLetra('h', sCadena));
    }
    
    public static String quitarLetra(char c, String s) {
	
        if(s.length() > 0) {
            
            if(s.charAt(0) == c) {
                    return quitarLetra(c, s.substring(1));
            }
                    return s.substring(0, 1).concat(quitarLetra(c, s.substring(1)));
	}
	
        return "";
	
    }
    
}
