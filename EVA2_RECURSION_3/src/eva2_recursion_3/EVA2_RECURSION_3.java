/*
PROGRAMA QUE LA CALCULA LA POTENCIA DE UN NUMERO.
 */
package eva2_recursion_3;

/**
 *
 * @author 16550518
 */
public class EVA2_RECURSION_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La potencia de 12^8 es: "+calcularPotencia(12, 8));
        
    }
    
    public static int calcularPotencia(int iNum,int iPot){
        if (iPot!=1) {
            return iNum*calcularPotencia(iNum, iPot-1);
        }
        else{
            return iNum;
        }
    }
    
}
