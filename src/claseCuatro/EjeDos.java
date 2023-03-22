package claseCuatro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

public class EjeDos {

    public static void main(String[] args) throws IOException {
        leerDelArchivo("C:\\Users\\epizarro\\Desktop\\taskJava\\src\\claseCuatro\\archivo",true
        );
}

        public static void leerDelArchivo(String path, boolean multiplicacion) throws IOException {
            int result = 0;
            int multiplicado = 1;
            for(String linea : Files.readAllLines(Paths.get(path))){
                int numero = Integer.parseInt(linea);
                if(multiplicacion){
                    multiplicado *= numero ;

                } else {
                    result += numero;
                }
            }
            System.out.println(result);
            System.out.println(multiplicado);
        }


}
