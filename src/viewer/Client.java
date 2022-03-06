package viewer;

import controller.MaterialManager;
import model.Material;
import model.Meat;
import storage.MaterialFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Material> materialListClient =MaterialFile.readFile();

    public static void main(String[] args) {
        addNewMaterial();
        showAllMaterial();
    }

    public static void showAllMaterial(){
        for (Material m:materialListClient
             ) {
            System.out.println(m);
        }
    }

    public static void addNewMaterial(){
        MaterialManager.materialList = materialListClient;
        Meat meat = createNewMeat();
        MaterialManager.addNewMaterial(meat);

        try {
            MaterialFile.writeFile(materialListClient);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Meat createNewMeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ID");
        String id = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Moi ban nhap ten");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Moi ban nhap ngay");
        int day = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Moi ban nhap thang");
        int month = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Moi ban nhap nam");
        int year = scanner4.nextInt();
        LocalDate manufacturingDate = LocalDate.of(year,month,day);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Moi ban nhap gia");
        int cost = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Moi ban nhap khoi luong");
        double weight = scanner6.nextDouble();

        Meat meat = new Meat(id, name,manufacturingDate,cost,weight);
        return meat;
    }
}
