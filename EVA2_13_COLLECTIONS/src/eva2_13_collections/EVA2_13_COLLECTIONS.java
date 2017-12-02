/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 16550518
 */
public class EVA2_13_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);//0
        alMiArrayList.add(200);//1
        alMiArrayList.add(300);//2
        alMiArrayList.add(400);//3
        alMiArrayList.add(500);//4
        
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        
        alMiArrayList.add(2, 999);
        System.out.println("");
        
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        
        //RECORRER UN COLLECTION CON ITERADOR
        System.out.println("\n ITERADOR");
        Iterator itRecorreArray = alMiArrayList.iterator();
        while(itRecorreArray.hasNext()){//hasNetx=Si hay un nodo siguiente te regresa true y si no hay nodo siguiente te regresa false
            System.out.print(itRecorreArray.next()+" - ");
        }
    }
}
