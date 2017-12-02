/*
SUMAR LOS DIGITOS DE UNA CANTIDAD
 */
package eva2_recursion_1;

/**
 *
 * @author 16550518
 */
public class EVA2_RECURSION_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de los dígitos es: "+ sumarDigitos(456));
    }
    
   public static int sumarDigitos(int iCifra){
        if (iCifra==0)
		return 0;
	else
		return ((iCifra%10) + sumarDigitos(iCifra/10));
        
    }
    
}
