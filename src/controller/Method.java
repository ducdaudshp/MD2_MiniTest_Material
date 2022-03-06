package controller;


public class Method {
//    ArrayList<Material> materials = new ArrayList<>();
//
//    public static void addMaterialFlour(ArrayList<Material> materials) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập ID của vật liệu Flour: ");
//        String materialId = input.nextLine();
//        System.out.println("Nhập tên của vật liệu Flour: ");
//        String materialName = input.nextLine();
//        System.out.println("Nhập ngày tháng năm sản xuất của vật vật liệu Flour: ");
//        int year = input.nextInt();
//        int month = input.nextInt();
//        int day = input.nextInt();
//        System.out.println("Nhập giá vật liệu Flour: ");
//        int cost = input.nextInt();
//        System.out.println("Nhập số lượng vật liệu của Flour: ");
//        double quantity = input.nextDouble();
//        Material flours = new CrispyFlour(materialId, materialName, LocalDate.of(year, month, day), cost, quantity);
//        materials.add(flours);
//    }
//
//    public static void addMaterialMeat(ArrayList<Material> materials) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập ID của vật liệu Meat: ");
//        String materialId = input.nextLine();
//        System.out.println("Nhập tên của vật liệu Meat: ");
//        String materialName = input.nextLine();
//        System.out.println("Nhập ngày tháng năm sản xuất của vật liệu Meat: ");
//        int year = input.nextInt();
//        int month = input.nextInt();
//        int day = input.nextInt();
//        System.out.println("Nhập giá của vật liệu Meat: ");
//        int cost = input.nextInt();
//        System.out.println("Nhập khối lượng của vật liệu Meat: ");
//        double weight = input.nextDouble();
//        Material meat = new Meat(materialId, materialName, LocalDate.of(year, month, day), cost, weight);
//        materials.add(meat);
//    }
//
//    public static void display(ArrayList<Material> materials) {
//        for (Object m : materials) {
//            System.out.println(m);
//        }
//    }

//    public static void deleteMaterialById(String id, ArrayList<Material> materials) {
//        if (checkIndexById(id, materials) != -1) {
//            materials.remove(checkIndexById(id, materials));
//            System.out.println("Xóa thành công ID: " + id);
//        } else {
//            System.out.println("ID không tìm thấy");
//        }
//    }
//
//    public static void fixInfoMaterialById(String id, ArrayList<Material> materials) {
//        if (checkIndexById(id, materials) != -1) {
//            int index = checkIndexById(id, materials);
//            Scanner input = new Scanner(System.in);
//            if (materials.get(index) instanceof CrispyFlour) {
//                System.out.println("Nhập ID mới :");
//                String newID = input.nextLine();
//                materials.get(index).setId(newID);
//                System.out.println("Nhập tên mới:");
//                String newName = input.nextLine();
//                materials.get(index).setName(newName);
//                System.out.println("Nhập ngày tháng LocalDate:");
//                int year = input.nextInt();
//                int month = input.nextInt();
//                int day = input.nextInt();
//                materials.get(index).setManufacturingDate(year, month, day);
//                System.out.println("Nhập giá mới:");
//                int newCost = input.nextInt();
//                materials.get(index).setCost(newCost);
//                System.out.println("Nhập số lượng mới:");
//                double newQuantity = input.nextDouble();
//                ((CrispyFlour) materials.get(index)).setQuantity(newQuantity);
//            }
//            if (materials.get(index) instanceof Meat) {
//                System.out.println("Nhập ID mới :");
//                String newID = input.nextLine();
//                materials.get(index).setId(newID);
//                System.out.println("Nhập tên mới:");
//                String newName = input.nextLine();
//                materials.get(index).setName(newName);
//                System.out.println("Nhập ngày tháng LocalDate:");
//                int year = input.nextInt();
//                int month = input.nextInt();
//                int day = input.nextInt();
//                materials.get(index).setManufacturingDate(year, month, day);
//                System.out.println("Nhập giá mới:");
//                int newCost = input.nextInt();
//                materials.get(index).setCost(newCost);
//                System.out.println("Nhập khối lượng mới:");
//                double newWeight = input.nextDouble();
//                ((Meat) materials.get(index)).setWeight(newWeight);
//            }
//        }
//    }
//
//    public static void getRealMoneyToday(ArrayList<Material> materials) {
//        for (int i = 0; i < materials.size(); i++) {
//            if (materials.get(i) instanceof Meat) {
//                System.out.println(materials.get(i).getName() + ": " + ((Meat) materials.get(i)).getRealMoney());
//            } else {
//                System.out.println(materials.get(i).getName() + ": " + ((CrispyFlour) materials.get(i)).getRealMoney());
//            }
//        }
//    }
//
//    public static void getRealMoneyById(ArrayList<Material> materials, String id) {
//        int index = checkIndexById(id, materials);
//        if (checkMaterialById(id, materials)) {
//            if (materials.get(index) instanceof Meat) {
//                System.out.println(materials.get(index).getName() + ": " + ((Meat) materials.get(index)).getRealMoney());
//            } else if (materials.get(index) instanceof CrispyFlour)
//                System.out.println(materials.get(index).getName() + ": " + ((CrispyFlour) materials.get(index)).getRealMoney());
//        } else {
//            System.out.println("Không tìm thấy ID");
//        }
//    }
//
//    public static void differenceMoneyWithoutDiscount(ArrayList<Material> materials) {
//        for (Material m : materials
//        ) {
//            if (m instanceof CrispyFlour) {
//                System.out.println("Số tiền chênh lệch giữa triết khấu và không chiết khấu ngày hôm nay của " + m.getName() + " là: ");
//                System.out.println(m.getAmount() - ((CrispyFlour) m).getRealMoney());
//            }
//            if (m instanceof Meat) {
//                System.out.println("Số tiền chênh lệch giữa triết khấu và không chiết khấu ngày hôm nay của " + m.getName() + " là: ");
//                System.out.println(m.getAmount() - ((Meat) m).getRealMoney());
//            }
//        }
//    }
//
//    public static boolean checkMaterialById(String id, ArrayList<Material> materials) {
//        boolean check = false;
//        for (int i = 0; i < materials.size(); i++) {
//            if (id.equals(materials.get(i).getId())) {
//                check = true;
//                return check;
//            }
//        }
//        return check;
//    }
//
//    public static int checkIndexById(String id, ArrayList<Material> materials) {
//        int index = -1;
//        for (int i = 0; i < materials.size(); i++) {
//            if (id.equals(materials.get(i).getId())) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }

}
