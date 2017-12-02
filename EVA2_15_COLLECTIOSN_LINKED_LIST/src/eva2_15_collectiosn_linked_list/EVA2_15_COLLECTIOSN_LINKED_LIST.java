/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_collectiosn_linked_list;

import java.util.LinkedList;

/**
 *
 * @author 16550518
 */
public class EVA2_15_COLLECTIOSN_LINKED_LIST {

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
        llMiLista.remove(4);
        System.out.println("  ");
        System.out.println(llMiLista);
        llMiLista.add(4, "BONDADOSO");
        System.out.println(llMiLista);
    }
}
