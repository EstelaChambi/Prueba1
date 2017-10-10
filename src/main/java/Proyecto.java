import java.util.List;
import java.util.Scanner;

/**
 * Creado por MC4
 * YPFB - SIGA
 *
 * @author: Maye
 * @email : maye@mc4.com.bo
 * @date: 10-10-17
 * @copyright: YPFB - MC4
 */

public class Proyecto {


    private static List<Cliente> clientes = Cliente.clientes;
    //private static List<Producto> productos = new ArrayList<Producto>();
    private static List<Producto> productos = Producto.productos;
    private static List<Compras> compras = Compras.compras;

    public static void main(String[] args) {

        Cliente.inicializarLista();
        Compras.inicializarListaCompras();
        Producto.inicializarListaProducto();



        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        while(true){
            int resp;
            System.out.println("=====================");
            System.out.println("MENU DE OPERACIONES");
            System.out.println("1. Registro Cliente");
            System.out.println("2. Registro Producto");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Listar Productos");
            System.out.println("5. Resgistar Compra");
            System.out.println("6. Listar compras por cliente");
            System.out.println("7. Listar compras por Tienda");
            System.out.println("8. Listar Producto mas vendido");

            System.out.println("Escribe una de las opciones");
            resp = sn.nextInt();
            switch(resp)
            {
                case 1:
                    Cliente p=new Cliente();
                    System.out.println("Introcir nombre");
                    String nom=sn.next();
                    System.out.println("Introcir paterno");
                    String pat=sn.next();
                    System.out.println("Introcir materno");
                    String mat=sn.next();
                    System.out.println("Introcir correo");
                    String correo=sn.next();
                    System.out.println("Introcir fecha_nacimiento");
                    String fecha_nac=sn.next();
                    System.out.println("Introcir codigo_cliente");
                    String cod_cli=sn.next();
                    p.nombre=nom;
                    p.paterno=pat;
                    p.materno=mat;
                    p.correo=correo;
                    p.fecha_nac=fecha_nac;
                    p.cod_cliente=cod_cli;
                    clientes.add(p);
                    p.mostrar();
                    break;
                case 2:
                    Producto pro = new Producto();
                    pro.llenar(pro);
                    pro.mostrar();

                    break;
                case 3:
                    for(Cliente st:clientes)
                    {
                        System.out.println("-------------");
                        st.mostrar();
                    }
                    break;
                case 4:
                    for(Producto st:productos)
                    {
                        System.out.println("--------------------");
                        st.mostrar();
                    }
                    break;
                case 5:
                    Compras c=new Compras();
                    c.llenar(c);
                    c.mostrar();
                    break;
                case 6:
                    System.out.println("introduzca codigo cliente");
                    String cod=sn.next();
                    Compras.lista_compra_cliente(cod);
                    break;
                case 7:
                    System.out.println("Introduzca codigo tienda");
                    String codigo=sn.next();
                    Compras.lista_compra_Tienda(codigo);
                    break;
                case 8:
                    Compras.productoVendido();
                    break;
                default:
                    break;
            }
        }
    }


}
