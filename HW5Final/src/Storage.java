public class Storage {
     /*
        Name: Mehmet Fatih
        Surname: Erdem
   

        this class represents a storage area for the factory.
    */


    private int capacity; // this keeps the capacity of the Storage object created
    private Item[] items; // It keeps the items put inside the storage

    // constructor
    public Storage(int capacity) {
        this.capacity = capacity;
        items = new Item[capacity]; // initiating and giving the capacity size by default
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    // method to add items to our items array
    public void addItem(Item item) {
        int counter = 0;
        for (int i = 0; i < items.length; i++) {

            // if the item in the items array is not null we increment the counter
            if (items[i] != null) {
                counter++;
            }

            // if the counter is equal to the capacity we increment the capacity
            if (counter == capacity) {
                capacity++;
                Item[] temp = new Item[capacity];
                for (int j = 0; j < items.length; j++) {

                    // assigning items array to temp
                    temp[j] = items[j];
                }
                // assigning temp array to items
                items = temp;
            }
        }
        // lastly adding item to the counter index in the items array
        items[counter] = item;

    }
}
