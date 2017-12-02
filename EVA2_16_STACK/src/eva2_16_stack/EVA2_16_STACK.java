/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_stack;

import java.util.Stack;

/**
 *
 * @author 16550518
 */
public class EVA2_16_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Double> stMiPila = new Stack();
        stMiPila.push(10.0);
        stMiPila.push(20.0);
        stMiPila.push(30.0);
        stMiPila.push(40.0);
        stMiPila.push(50.0);
        System.out.println(stMiPila.pop());//MUESTRA EL ULTIMO ELEMENTO DE LA PILA
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());//LEE EL ULTIMO ELEMENTO DE LA PILA PERO NO LO ELIMINA
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
    }
}
