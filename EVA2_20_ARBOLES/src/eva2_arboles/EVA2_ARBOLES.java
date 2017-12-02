/*
PROGRAMA QUE EXPLICA COMO FUNCIONAN LOS ARBOLES.
 */
package eva2_arboles;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author administrador
 */
public class EVA2_ARBOLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arMiArbol=new Arbol();
        
        try {
            
        } catch (Exception ex) {
            Logger.getLogger(EVA2_ARBOLES.class.getName().log(Level.SEVERE,null, ex));
        }
//        try{
//            arMiArbol.agregarNuevoNodo(new Nodo(100));
//            arMiArbol.agregarNuevoNodo(new Nodo(101));
//            arMiArbol.agregarNuevoNodo(new Nodo(97));
//            arMiArbol.agregarNuevoNodo(new Nodo(80));
//            arMiArbol.agregarNuevoNodo(new Nodo(115));
//            arMiArbol.agregarNuevoNodo(new Nodo(114));
//            arMiArbol.imprimirPreOrder();
//        }catch(Exception ex){
//            Logger.getLogger(EVA2_ARBOLES.class.getName()).log(Level.SERVE, null,ex);
//        }
//        
    }
    
}

class Nodo{
    private Nodo nIzq;
    private Nodo nDerch;
    private int iVal;
    
    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDerch = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nIzq = null;
        nDerch = null;

    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDerch() {
        return nDerch;
    }

    public void setnDerch(Nodo nDerch) {
        this.nDerch = nDerch;
    }

    
    
    
}

class Arbol{
     private Nodo nRoot;
     public Arbol(){
         nRoot=null;
     }
     public Arbol(Nodo nNodo){
         nRoot= nNodo;
     }
     
     public void agregarNuevoNodo(Nodo nNodo)throws Exception{
         agregarNodo(nRoot, nNodo);
     }
     
     public void agregarNodo(Nodo nActual, Nodo nNodo)throws Exception{
         if(nRoot==null){
             nRoot=nNodo;
         }else{
             if(nNodo.getiVal()<nActual.getiVal()){//MENOR
                 if(nActual.getnIzq()==null){//POSICIÒN VACIA (NULL) AQUI VA
                     nActual.setnIzq(nNodo);
                 }else{//AQUI HAY NODO
                     agregarNodo(nActual.getnIzq(), nNodo);
                 }
             }else if(nNodo.getiVal() >nActual.getiVal()){//MAYOR
                 if(nActual.getnDerch()==null){
                     nActual.setnDerch(nNodo);
                 }else{
                     agregarNodo(nActual.getnDerch(), nNodo);
                 }
             }else{//VALORES IGUALES NO ACEPTAMOS.
                 throw new Exception("NO SE ACEPTAN VALORES REPETIDOS");
             }
         }
     }
     
     public void imprimirPreOrder(){
         impPo(nRoot);
     }
     
    public void impPo(Nodo nActual){
        if(nActual != null){
        System.out.println(nActual.getiVal() + " - ");//VISITAR EL NODO
            impPo(nActual.getnIzq());//RECORRER LADO IZQUIERDO
            impPo(nActual.getnDerch());//RECORRER LADO DERECHO
    }
    }
}