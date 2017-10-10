/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mayes
 */
public class Producto {
    protected String cod_prod;
    protected String precio;
    protected String descripcion;
    Tienda t=new Tienda();
    Scanner lee=new Scanner (System.in);
    Producto()
    {
    
    }
    public static List<Producto> productos =new ArrayList<Producto>();
    
    Producto(String a,String b,String c,String d)
    {
       t.cod_tienda=a;
       this.cod_prod=b;
       this.precio=c;
       this.descripcion=d;

    }
    
    
    public void llenar(Producto pro){
    
        System.out.println("Introducir cod_tienda");
        String cod_tie=lee.next();
        System.out.println("Introducir cod_producto");
        String cod_pro=lee.next();
        System.out.println("Introducir precio");
        String precio=lee.next();
        System.out.println("Introducir descripcion");
        String desc=lee.next();
        pro.t.cod_tienda=cod_tie;
        pro.cod_prod=cod_pro;
        pro.precio=precio;
        pro.descripcion=desc;
        productos.add(pro);

    }
    public void mostrar()
    {
        System.out.println("codigo tienda "+ this.t.cod_tienda);
        System.out.println("codigo producto "+ this.cod_prod);
        System.out.println("Precio "+ this.precio);
        System.out.println("Descripcion del producto "+ this.descripcion);
    }
    public static void inicializarListaProducto(){
        Producto p = new Producto("t1","prod1","1Bs","chocolate");
        Producto p2 = new Producto("t1","prod2","3Bs","galleta");
        Producto p3 = new Producto("t1","prod3","12Bs","pan");
        Producto p4 = new Producto("t2","prod4","4Bs","refresco");
        Producto p5 = new Producto("t2","prod5","4Bs","cafe");
        productos.add(p);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
    }

    public Tienda getT() {
        return t;
    }
    
   
}
