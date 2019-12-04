import java.util.ArrayList;

public class Category {
    private int id;
    private String name;
    private ArrayList<Item> items;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;

        items=new ArrayList<Item>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int totalCount(){
        return-1;
    }

    public float averagePrice(){
        return -1;
    }

    public float totalValue(){
        return -1;
    }

    public void addItem(Item item){
        if (getItem(item.getId()) != null) {
            System.out.println("Error: Item with this Id already exists!");
            return;
        }
        if (items.add(item)) {

            System.out.print("Item " + item.getName() + " added successfully to "
                    +Warehouse.getInstance().getCategory(getId()).getName()+" category");
        }
        System.out.println();
    }





    public Item getItem(int id) {
        for (int i=0; i<items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }

        return null;
    }

    public void removeItem(int id){
        for (int i=0; i<items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                return;
            }
        }
    }

    public void listDeficiencies(){
        for (int i=0;i<items.size();i++){
            if (items.get(i).getQuantity()==0){
                System.out.println(items.get(i));
            }
        }
    }
}
