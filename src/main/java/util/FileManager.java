package util;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileManager<T> {



    public static <T> void saveFile(String fileName, T object){
        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);

            escribir.writeObject(object);

            escribir.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. "
                    + e.getMessage());
        }
    }

    public static <T> T loadFile(String fileName){
        File file = new File(fileName);
        T object = null;
        try {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream reader;

            while(fis.available()>0){
                reader= new ObjectInputStream(fis);
                T element= (T) reader.readObject();
                object = element;
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo. "
                    + e.getMessage());
        }
        return object;
    }


    public static void saveFileList(String fileName, List<?> objects){
        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);

            escribir.writeObject(objects);

            escribir.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. "
                    + e.getMessage());
        }
    }


    public static <T> List<?> loadFileList(String fileName){
        File file = new File(fileName);
        List<T> list = null;
        try {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream reader;

            while(fis.available()>0){
                reader= new ObjectInputStream(fis);
                List<T> element= (List<T>) reader.readObject();
                list = element;
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo. "
                    + e.getMessage());
        }
        return list;
    }

}
