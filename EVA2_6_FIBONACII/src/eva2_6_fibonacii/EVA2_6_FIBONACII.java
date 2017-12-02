/*
FIBONACCI
 */
package eva2_6_fibonacii;

/**
 *
 * @author 16550518
 */
public class EVA2_6_FIBONACII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < 10; i++) {
            System.out.print(calcularFIBONACCI(i) + " - ");
        }
    }

    public static int calcularFIBONACCI(int iPos) {

//        if(iPos==0){
//            return 0;
//        }else if(iPos==1){
//            return 1;
//        }else{
//            return calcularFIBONACCI(iPos-1)+calcularFIBONACCI(iPos-2);
//        }
        switch (iPos) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return calcularFIBONACCI(iPos - 1) + calcularFIBONACCI(iPos - 2);

        }

    }
}
