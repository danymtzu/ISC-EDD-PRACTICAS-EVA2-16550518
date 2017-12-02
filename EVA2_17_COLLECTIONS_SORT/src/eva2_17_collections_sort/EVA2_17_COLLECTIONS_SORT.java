/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_collections_sort;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author 16550518
 */
public class EVA2_17_COLLECTIONS_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL!!");
        llMiLista.add(" ");
        llMiLista.add("COLLECTIONS");
        
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1+ "  " );
        }
        Collections.sort(llMiLista);
        System.out.println("");
         for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1+ "  " );
        }
    }
}
