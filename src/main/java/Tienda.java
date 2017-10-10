/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mayes
 */
public class Tienda {
    protected String cod_tienda;
    protected String barrio;
   // Producto p=new Producto();
    public static List<Tienda> tiendas = new ArrayList<Tienda>(); 
    Tienda()
    {
        cod_tienda="t1";
        barrio="barrio1";
       // p.cod_prod="aaa";
    }
    Tienda(String a, String b)
    {
        cod_tienda=a;
        barrio=b;
    }
    public static void inicializarListaTienda(){
        Tienda t1=new Tienda("t1","perez");
        Tienda t2=new Tienda("t2","plaza_españa");
        tiendas.add(t1);
        tiendas.add(t2);
    }

    public String getCod_tienda() {
        return cod_tienda;
    }

    public String getBarrio() {
        return barrio;
    }
    
}
