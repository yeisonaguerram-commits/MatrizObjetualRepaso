public class ObjComidaRapida {
    private int IdPedido;
    private String Descipcion;
    private int Cantidad;
    private Double Precio;
    private Double TotalPagar;
    private int EstadoPedido;

    public ObjComidaRapida() {
    }

    public ObjComidaRapida(int idPedido, String descipcion, int cantidad, Double precio, Double totalPagar,
            int estadoPedido) {
        IdPedido = idPedido;
        Descipcion = descipcion;
        Cantidad = cantidad;
        Precio = precio;
        TotalPagar = totalPagar;
        EstadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int idPedido) {
        IdPedido = idPedido;
    }

    public String getDescipcion() {
        return Descipcion;
    }

    public void setDescipcion(String descipcion) {
        Descipcion = descipcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        TotalPagar = totalPagar;
    }

    public int getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        EstadoPedido = estadoPedido;
    }

}