package claseCinco;

import java.time.LocalDateTime;

public class Producto {

    private Integer id = 0;

    private String nombre;
    private Float precio;


    public Producto(String nombre, Float precio) {
        this.id += 1;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
