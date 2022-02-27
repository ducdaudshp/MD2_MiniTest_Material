package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Method {
    ArrayList<Material> materials = new ArrayList<>();
    public static void addMaterialFlour(ArrayList<Material> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID của vật liệu Flour: ");
        String materialId = input.nextLine();
        System.out.println("Nhập tên của vật liệu Flour: ");
        String materialName = input.nextLine();
        System.out.println("Nhập ngày tháng năm sản xuất của vật vật liệu Flour: ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        System.out.println("Nhập giá vật liệu Flour: ");
        int cost = input.nextInt();
        System.out.println("Nhập số lượng vật liệu của Flour: ");
        double quantity = input.nextDouble();
        Material flours = new CrispyFlour(materialId,materialName, LocalDate.of(year,month,day),cost,quantity);
        list.add(flours);
    }
    public static void addMaterialMeat(ArrayList<Material> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID của vật liệu Meat: ");
        String materialId = input.nextLine();
        System.out.println("Nhập tên của vật liệu Meat: ");
        String materialName = input.nextLine();
        System.out.println("Nhập ngày tháng năm sản xuất của vật liệu Meat: ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        System.out.println("Nhập giá của vật liệu Meat: ");
        int cost = input.nextInt();
        System.out.println("Nhập khối lượng của vật liệu Meat: ");
        double weight = input.nextDouble();
        Material meat = new Meat(materialId,materialName, LocalDate.of(year,month,day),cost,weight);
        list.add(meat);
    }
    public static void display(ArrayList<Material> list){
        for(Object m : list){
            System.out.println(m);
        }
    }
    public static void deleteMaterialById(String id, ArrayList<Material> list){
        if (checkIndexById(id,list) != -1){
            list.remove(checkIndexById(id,list));
            System.out.println("Xóa thành công ID: " + id );
        } else {
            System.out.println("ID không tìm thấy");
        }
    }
    public static void fixInfoMaterialById(String id,ArrayList<Material> list){
        if (checkIndexById(id,list) != -1){
            int index = checkIndexById(id,list);
            Scanner input = new Scanner(System.in);
            if (list.get(index) instanceof CrispyFlour){
                System.out.println("Nhập ID mới :");
                String newID = input.nextLine();
                list.get(index).setId(newID);
                System.out.println("Nhập tên mới:");
                String newName = input.nextLine();
                list.get(index).setName(newName);
                System.out.println("Nhập ngày tháng LocalDate:");
                int year = input.nextInt();
                int month = input.nextInt();
                int day = input.nextInt();
                list.get(index).setManufacturingDate(year,month,day);
                System.out.println("Nhập giá mới:");
                int newCost = input.nextInt();
                list.get(index).setCost(newCost);
                System.out.println("Nhập số lượng mới:");
                double newQuantity = input.nextDouble();
                ((CrispyFlour) list.get(index)).setQuantity(newQuantity);
            } else {
                System.out.println("Nhập ID mới :");
                String newID = input.nextLine();
                list.get(index).setId(newID);
                System.out.println("Nhập tên mới:");
                String newName = input.nextLine();
                list.get(index).setName(newName);
                System.out.println("Nhập ngày tháng LocalDate:");
                int year = input.nextInt();
                int month = input.nextInt();
                int day = input.nextInt();
                list.get(index).setManufacturingDate(year,month,day);
                System.out.println("Nhập giá mới:");
                int newCost = input.nextInt();
                list.get(index).setCost(newCost);
                System.out.println("Nhập khối lượng mới:");
                double newWeight = input.nextDouble();
                ((Meat) list.get(index)).setWeight(newWeight);
            }
        }
    }
    public static void getRealMoneyToday(ArrayList<Material> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Meat){
                System.out.println(list.get(i).getName() + ": " + ((Meat) list.get(i)).getRealMoney());
            } else {
                System.out.println(list.get(i).getName() + ": " + ((CrispyFlour)list.get(i)).getRealMoney());
            }
        }
    }
    public static void getRealMoneyById(ArrayList<Material> list,String id){
        int index = checkIndexById(id,list);
        if (checkMaterialById(id,list)){
            if (list.get(index)instanceof Meat){
                System.out.println(list.get(index).getName() + ": " + ((Meat) list.get(index)).getRealMoney());
            } else
                System.out.println(list.get(index).getName()+ ": " + ((CrispyFlour)list.get(index)).getRealMoney());
        } else {
            System.out.println("Không tìm thấy ID");
        }
    }
    public static void differenceMoneyWithoutDiscount(ArrayList<Material> list){
        for (int i = 0; i < list.size(); i++) {
            double differennceMoney;
            if (list.get(i)instanceof Meat){
                differennceMoney = list.get(i).getAmount() - ((Meat) list.get(i)).getRealMoney();
                System.out.println(list.get(i).getName()+ " Amount: " + list.get(i).getAmount()
                        + ", RealMoney: " + ((Meat) list.get(i)).getRealMoney()
                        + ", Diffence: " + differennceMoney);
            } else {
                differennceMoney = list.get(i).getAmount() - ((CrispyFlour) list.get(i)).getRealMoney();
                System.out.println(list.get(i).getName()+ " Amount: " + list.get(i).getAmount()
                        + ", RealMoney: " + ((CrispyFlour) list.get(i)).getRealMoney()
                        + ", Diffence: " + differennceMoney);
            }
        }
    }

    public static boolean checkMaterialById(String id, ArrayList<Material> list){
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())){
                check = true;
                return check;
            }
        } return check;
    }
    public static int checkIndexById( String id,ArrayList<Material> materials){
        int index = -1;
        for (int i = 0; i < materials.size() ; i++) {
            if (id.equals(materials.get(i).getId())){
                index = i;
                break;
            }
        } return index;
    }
}
