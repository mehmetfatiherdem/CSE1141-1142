public class Payroll {
     /*
        Name: Mehmet Fatih
        Surname: Erdem
       

        this class will represent the payroll of the employees
    */

    private int workHour; // It keeps the number of hours an employee has worked
    private int itemCount; // It keeps the number of items an employee haas produced

    // constructor
    public Payroll(int workHour, int itemCount){
        this.workHour = workHour;
        this.itemCount = itemCount;

    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }



    // it calculates salary of the employee according to the number of hours an employee has worked and the number of items s/he produced.
    public int calculateSalary(){
        int salary = (3 * this.workHour) + (2 * this.itemCount);

        return salary;
    }

    // this will be called in the main method and the string will be displayed
    @Override
    public String toString() {
        return "The work hour is " + this.workHour + " and the produced item count is " + this.itemCount;
    }
}
