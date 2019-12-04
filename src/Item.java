public class Item {

    private int id;
    private String name;
    private String ssn;
    private int quantity;
    private float cost;
    private float price;

    public Item(int id, String name, String ssn, int quantity, float cost, float price) {
        this.id=id;
        this.name=name;
        this.ssn=ssn;
        this.quantity=quantity;
        this.cost=cost;
        this.price=price;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getItemProfit(){
        return price-cost;
    }

    public float calcTotalValue(){
        return price*quantity;
    }

    public String toString(){
        return " ItemID "+this.id+
                ", ItemName "+this.name+
                ", SSN "+ this.ssn+
                ", Quantity "+this.quantity+
                ", Cost "+this.cost+
                ", Price "+this.price;
    }
}
