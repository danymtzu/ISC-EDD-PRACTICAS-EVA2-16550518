/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_ordenar_objetos;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author 16550518
 */
public class EVA2_19_ORDENAR_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <Persona> llPersona = new LinkedList();
        llPersona.add(new Persona("Dany","Uzarraga",18,false,100.00));
        llPersona.add(new Persona("Lucy","Espinoza",40,false,200.00));
        llPersona.add(new Persona("Carlos","Marinez",42,true,300.00));
        llPersona.add(new Persona("Fer","Uzarraga",16,false,400.00));
        llPersona.add(new Persona("Camila","Uzarraga",8,false,500.00));
        
        for (Persona llPersonas : llPersona) {
            System.out.println("Nombre: "+llPersonas.getsNom()+ "\n"+
                    "Apellido: "+llPersonas.getsApellido() + "\n"+
                    "Edad: "+llPersonas.getiEdad()+ " años."  +"\n"+
                    "Sexo:" + llPersonas.isbSexo()+ "\n"+
                    "Salario: "+ llPersonas.getdSal()+ "\n");
        }
        Comparator cmCriterioOrden = new Comparator(){//CLASE ANONIMA

            @Override
            public int compare(Object o1, Object o2) {//ORDEN ALFABETICO DE LOS APELLIDOS
               Persona p1= (Persona)o1;
               Persona p2= (Persona)o2;
               String sApe1, sApe2;
               sApe1= p1.getsApellido();
               sApe2= p2.getsApellido();
               char c1, c2;
               c1=sApe1.charAt(0);//ARREGLO
               c2=sApe2.charAt(0);//ARREGLO
               return c1-c2;
            }
        };
        
        System.out.println("");
        System.out.println("LISTA ORDENADA POR APELLIDO");
        Collections.sort(llPersona, cmCriterioOrden);
        
//        for (Persona llPersonas : llPersona) {
//            System.out.println("Nombre: "+llPersonas.getsNom()+ "\n"+
//                    "Apellido: "+llPersonas.getsApellido() + "\n"+
//                    "Edad: "+llPersonas.getiEdad()+ " años."  +"\n"+
//                    "Sexo:" + llPersonas.isbSexo()+ "\n"+
//                    "Salario: "+ llPersonas.getdSal()+ "\n");
//        }
        
        
        Comparator cmCriterioOrden2 = new Comparator(){//CLASE ANONIMA

            @Override
            public int compare(Object o1, Object o2) {//ORDEN POR EDAD
               Persona p1= (Persona)o1;
               Persona p2= (Persona)o2;
               int iEd1,iEd2;
               iEd1= p1.getiEdad();
               iEd2= p2.getiEdad();
               int i1, i2;
               i1=iEd1;
               i2=iEd2;
               return i1-i2;
                     
            }
        };
        
        System.out.println("");
        System.out.println("LISTA ORDENADA EDAD");
        Collections.sort(llPersona, cmCriterioOrden);
        
        for (Persona llPersonas : llPersona) {
            System.out.println("Nombre: "+llPersonas.getsNom()+ "\n"+
                    "Apellido: "+llPersonas.getsApellido() + "\n"+
                    "Edad: "+llPersonas.getiEdad()+ " años."  +"\n"+
                    "Sexo:" + llPersonas.isbSexo()+ "\n"+
                    "Salario: "+ llPersonas.getdSal()+ "\n");
        }
        
        
        
        
    }
    
}

class Persona{    
    private String sNom;
    private String sApellido;
    private int iEdad;
    private boolean bSexo;
    private double dSal;

    public Persona(String sNom, String sApellido, int iEdad, boolean bSexo, double dSal) {
        this.sNom = sNom;
        this.sApellido = sApellido;
        this.iEdad = iEdad;
        this.bSexo = bSexo;
        this.dSal = dSal;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }
    
    
    
}

