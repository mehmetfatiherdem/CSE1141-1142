public class Factory {
       /*
        Name: Mehmet Fatih
        Surname: Erdem
        ID: 150119054

        this class represents a factory with employees
    */


    private String name; // it represents the name of the factory
    private Employee[] employees; // it represents employees working for the factory
    private Storage storage; // it represents the storage area of the factory
    private Payroll[] payrolls; // it represents the payrolls belonging to the employees
    private double itemPrice; // it represents the price for one item (Suppose that all items have the same price)

    // constructor
    public Factory(String name, int capacity, double itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
        this.storage = new Storage(capacity);
        this.employees = new Employee[0]; // initiating and giving the capacity size of 0 by default
        this.payrolls = new Payroll[0]; // initiating and giving the capacity size of 0 by default
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Payroll[] getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(Payroll[] payrolls) {
        this.payrolls = payrolls;
    }

    // returns the revenue according to the number of items in the storage data field and itemPrice data field
    public double getRevenue() {
        Item[] itemArr = this.storage.getItems();
        int counter = 0;
        for (int i = 0; i < itemArr.length; i++) {
            if (itemArr[i] != null) {
                counter++;
            }
        }
        double revenue = itemPrice * counter;

        return revenue;
    }

    // method calculates the paid salaries of the employees according to the payrolls array
    public double getPaidSalaries() {

        double paidSalaries = 0;
        for (int i = 0; i < payrolls.length; i++) {

            paidSalaries += payrolls[i].calculateSalary();
        }

        System.out.println();
        return paidSalaries;
    }

    // method adds an employee to the employees array
    public void addEmployee(Employee employee) {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            // if the employee in the employees array is not null we increment the counter
            if (employees[i] != null) {
                counter++;
            }
        }

        // if the counter is equal to the employees.length we increment the employees.length
        if (counter == employees.length) {
            Employee[] temp = new Employee[employees.length + 1];
            for (int i = 0; i < employees.length; i++) {
                // assigning employees array to temp
                temp[i] = employees[i];
            }
            // assigning temp array to employees
            employees = temp;
        }

        // lastly adding employee to the counter index in the employees array
        employees[counter] = employee;
        // assigning the array that startshift method returns to items array
        Item[] items = employee.startShift();

        // adding items with out addItem method in the storage
        for (int i = 0; i < items.length; i++) {
            storage.addItem(items[i]);
        }

    }


    //method removes the employee from employees array
    public Employee removeEmployee(int id) {
        int deleteIndex = 0;
        boolean boolVal = false;
        Employee empVal = null;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                // if the employee in the employees array is not null we increment the counter
                counter++;
            }
        }
        if (counter == employees.length) {
            Employee[] temp = new Employee[employees.length + 1];
            for (int i = 0; i < employees.length; i++) {
                // assigning employees array to temp
                temp[i] = employees[i];
            }
            // assigning temp array to employees
            employees = temp;
        }

        // finding the index of the element to be deleted
        for (int i = 0; i < counter; i++) {
            if (employees[i].getId() == id) {
                deleteIndex = i;
                boolVal = true;
                break;
            }
        }


        if (counter == 0) {
            System.out.println("There are no employees!");
            System.out.println();

        } else if (boolVal == false) {
            // employee was not found in the array
            System.out.println("Employee does not exist!");
            System.out.println();
        } else {
            // employee found will be deleted with this loop
            Employee[] temp = new Employee[employees.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if (i < deleteIndex) {
                    temp[i] = employees[i];
                } else if (i == deleteIndex) {
                    continue;
                } else {
                    temp[i - 1] = employees[i];
                }
            }
            empVal = employees[deleteIndex];
            Payroll payrollTemp = empVal.endShift();
            addPayroll(payrollTemp);
            employees = temp;
        }

        return empVal;

    }

    // method adds the payroll passed as the parameter to the payrolls data field
    private void addPayroll(Payroll payroll) {
        int counter = 0;
        for(int i = 0; i<payrolls.length; i++){
            if(payrolls[i] != null){
                // if the payroll in the payrolls array is not null we increment the counter
                counter++;
            }
        }
        // if the counter is equal to the payrolls.length we increment the payrolls.length
        if(counter == payrolls.length){
            Payroll[] temp = new Payroll[payrolls.length+1]; // creating a temp array which has a payrolls.length plus one size
            for(int i = 0; i< payrolls.length; i++){
                // assigning the payrolls array to temp array
                temp[i] = payrolls[i];
            }
            // assigning the temp array to payrolls array
            payrolls = temp;
        }

        // adding payroll to the payrolls array at the counter index
        payrolls[counter] = payroll;
    }
}
