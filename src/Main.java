public class Main {
    public static void main(String[] args) {
        final Warehouse warehouse=Warehouse.getInstance();

        //warehouse.addCategory(new Category(1001, "'Toys'"));
        Category toys =new Category(1001, "'toys'");
        warehouse.addCategory(toys);
        System.out.println();

        toys.addItem(new Item(100,"'toy car'","00012",2,1.0f,2.0f));
        toys.addItem(new Item(101,"'Action figure'","00013",3,5.0f,7.0f));
        toys.addItem(new Item(102,"'playing cards'","00014",52,3.0f,4.0f));
        warehouse.addItem(toys, new Item(103,"'Chess board'","00015",4,10.0f,13.0f));

        System.out.println();

        Category carParts = new Category(1002,"'Car parts'");
        warehouse.addCategory(carParts);
        carParts.addItem(new Item(200,"'Engine'","10014",10,1000.0f,1300.0f));
        System.out.println();

        System.out.println(toys.getItem(103));
        System.out.println(carParts.getItem(200));
    }
}
