import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArchivo {
    public static void main(String[] args) {
        String archivoOrigen = "origen.txt";
        String archivoDestino = "destino.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine(); // Salto de línea
            }

            System.out.println("El archivo se copió correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
