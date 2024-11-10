public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary >= 1000){
            return this.salary * 0.03;
        } else return 0;
    }
    double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        } else return 0;
    }
    double raiseSalary(){
        if(2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if ((2021 - this.hireYear) < 20 && (2021 - this.hireYear) > 9){
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    void employeeInfo(){
        System.out.println("=========================");
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Year of hire : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Salary Increase : " + this.raiseSalary());
        System.out.println("Salary with Taxes and Bonuses : " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Total Salary : " + (this.salary + this. raiseSalary() - this.tax() + this.bonus()));
    }
}
