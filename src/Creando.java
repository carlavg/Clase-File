import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {

		File ruta = new File("C:" + File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "Desktop"
				+ File.separator + "java-ser" + File.separator + "pruebaTexto.txt");

		String archivoDestino = ruta.getAbsolutePath();

		try {
			ruta.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Escribiendo accedeEs = new Escribiendo();
		accedeEs.escribir(archivoDestino);

	}
}

class Escribiendo {
	public void escribir(String rutaArchivo) {
		String frase = "Esto es un ejemplo. Espero que salga";

		try {
			FileWriter escritura = new FileWriter(rutaArchivo);
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}

			escritura.close();

		} catch (IOException e) {
		}

	}

}
