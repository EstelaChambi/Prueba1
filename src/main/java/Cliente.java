/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Mayes
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Cliente extends Persona{
   protected String cod_cliente;
  // ArrayList<String> clientes = new ArrayList<String>();
  // private List clientes = new LinkedList();
   // List perfiles = new LinkedList();
   Scanner lee=new Scanner (System.in);
   public  static List <Cliente> clientes=new ArrayList<Cliente>();
    Cliente()
    {
        super();
        cod_cliente="c1";

        
    }
    Cliente(String nom)
    {
        super();
        nombre=nom;
    }
    
    public static void inicializarLista(){
        Cliente c1  = new Cliente("Ana", "Perez","Rosas","xxxx","18-09","cli1");
        Cliente c2  = new Cliente("Juan", "Aguilar","Rodrigez","tttt","12-02","cli2");
        Cliente c3  = new Cliente("Pedro", "Condori","Ramirez","dddddd","02-12-09","cli3");
        Cliente c4  = new Cliente("Juan Angel", "Marquez","Saico","uuuu","12-02-09","cli4");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
    }
    Cliente (String a,String b,String c,String d,String e,String f)
    {
    super();
    nombre=a;
    paterno=b;
    materno=c;
    correo=d;
    fecha_nac=e;
    cod_cliente=f;
    }
    
    public void llenar(Cliente p){
        
    System.out.println("Introducir nombre");
    String nom=lee.next();
    System.out.println("Introducir APpaterno");
    String pat=lee.next();
    System.out.println("Introducir APmaterno");
    String mat=lee.next();
    System.out.println("Introducir correo");
    String correo=lee.next();
    System.out.println("Introducir fecha_nacimiento");
    String fecha=lee.next();
    System.out.println("Introducir cod_cliente");
    String cod_cli=lee.next();
    p.nombre=nom;
    p.paterno=pat;
    p.materno=mat;
    p.correo=correo;
    p.fecha_nac=fecha;
    p.cod_cliente=cod_cli;
    clientes.add(p);
}
    
    public void mostrar()
    {
        System.out.println("nombre: "+ nombre);
        System.out.println("paterno: "+ paterno);
        System.out.println("materno: "+ materno);
        System.out.println("correo: "+ correo);
        System.out.println("fecha_nac: "+ fecha_nac);
        System.out.println("cod_cliente: "+ cod_cliente);
    }

    public String getCod_cliente() {
        return cod_cliente;
    }
    
    
}
