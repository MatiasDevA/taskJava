package claseCinco;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Compra {

    private LocalDateTime fechaDeAlta;

    private List<ItemCompra> items;


    public Compra() {
        this.fechaDeAlta = LocalDateTime.now();
        this.items = new ArrayList<ItemCompra>();
    }

    public Compra(LocalDateTime fechaDeAlta, List<ItemCompra> items) {
        this.fechaDeAlta = fechaDeAlta;
        this.items = items;
    }

    public LocalDateTime getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDateTime fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public List<ItemCompra> getProductos() {
        return items;
    }

    public void setProductos(List<ItemCompra> items) {
        this.items = items;
    }

    public Double calcularTotalPrecio() {
       Double totalPrecio = 0.0;
        for (int i = 0; i < items.size(); i++) {
            ItemCompra itemCompra = items.get(i);
            totalPrecio += itemCompra.calcularSubprecio();
        }
        return totalPrecio;
    }

}
