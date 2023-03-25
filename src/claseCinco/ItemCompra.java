package claseCinco;

public class ItemCompra {

    private Producto producto;

    private Integer cantindad;


    public ItemCompra() {
    }

    public ItemCompra(Producto producto, Integer cantindad) {
        this.producto = producto;
        this.cantindad = cantindad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantindad() {
        return cantindad;
    }

    public void setCantindad(Integer cantindad) {
        this.cantindad = cantindad;
    }

    public Double calcularSubprecio(){
        Double subtotal = 0.0;
        subtotal += getCantindad() * producto.getPrecio();
        return subtotal;
    }
}
