import java.util.ArrayList;

public class Warehouse {
    private static Warehouse instance = null;
    private ArrayList<Category> categories;
    private ArrayList <Item> items;


    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    private Warehouse(){
        categories=new ArrayList<Category>();
        items=new ArrayList<Item>();
    }

    public float totalValue(){
        return -1;
    }

    public int totalCount(){
        return -1;
    }

    public float averagePrice(){
        return -1;
    }

    public void listDeficiencies(){
        for (int i=0;i<categories.size();i++){
            categories.get(i).listDeficiencies();
        }
    }

    public void addCategory(Category category){
        if (getCategory(category.getId()) != null) {
            System.out.println("Error: Category with this Id already exists!");
            return;
        }
        categories.add(category);
        //categories.add(item);
        System.out.println("Category "+category.getName()+" has been added successfully");

    }
    public void addItem(Category category, Item item){
        if (getItem(item.getId()) != null) {
            System.out.println("Error: Item with this Id already exists!");
            return;
        }
        //category.addItem(item);
        if (items.add(item)){

            category.addItem(item);
            //System.out.println(" to "+category.getName()+" category");
        }




    }
    public Item getItem(int id) {
        for (int i=0; i<items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }

        return null;
    }

    public Category getCategory(int id) {
        for (int i=0; i<categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                return categories.get(i);
            }
        }

        return null;
    }

    public void removeCategory(int id){
        for (int i=0; i<categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                categories.remove(i);
                return;
            }
        }


    }

}
