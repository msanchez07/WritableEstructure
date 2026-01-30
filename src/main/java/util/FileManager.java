package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Clase FileManager
 * -----------------
 * Permite guardar y cargar OBJETOS y LISTAS de objetos en archivos binarios.
 *
 * IMPORTANTE:
 * - Los objetos que se guarden deben implementar Serializable.
 * - El alumno no necesita modificar nada, solo usar los métodos.
 */
public class FileManager<T> {

    /**
     * Guarda UN objeto en un archivo binario.
     *
     * @param fileName Nombre del archivo.
     * @param object   Objeto a guardar.
     *
     * EJEMPLOS DE USO:
     *
     * // Guardar un String
     * FileManager.saveFile("mensaje.dat", "Hola mundo");
     *
     * // Guardar un objeto Persona
     * Persona p = new Persona("Ana", 25);
     * FileManager.saveFile("persona.dat", p);
     *
     * // Guardar un Map u otro objeto serializable
     * Map<String, Integer> notas = Map.of("Ana", 9, "Luis", 8);
     * FileManager.saveFile("notas.dat", notas);
     */
    public static <T> void saveFile(String fileName, T object){
        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);

            escribir.writeObject(object);

            escribir.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. " + e.getMessage());
        }
    }

    /**
     * Carga UN objeto desde un archivo binario.
     *
     * @param fileName Nombre del archivo.
     * @return Objeto leído (cast necesario si se quiere usar como tipo concreto)
     *
     * EJEMPLOS DE USO:
     *
     * // Cargar un String
     * String mensaje = (String) FileManager.loadFile("mensaje.dat");
     *
     * // Cargar un objeto Persona
     * Persona p = (Persona) FileManager.loadFile("persona.dat");
     *
     * // Cargar un Map
     * Map<String, Integer> notas = (Map<String, Integer>) FileManager.loadFile("notas.dat");
     */
    public static <T> T loadFile(String fileName){
        File file = new File(fileName);
        T object = null;
        try {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream reader;

            while(fis.available()>0){
                reader= new ObjectInputStream(fis);
                T element= (T) reader.readObject(); // CAST explícito
                object = element;
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo. " + e.getMessage());
        }
        return object;
    }

    /**
     * Guarda UNA LISTA de objetos en un archivo binario.
     *
     * @param fileName Nombre del archivo.
     * @param objects  Lista de objetos a guardar.
     *
     * EJEMPLOS DE USO:
     *
     * List<Persona> personas = new ArrayList<>();
     * personas.add(new Persona("Ana", 25));
     * personas.add(new Persona("Luis", 30));
     *
     * FileManager.saveFileList("personas.dat", personas);
     *
     * List<String> nombres = List.of("Ana", "Luis", "Marta");
     * FileManager.saveFileList("nombres.dat", nombres);
     */
    public static void saveFileList(String fileName, List<?> objects){
        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);

            escribir.writeObject(objects);

            escribir.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. " + e.getMessage());
        }
    }

    /**
     * Carga UNA LISTA de objetos desde un archivo binario.
     *
     * @param fileName Nombre del archivo.
     * @return Lista de objetos (CAST explícito necesario al usar)
     *
     * EJEMPLOS DE USO:
     *
     * // Lista de Persona
     * List<Persona> personas = (List<Persona>) FileManager.loadFileList("personas.dat");
     *
     * // Lista de String
     * List<String> nombres = (List<String>) FileManager.loadFileList("nombres.dat");
     */
    public static <T> List<?> loadFileList(String fileName){
        File file = new File(fileName);
        List<T> list = null;
        try {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream reader;

            while(fis.available()>0){
                reader= new ObjectInputStream(fis);
                List<T> element= (List<T>) reader.readObject(); // CAST explícito
                list = element;
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo. " + e.getMessage());
        }
        return list;
    }
}
