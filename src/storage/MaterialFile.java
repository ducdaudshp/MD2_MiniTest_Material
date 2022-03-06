package storage;

import model.Material;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialFile {
    public static void writeFile(List<Material> materialsList) throws IOException {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream("List.duc");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(materialsList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            oos.close();
            fos.close();
        }
    }

    public static List<Material> readFile(){
        File file = new File("List.duc");
        try {
            FileInputStream fis =new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<Material> materialList = (List<Material>) result;
            ois.close();
            fis.close();
            return materialList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
