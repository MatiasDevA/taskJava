package claseCinco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EjeDos {

    public static void main(String[] args) {

        Compra compra = new Compra();
        try {
            for(String lectura : Files.readAllLines(Paths.get("C:\\Users\\Matias\\Desktop\\taskJava\\src\\claseCinco\\compra"))){
                String nombre = lectura.split(",")[0];
                Float precio = Float.valueOf((lectura.split(",")[1]));
                Integer cantidad = Integer.valueOf((lectura.split(",")[2]));

                Producto producto = new Producto(nombre,precio);
                ItemCompra itemCompra = new ItemCompra(producto,cantidad);
                compra.getProductos().add(itemCompra);


            }
            System.out.println(compra.calcularTotalPrecio());
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lista de productos de la compra");

    }
}


