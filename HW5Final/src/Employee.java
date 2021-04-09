public class Employee {
     /* Name: Mehmet Fatih
        Surname: Erdem
        ID: 150119054

        It represents an employee working for the factory
     */

    int id; // it keeps the id number of the Employee object created
    String name; // it keeps the name of the employee
    String surname; // it keeps the surname of the employee
    int workHour; // keeps the number of hours an employee will work
    int speed; // keeps the number of items that the  employee can produce in an hour
    Item[] items; // this array holds the items produced by the employee
    Payroll payroll; // this will keep the payroll of the employee

    // constructor
    public Employee(int id, String name, String surname, int workHour, int speed){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workHour = workHour;
        this.speed = speed;
        this.items = new Item[0]; // initiating the items array with 0 length default
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



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items){
        this.items = items;
    }



    public Payroll getPayroll() {
        return payroll;
    }

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }

    // this method finds how many items this employee should produce according to speed and workHour values.
    public Item[] startShift(){
        int itemsProduced = this.speed * this.workHour;

        Item[] temp = new Item[itemsProduced];

        // generating the ids
        for(int i = 0; i<itemsProduced; i++){
            int id = (int)(Math.random()*100)+1;
            temp[i] = new Item(id);

        }
        items = temp;
        return items;
    }

    // creates a Payroll object with employee’s work hour and the number of items s/he creates.
    public Payroll endShift(){
        this.payroll = new Payroll(workHour, items.length); // assigning the Payroll object to the payroll field
        return payroll;
    }

    // method returns a String with employee’s id and the return value of the payroll object’s toString() method.
    @Override
    public String toString() {
        return "This is the employee with id " + id + " speed " + speed + ". The work hour is " + getWorkHour() +
                " and the produced item count is " + items.length+"." + "\n";
    }
}
