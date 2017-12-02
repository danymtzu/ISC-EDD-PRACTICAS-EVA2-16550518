/*
PROGRAMA QUE CALCCULA EL MAXICMO COMÚN DIVISOR
 */
package eva2_5_mcd;

/**
 *
 * @author 16550518
 */
public class EVA2_5_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idiv=180;
        int idivisor=48;
        System.out.println("El maximo comun divisor de " +idiv+ " y "+ idivisor+" es: "+ MCD(idiv, idivisor));
    }
    public static int MCD(int idiv, int idivisor){
        int iResiduo;
   
        if(idivisor==0){
            return idiv;
            
        }else{
            iResiduo=idiv%idivisor;
           return MCD(idivisor, iResiduo);
        }
    }
    
}
