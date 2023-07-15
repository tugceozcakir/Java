package model;
public class Employee {
    private String name;
    private double salary;
    private int workingHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workingHours > 40) {
            int extraHours = workingHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();

        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Working Hour: " + workingHours + "\n" +
                "Starting year: " + hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Salary Increase: " + raiseSalary() + "\n" +
                "Salary with Taxes and Bonuses: " + (salary - tax() + bonus()) + "\n" +
                "Total Salary: " + totalSalary;
    }

}
