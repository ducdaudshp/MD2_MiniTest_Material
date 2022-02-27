package viewer;

import controller.Method;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrispyFlour flour1 = new CrispyFlour("f1","Flour1",LocalDate.of(2022,1,18),150,80);
        CrispyFlour flour2 = new CrispyFlour("f2","Flour2",LocalDate.of(2022,2,4),50,200);
        CrispyFlour flour3 = new CrispyFlour("f3","Flour3",LocalDate.of(2022,8,30),70,100);
        CrispyFlour flour4 = new CrispyFlour("f4","Flour4",LocalDate.of(2020,5,5),20,500);
        CrispyFlour flour5 = new CrispyFlour("f5","Flour5",LocalDate.of(2019,11,21),65,60);

        Meat meat1 = new Meat("m1","Meat1",LocalDate.of(2022,3,3),300,40);
        Meat meat2 = new Meat("m2","Meat2",LocalDate.of(2022,3,2),500,20);
        Meat meat3 = new Meat("m3","Meat3",LocalDate.of(2022,2,22),2500,100);
        Meat meat4 = new Meat("m4","Meat4", LocalDate.of(2022,2,27),250,35);
        Meat meat5 = new Meat("m5","Meat5",LocalDate.of(2022,1,28),150,10);

        ArrayList<Material> materials = new ArrayList<>();
        materials.add(flour1);
        materials.add(flour2);
        materials.add(flour3);
        materials.add(flour4);
        materials.add(flour5);

        materials.add(meat1);
        materials.add(meat2);
        materials.add(meat3);
        materials.add(meat4);
        materials.add(meat5);

        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm Crispy Flour mới");
            System.out.println("2. Thêm sản phẩm Meat mới");
            System.out.println("3. Sửa thông tin vật liệu");
            System.out.println("4. Xóa vật liệu");
            System.out.println("5. Số tiền nhận của vật liệu hôm nay");
            System.out.println("6. Số tiền nhận theo ID");
            System.out.println("7. Số tiền nhận theo chiết khấu tại ngày hôm nay");
            System.out.println("8. Số tiền nhận chênh lệch theo ID");
            System.out.println("9. Hiển thị danh sách vật liệu");
            System.out.println("0. Exit");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1 :
                    Method.addMaterialFlour(materials);
                    break;
                case 2 :
                    Method.addMaterialMeat(materials);
                    break;
                case 3:
                    inputChoice.nextLine();
                    System.out.println("Nhập ID của vật liệu muốn thay đổi thông tin: ");
                    String id = inputChoice.nextLine();
                    Method.fixInfoMaterialById(id,materials);
                    break;
                case 4:
                    inputChoice.nextLine();
                    System.out.println("Nhập ID của vật liệu muốn xóa: ");
                    String inputId = inputChoice.nextLine();
                    Method.deleteMaterialById(inputId,materials);
                    break;
                case 5 :
                    Method.getRealMoneyToday(materials);
                    break;
                case 6 :
                    inputChoice.nextLine();
                    System.out.println("Nhập ID của vật liệu để hiển thị số tiền thực nhận hôm nay: ");
                    String materialId = inputChoice.nextLine();
                    Method.getRealMoneyById(materials,materialId);
                    break;
                case 7 :
                    Method.differenceMoneyWithoutDiscount(materials);
                    break;
                case 8:
                    break;
                case 9:
                    Method.display(materials);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lựa chọn");
            }
        }

    }
}
