
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


public class Compras {
    protected String cod_compra;
    protected int cantidad;
    Cliente cli=new Cliente();
    Producto prod=new Producto();
    
    Scanner lee = new Scanner(System.in);
    public static List<Compras> compras = new ArrayList<Compras>();
    Compras()
    {
    
    }
    Compras(String a, int b ,String c, String d)
    { 
        this.cod_compra=a;
        this.cantidad=b;
        this.cli.cod_cliente=c;
        this.prod.cod_prod=d;
    
    }
    
    
    public void llenar( Compras c)
    {
        //Cliente p=new Cliente();
        System.out.println("Introducir codigo compra");
        String cod_com=lee.next();
        System.out.println("Introducir cantidad");
        int cant=lee.nextInt();
        System.out.println("Introducir codigo cliente");
        String cod_cli=lee.next();
        System.out.println("Introducir cod_producto");
        String cod_pro=lee.next();
        c.cod_compra=cod_com;
        c.cantidad=cant;
        c.cli.cod_cliente=cod_cli;
        c.prod.cod_prod=cod_pro;
       
        compras.add(c);
        
    }
    public void mostrar()
    {
        System.out.println("cod_compra "+ cod_compra);
        System.out.println("cantidad  "+ cantidad);
        System.out.println("cod_cliente "+ cli.cod_cliente);
        System.out.println("cod_producto "+ prod.cod_prod);
    }
    
    public static void inicializarListaCompras(){
        Compras com1 = new Compras ("com1",5,"cli1","prod1");
        Compras com2 = new Compras ("com2",1,"cli2","prod1");
        Compras com3 = new Compras ("com3",1,"cli1","prod2");
        Compras com4 = new Compras ("com4",2,"cli1","prod2");
        Compras com5 = new Compras ("com5",5,"cli1","prod3");
        Compras com6 = new Compras ("com6",7,"cli1","prod4");
        compras.add(com1);
        compras.add(com2);
        compras.add(com3);
        compras.add(com4);
        compras.add(com5);
        compras.add(com6);
    }     
            
    public static void lista_compra_cliente(String b)
    {
        for(Compras com: compras) {
            if(com.getCli().getCod_cliente().equals(b))
            {
                System.out.println(com);
                //com.mostrar();
            }
        }
    }
    public static void lista_compra_Tienda(String b)
    {
        
        for(Compras com: compras) {
            String codTienda = com.prod.getT().getCod_tienda();
            if(codTienda.equals(b))
            {
                //System.out.println("--"+com.prod.t.cod_tienda);
                System.out.println(com);
                //com.mostrar();
            }
        }
    }
    public int suma(String a)
    {
        int cont=0;
        for(Compras co: compras)
        {
            if ( co.prod.cod_prod.equals(a))
            {
                cont=cont+co.getCantidad();
                //System.out.println("es"+ cont);
            }
        }
        return (cont);
    }
    
     public static void productoVendido()
    {
        int cont=0 ,con2=0;
        String g="";
        for(Compras c: compras)
        {
           con2 = c.suma(c.prod.cod_prod);
            
           if(con2>cont)
           {
               cont=con2;
               g=c.prod.cod_prod;
           }
        }
        System.out.println("El producto es: "+ g+" la cantidad "+ cont);
        
    }
 
    public Cliente getCli() {
        return cli;
    }
    public Producto getPro() {
        return prod;
    }
    public String getCod_compra() {
        return cod_compra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProd() {
        return prod;
    }
    

     public String toString() {
        return "[cod_comp: "+this.cod_compra+"] [cantidad: "+this.getCantidad()+"][cod_cliente: "+ this.getCli().cod_cliente+"][cod_producto: "+this.prod.cod_prod+"]";
    }
  
}


