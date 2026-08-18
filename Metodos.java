import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjComidaRapida[][] LLenarRegistros(int n) {
        int id = 1;
         Scanner sc = new Scanner(System.in);
        ObjComidaRapida[][] ventas = new ObjComidaRapida[n][n];

        for (int i = 0; i < ventas.length; i++) { // para las filas
            for (int j = 0; j < ventas.length; j++) { // para las columnas
                ObjComidaRapida o = new ObjComidaRapida();
                Metodos m = new Metodos();
                o.setIdPedido(id);
                id++;
                int opt = m.OpcionesMenuComida();
                switch (opt) {
                    case 1:
                        o.setDescipcion("Perro");
                        break;
                    case 2:
                        o.setDescipcion("Salchipapa");
                        break;
                    case 3:
                        o.setDescipcion("Hamburgesa");
                        break;
                    case 4:
                        o.setDescipcion("Perra");
                        break;

                    default:
                        System.out.println("Esa opción no existe ");
                        break;
                }
                System.out.println("Ingrese la cantidad a llevar");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese el precio");
                o.setPrecio(sc.nextDouble());
                o.setTotalPagar(o.getCantidad() * o.getPrecio());
                o.setEstadoPedido(0);
                ventas[i][j] = o;

            }
        }

        return ventas;

    }

    public void MostrarTurnosPendientes(ObjComidaRapida[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 0) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }

    public void MostrarTurnosDespachados(ObjComidaRapida[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 1) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }

    public ObjComidaRapida[][] Despachar(ObjComidaRapida[][] ventas) {
        System.out.println("Ingrese el turno a despachar");
        int turno = sc.nextInt();
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getIdPedido() == turno)

                {
                    ventas[i][j].setEstadoPedido(1);
                }
            }
        }
        return ventas;
    }

    public int OpcionesMenuPrincipal() {
        System.out.println("Bienvenidos a la comida rapida de estructuras de datos");
        System.out.println("Que desea realizar");
        System.out.println("1) Ingresar Pedidos");
        System.out.println("2) Mostrar Pedidos pendientes por despacho");
        System.out.println("3) Mostrar pedidos despachados");
        System.out.println("4) Despachar Pedido");
        System.out.println("5) salir");
        return sc.nextInt();
    }

    public int OpcionesMenuComida() {
        System.out.println("seleccione el pedido de su interes");
        System.out.println("1) Perro");
        System.out.println("2) Salchipapa");
        System.out.println("3) Hamburgesa");
        System.out.println("4) Perra");
        return sc.nextInt();
    }
}