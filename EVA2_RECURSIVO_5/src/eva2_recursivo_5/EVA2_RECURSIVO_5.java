/*
.
 */
package eva2_recursivo_5;

/**
 *
 * @author danym
 */
public class EVA2_RECURSIVO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(parentesisAnidados("()")==true){
            System.out.println("Los parentesis están anidados.");
        }else{
            System.out.println("Los parentesis no están anidados.");
        }
        
    }
    static int x;
    public static boolean parentesisAnidados(String sPar){
        if(sPar.length()>=x){
            if(x<sPar.length()){
                if(sPar.charAt(x)=='('&& sPar.length()-1==')'){
                    return parentesisAnidados(sPar.substring(x+1, sPar.length()-1));
                }else{
                    return false;
                   
                }
            }
        }
        return true;
    }
    
}
