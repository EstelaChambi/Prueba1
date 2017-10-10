/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mayes
 */
public class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected String correo;
    protected String fecha_nac;
    
   Scanner lee=new Scanner (System.in);
   public static List<Persona> personas = new ArrayList<Persona>();
    Persona()
    {
        nombre="maria";
        paterno="perez";
        materno="lopez";
        correo="mayes@gmail.com";
        fecha_nac="16-06";
    }
    Persona(String a,String b,String c,String d, String e)
    {
        nombre=a;
        paterno=b;
        materno=c;
        correo=d;
        fecha_nac=e;
    }
     public void llenar(Persona p)
     {
         System.out.println("Introducir nombre: ");
         String nom=lee.next();
         System.out.println("Introducir Ap. paterno: ");
         String pat=lee.next();
         System.out.println("Introducir Ap. materno: ");
         String mat=lee.next();
         System.out.println("Introducir correo: ");
         String correo=lee.next();
         System.out.println("Introducir Fecha de nac: ");
         String fecha=lee.next();
         p.nombre=nom;
         p.paterno=pat;
         p.materno=mat;
         p.correo=correo;
         p.fecha_nac=fecha;
         personas.add(p);
         p.mostrar();
     }
     
     
    public void mostrar()
    {
        System.out.println("nombre "+ nombre);
        System.out.println("paterno "+ paterno);
        System.out.println("materno"+ materno);
        System.out.println("correo  "+ correo);
        System.out.println("fecha_nac "+ fecha_nac);
    }
    
}

