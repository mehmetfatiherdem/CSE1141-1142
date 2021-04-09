public class Item {
      /*
        Name: Mehmet Fatih
        Surname: Erdem
      

        Item class will be used to generate employees working for the factory
     */

    private int id; // id will keep the id of the object that will be created
    public static int numberOfItems; // keeps the number of item objects created

    // constructor
    public Item(int id){
        this.id = id;
        numberOfItems++; // incrementing the numberOfItems when a new item is created
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
